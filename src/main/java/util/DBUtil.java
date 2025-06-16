package util;


import java.util.HashMap;
import pojo.UserBean;

public class DBUtil {
    private static DBUtil instance = new DBUtil();
    private HashMap<String, UserBean> users = new HashMap<>();

    private DBUtil() {
        UserBean user1 = new UserBean();
        user1.setName("Jack");
        user1.setPassword("12345678");
        user1.setEmail("jack@it315.org");
        users.put("Jack", user1);

        UserBean user2 = new UserBean();
        user2.setName("Rose");
        user2.setPassword("abcde6fg");
        user2.setEmail("rose@it315.org");
        users.put("Rose", user2);
    }

    public static DBUtil getInstance() {
        return instance;
    }

    public UserBean getUser(String userName) {
        return users.get(userName);
    }

    public boolean insertUser(UserBean user) {
        if (user == null) return false;
        String userName = user.getName();
        if (users.get(userName) != null) return false;
        users.put(userName, user);
        return true;
    }
}
