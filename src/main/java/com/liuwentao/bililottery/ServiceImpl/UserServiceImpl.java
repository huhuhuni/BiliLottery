package com.liuwentao.bililottery.ServiceImpl;import com.liuwentao.bililottery.Entity.UserModel;import com.liuwentao.bililottery.Service.UserService;import com.liuwentao.bililottery.mappers.UserModelMapper;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.stereotype.Service;/** * Created by liuwentao on 2021/9/12 21:28 */@Servicepublic class UserServiceImpl implements UserService {    @Autowired    UserModelMapper userModelMapper;    @Override    public UserModel findUserByOpenId(String openId) {        return userModelMapper.findUserByOpenId(openId);    }    @Override    public boolean insertUser(UserModel userModel) {        return userModelMapper.insertUserModel(userModel);    }}