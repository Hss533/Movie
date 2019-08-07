package com.stylefeng.guns.rest.common;

import com.stylefeng.guns.api.user.UserInfoModel;
import com.stylefeng.guns.api.user.UserModel;

public class CurrentUser {
    private static final ThreadLocal<String> threadLocal=new ThreadLocal<>();

    //用户信息放入存储空间可能会占用内存比较大  所以最好的是将用户id放入ThreadLocal
    public static void saveUserId(String userId){
        threadLocal.set(userId);
    }

    public static String getUserInfo(){
        return threadLocal.get();
    }
   /* public static void saveUserInfo(UserInfoModel userInfoModel){
        threadLocal.set(userInfoModel);
    }

    public static UserInfoModel getUserInfo(){
       return threadLocal.get();
    }*/

    //clear 可加可不加

}
