package authentication;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sw_proj.helper.DataBase;
import sw_proj.helper.Dessert;

import java.sql.SQLException;

import static org.junit.Assert.assertEquals;

public class adddesserttest {

    DataBase dataBase = new DataBase();

    Dessert dessert = new Dessert();
    Dessert ManageDessert = new Dessert();

    @When("user is in Add-Dessert page")
    public void user_is_in_add_dessert_page() {
        assert(true);
    }

    @When("he fills in {string} with {string} for Dessert")
    public void he_fills_in_with_for_dessert(String string, String string2) {
        switch (string) {
            case "name" -> dessert.setName(string2);
            case "type" -> dessert.setType(string2);
            case "price" -> dessert.setPrice(string2);
            default -> {
                assert (false);
            }
        }
        assert(true);
    }

    @When("he submits the addition form")
    public void he_submits_the_addition_form() throws SQLException {
        ManageDessert.addDessert(dessert);
    }

    @Then("he should see {string} for addition")
    public void he_should_see_for_addition(String string) {
        assertEquals("Dessert added successfully" , ManageDessert.getStatus());
    }

}
