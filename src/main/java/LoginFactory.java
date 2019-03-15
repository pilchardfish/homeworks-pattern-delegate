import java.util.HashMap;

/**
 * Created by IntelliJ IDEA.
 * User: pilchard
 * Date: 2019-03-15
 * Time: 17:20
 * To change this template use File | Settings | File Templates.
 */
public class LoginFactory {

    private static final HashMap<String,Login> LOGIN_HASH_MAP=new HashMap<String, Login>();
    static {
        LOGIN_HASH_MAP.put("QQ",new QQLogin());
        LOGIN_HASH_MAP.put("WECHAT",new QQLogin());
        LOGIN_HASH_MAP.put("USERPWD",new UserPwdLogin());
    }
    public static Login getLoginType(String name){
        if(LOGIN_HASH_MAP.containsKey(name)){
            return LOGIN_HASH_MAP.get(name);
        }else{
            return new EmptyLogin();
        }
    }
}
