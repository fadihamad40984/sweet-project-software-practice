package authentication;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sw_proj.helper.Post;

import java.sql.SQLException;

import static org.junit.Assert.assertEquals;

public class sharedesserttest {

    public Post post = new Post();
    public Post managePost = new Post();


    @When("user is in share-Dessert page")
    public void user_is_in_share_dessert_page() {
        assert(true);
    }

    @When("he fills in {string} with {string} for post")
    public void he_fills_in_with_for_post(String string, String string2) {
        switch (string) {
            case "title" -> post.setTitle(string2);
            case "description" -> post.setDes(string2);
            case "image" ->  post.setImg(string2);
            default -> {
                assert (false);
            }
        }
        assert(true);
    }

    @When("he submits the post button")
    public void he_submits_the_post_button() throws SQLException {
        managePost.sharePost(post);
    }

    @Then("he should see {string} for post")
    public void he_should_see_for_post(String string) {

        assertEquals(managePost.getStatus() , string);
    }

}
