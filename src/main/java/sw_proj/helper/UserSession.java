package sw_proj.helper;



import sw_proj.usermanagement.User;


public class UserSession {
    private static String sessionId;
    private static User currentUser;


    public static String getSessionId() {
        return sessionId;
    }

    public static void setSessionId(String sessionId) {
        UserSession.sessionId = sessionId;
    }

    public static User getCurrentUser() {
        return new User(currentUser);
    }

    public static void setCurrentUser(User currentUser) {
        UserSession.currentUser = new User(currentUser);
    }




    @Override
    public String toString() {
        return "Classes.UserSession{" + currentUser.getUsername() + ": " +
                "sessionId='" + sessionId + '\'' +
                '}';
    }
}