package sw_proj.helper;

import java.sql.SQLException;

public class message {

    private String title;
    private String des;
    private String status;

    public DataBase dataBase = new DataBase();





    public void sendmessage(message message) throws SQLException {
        dataBase.savemessageToFile("Messages.json",message);
        setStatus("message send successfully");
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
