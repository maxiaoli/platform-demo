package com.leonzhangxf.platform.service.impl;

import com.leonzhangxf.platform.dao.UserDao;
import com.leonzhangxf.platform.domain.dto.UserDTO;
import com.leonzhangxf.platform.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The basic implement of user service.
 *
 * @author leonzhangxf 20180807
 */
@Service
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<UserDTO> listUsers() {
        return UserDTO.convertUserDOs(userDao.listUsers());
    }
}
