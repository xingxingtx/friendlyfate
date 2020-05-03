package com.wei.service.impl;

import com.wei.dao.UserDao;

import com.wei.exception.UserBusinessException;
import com.wei.model.user.UserModel;
import com.wei.model.user.UserModelVM;
import com.wei.service.IUserService;

import com.wei.util.StringCommonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @author wei.peng
 * @descripe SpringBootProject
 * @Date 2019/7/2 0002.
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserDao userDao;

    @Override
    public UserModel selectUser(UserModelVM vm) {
        System.out.println("ssss");
        return userDao.selectUser(vm);
    }

    @Override
    public int deleteUser(UserModelVM vm) throws DataAccessException {
        return userDao.deleteUser(vm);
    }

    @Override
    public int updateUser(UserModel model) throws DataAccessException {
        return userDao.updateUser(model);
    }

    @Override
    public int insertUser(UserModel model) throws DataAccessException {
        return userDao.insertUser(model);
    }

    @Override
    public int updatePassword(UserModelVM vm) {
        String errorMessage =  validatePassword(vm);
        if(!StringUtils.isEmpty(errorMessage)){
            throw new UserBusinessException(errorMessage);
        }
        return userDao.updatePassword(vm);
    }

    @Override
    public List<UserModel> selectUserList(UserModelVM vm) throws DataAccessException {
        return userDao.selectUserList(vm);
    }

    @Override
    public UserModel loginUser(UserModelVM vm) throws DataAccessException {
        return null;
    }

    @Override
    public String findPassword(UserModelVM vm) throws DataAccessException {
        return null;
    }

    @Override
    public int informationComplement(UserModelVM vm) {
        return 0;
    }


    /**
     * 校验密码修改规则
     * @param vm
     */
    private String validatePassword(UserModelVM vm) {
        String result = null;
        if(!StringCommonUtils.lengthValidate(vm.getPassword(), 6, 20)){
            result = "密码长度应该在6-20字符";
        }
        /**查询密码是否与原密码一致*/
        UserModel user = userDao.selectUser(vm);
        if(!StringUtils.isEmpty(vm.getPassword()) && vm.getPassword().equals(user.getPassword())){
            result = "与原密码一致";
        }
        return result;
    }


}
