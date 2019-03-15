/**
 * Created by IntelliJ IDEA.
 * User: pilchard
 * Date: 2019-03-15
 * Time: 17:25
 * To change this template use File | Settings | File Templates.
 */
public class EmptyLogin implements Login {
    public boolean login() {
        System.out.println("非法登录！");
        return false;
    }
}
