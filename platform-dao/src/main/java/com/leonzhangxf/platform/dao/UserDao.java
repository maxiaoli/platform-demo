package com.leonzhangxf.platform.dao;

import com.leonzhangxf.platform.domain.UserDO;

import java.util.List;

/**
 * The user dao interface.
 *
 * @author leonzhangxf 20180808
 */
public interface UserDao {

    List<UserDO> listUsers();
}
