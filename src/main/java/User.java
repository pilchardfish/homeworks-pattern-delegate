/**
 * Created by IntelliJ IDEA.
 * User: pilchard
 * Date: 2019-03-15
 * Time: 17:27
 * To change this template use File | Settings | File Templates.
 */
public class User {
    public User(String loginType){
        this.loginType=loginType;
    }
    private String name;
    private String loginType;
    public void login(){
        LoginFactory.getLoginType(this.getLoginType()).login();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoginType() {
        return loginType;
    }

    public void setLoginType(String loginType) {
        this.loginType = loginType;
    }
}
