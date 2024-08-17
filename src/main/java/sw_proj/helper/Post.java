package sw_proj.helper;

import java.sql.SQLException;

public class Post {

    private String title;
    private String des;
    private String img;
    private String status;

    public DataBase dataBase = new DataBase();





    public void sharePost(Post post) throws SQLException {
        dataBase.savePostToFile("Posts.json",post);
        setStatus("Post share successfully");
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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
