package com.wei.dao;

import com.wei.model.user.UserModel;
import com.wei.model.user.UserModelVM;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author wei.peng
 * @descripe SpringBootProject
 * @Date 2019/7/2 0002.
 */
@Mapper
public interface UserDao {

    /**
     *  查询用户信息
     * @param vm
     * @return
     * @throws DataAccessException
     */
    UserModel selectUser(UserModelVM vm) throws DataAccessException;

    /**
     *  删除用户信息
     * @param vm
     * @return
     * @throws DataAccessException
     */
    int deleteUser(UserModelVM vm) throws DataAccessException;

    /**
     *  修改用户信息
     * @param model
     * @return
     * @throws DataAccessException
     */
    int updateUser(UserModel model) throws DataAccessException;

    /**
     *  插入用户信息
     * @param model
     * @return
     * @throws DataAccessException
     */
    int insertUser(UserModel model) throws DataAccessException;

    /**
     * 修改密码
     * @param vm
     * @return
     */
    int updatePassword(UserModelVM vm)throws DataAccessException;

    /**
     * 查询用户列表
     * @param vm
     * @return
     */
    List<UserModel> selectUserList(UserModelVM vm);
}
