package pojo;


public class Username {
    String regx = "[a-zA-Z]";
    String regx1 = "[a-zA-Z0-9_]";
    String username;
    Boolean isval;
    String tip;

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getUsername() {
        return username;
    }

    public void setIsval(Boolean isval) {
        this.isval = isval;
    }

    public Boolean getIsval() {
        return isValid();
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isValid() {
        String name = getUsername();
        if (name == null || name.length() == 0) {
            setTip("用户名不能为空！");
            return false;
        }

        // 判断首字符是否是字母
        char first = name.charAt(0);
        String firstChar = String.valueOf(first);
        if (!firstChar.matches(regx)) {
            setTip("用户名首字符必须为字母！");
            return false;
        }

        // 判断剩余字符是否合法
        for (int i = 0; i < name.length(); i++) {
            String c = String.valueOf(name.charAt(i));
            if (!c.matches(regx1)) {
                setTip("用户名只能由字母、数字和下划线组成！");
                return false;
            }
        }

        setTip("用户名合法！");
        return true;
    }
}
