package authentication;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sw_proj.helper.message;

import java.sql.SQLException;

import static org.junit.Assert.assertEquals;

public class communicatetest {

    message message = new message();
    message managemessage = new message();


    @Given("user is in communicate page")
    public void user_is_in_communicate_page() {
       assert(true);
    }

    @When("he fills in {string} with {string} for message")
    public void he_fills_in_with_for_message(String string, String string2) {
        switch (string) {
            case "title" -> message.setTitle(string2);
            case "description" -> message.setDes(string2);
            default -> {
                assert (false);
            }
        }
        assert(true);
    }

    @When("user clicks on send")
    public void user_clicks_on_send() throws SQLException {
        managemessage.sendmessage(message);
    }

    @Then("user should see {string} for message")
    public void user_should_see_for_message(String string) {
       assertEquals(string,managemessage.getStatus());
    }
}
