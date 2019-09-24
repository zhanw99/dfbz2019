package cn.day14_2.test2;

public class Test3  {
    public static void main(String[] args) throws LoginException {
        try{
            login("admin","admin1");
        }catch(LoginException e){
            e.printStackTrace();
        }
    }
    public static void login(String name, String pwd)throws LoginException{
        if (!name.equals("admin")){
            throw new LoginException("用户名不存在");
        }else if (!pwd.equals("admin")){
            throw new LoginException("密码错误");
        }else {
            System.out.println("用户："+name+"登陆成功");
        }
    }
}

class LoginException extends Exception{
    public LoginException() {
    }

    public LoginException(String message) {
        super(message);
    }
}
