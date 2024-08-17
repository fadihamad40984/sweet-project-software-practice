package admin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sw_proj.usermanagement.User;

import static org.junit.Assert.assertEquals;

public class deleteusertest {

    public String username;

    public User user = new User();
    @Given("I am in delete page")
    public void i_am_in_delete_page() {
        assert(true);
    }

    @When("I enter {string} the value {string}")
    public void i_enter_the_value(String string, String string2) {
        if (string.equals("User_Name")) {
            username = string2;
        } else {
            assert (false);
        }
        assert(true);
    }

    @When("click delete")
    public void click_delete() {
        user.deleteuser(username);
    }

    @Then("A {string} must beee appear")
    public void a_must_beee_appear(String string) {
        assertEquals(string,user.getStatus());
    }
}
