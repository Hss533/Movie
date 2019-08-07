package com.stylefeng.guns.api.user;

/**
 * 需要暴露的接口都放在公共的API中
 * 然后再gateway中去引用它
 */
public interface UserAPI
{

    /**
     *
     * @param username
     * @param pass
     * @return
     */
    int login(String username, String pass);

    boolean register(UserModel userModel);

    boolean checkUsername(String username);


    UserInfoModel getUserInfo(int uuid);

    UserInfoModel updateUserInfo(UserInfoModel userInfoModel);


}
