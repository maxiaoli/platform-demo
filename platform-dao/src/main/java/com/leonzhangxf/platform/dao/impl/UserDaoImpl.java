package com.leonzhangxf.platform.dao.impl;

import com.leonzhangxf.platform.dao.UserDao;
import com.leonzhangxf.platform.dao.mapper.UserMapper;
import com.leonzhangxf.platform.domain.UserDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * The basic implement of user dao interface.
 *
 * @author leonzhangxf 20180808
 */
@Repository
public class UserDaoImpl implements UserDao {

    private UserMapper userMapper;

    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public List<UserDO> listUsers() {
        return userMapper.selectByExample(null);
    }
}
