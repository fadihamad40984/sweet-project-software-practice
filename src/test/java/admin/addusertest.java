package admin;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sw_proj.authentication.Register;
import sw_proj.usermanagement.User;

import java.sql.SQLException;

import static org.junit.Assert.assertEquals;

public class addusertest {

    User user = new User();
    Register register = new Register();

    @When("admin is in add-user page")
    public void admin_is_in_add_user_page() {
        assert(true);
    }

    @When("he fills in {string} with {string} for user")
    public void he_fills_in_with_for_user(String field, String value) {
        switch (field) {
            case "username" -> user.setUsername(value);
            case "firstName" -> user.setFirstName(value);
            case "lastName" -> user.setLastName(value);
            case "phoneNumber" -> user.setPhoneNumber(value);
            case "password" -> user.setPassword(value);
            case "email" -> user.setEmail(value);
            case "userType" -> user.setUserType(value);
            default -> {
                assert (false);
            }
        }
        assert(true);
    }

    @When("he submits the user form")
    public void he_submits_the_user_form() throws SQLException {
        register.registerUser(user);
    }

    @Then("he should see {string} for user")
    public void he_should_see_for_user(String string) {
       assertEquals(string , register.getStatus());
    }

}
