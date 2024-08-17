package sw_proj.authentication;

import sw_proj.helper.DataBase;
import sw_proj.usermanagement.User;
import sw_proj.helper.UserSession;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Objects;

public class Login {
    private String status;
    DataBase dataBase = new DataBase();
    private String userType;
    public Login( ) {

    }

    public String getStatus() {
        return status;
    }


    public void setStatus(String status) {
        this.status = status;
    }

    public void loginUser(String username, String password) throws SQLException {
        List<User> users =  dataBase.loadUsersFromFile("Users.json");

        for (User user : users) {
            if (Objects.equals(username, user.getUsername())) {
                if (Objects.equals(password, user.getPassword())) {
                    setStatus("Valid username and password");
                    return;
                }
            }
        }
        setStatus("Invalid username or password");

    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}
