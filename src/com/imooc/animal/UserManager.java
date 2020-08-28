package com.imooc.animal;

public class UserManager {
    // 用户信息验证的方法

    /**
     * 用户的用户名和密码比较
     * @param u1 第一个用户
     * @param u2 第二个用户
     * @return 返回比较结果(字符串)
     */
    public String checkUser(User u1, User u2) {
        // 判断用户名和密码是否为空，是否一致
        if(u1.getName()==null||u1.getPassword()==null||u2.getName()==null||u2.getPassword()==null){
            return "用户名和密码不能为空";
        }else{
            if(u1.equals(u2))
                return "用户名和密码一致";
            else
                return "用户名和密码不一致";
        }
    }
}
