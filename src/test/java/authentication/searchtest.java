package authentication;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sw_proj.helper.Dessert;

import java.sql.SQLException;

import static org.junit.Assert.assertEquals;

public class searchtest {

    public String name;
    public String filter;
    Dessert dessert = new Dessert();
    @When("user is in search-Dessert page")
    public void user_is_in_search_dessert_page() {
        assert(true);
    }

    @When("he fills in {string} with {string} for search")
    public void he_fills_in_with_for_search(String string, String string2) {
        switch (string) {
            case "name" -> name = string2;
            case "filter" -> filter = string2;
            default -> {
                assert (false);
            }
        }
        assert(true);
    }

    @When("he submits the search form")
    public void he_submits_the_search_form() throws SQLException {
        dessert.search_filter(name,filter);
    }

    @Then("he should see {string} for search")
    public void he_should_see_for_search(String string) {
       assertEquals(string,dessert.getStatussearch());
    }
}
