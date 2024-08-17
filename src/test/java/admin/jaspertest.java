package admin;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sw_proj.helper.DataBase;
import sw_proj.helper.PDFGenerator;
import sw_proj.usermanagement.User;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class jaspertest {
    PDFGenerator pdfGenerator = new PDFGenerator();

    User user = new User();
    DataBase dataBase = new DataBase();

    @When("Admin press to show Report")
    public void admin_press_to_show_report() {
        assert(true);
    }

    @Then("Pdf file will generated")
    public void pdf_file_will_generated()  {
        List<User> alluser = dataBase.loadUsersFromFile("Users.json");
        pdfGenerator.generateAndDisplayPDF(alluser);
    }

    @Then("{string} should be appear")
    public void should_be_appear(String string) {
        assert(true);
    }
}
