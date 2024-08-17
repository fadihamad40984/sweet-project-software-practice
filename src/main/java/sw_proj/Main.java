package sw_proj;


import sw_proj.helper.DataBase;
import sw_proj.helper.Dessert;
import sw_proj.helper.PDFGenerator;
import sw_proj.usermanagement.User;

import java.util.List;

public class Main {
    public static void main(String[] args) {


        PDFGenerator pdfGenerator = new PDFGenerator();

        User user = new User();
        DataBase dataBase = new DataBase();


        List<User> alluser = dataBase.loadUsersFromFile("Users.json");
        pdfGenerator.generateAndDisplayPDF(alluser);


    }
}