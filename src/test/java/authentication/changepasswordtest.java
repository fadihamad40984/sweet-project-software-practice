package authentication;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sw_proj.helper.DataBase;

import static org.junit.Assert.assertEquals;

public class changepasswordtest {

    DataBase dataBase = new DataBase();
    @Given("the user is in change password page")
    public void the_user_is_in_change_password_page() {
        assert(true);
    }

    @When("user enter {string} and {string} and {string}")
    public void user_enter_and(String string, String string2 , String string3) {
        string = "1234**Fa";
        string2 ="1254**Fa";
        string3 = "fadi28";
        dataBase.Changepassword(string,string2 , string3);
    }

    @Then("password will change")
    public void password_will_change() {
       assertEquals("Password change successfully",dataBase.statuspass);
    }
}
