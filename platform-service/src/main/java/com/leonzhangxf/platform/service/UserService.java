package com.leonzhangxf.platform.service;

import com.leonzhangxf.platform.domain.dto.UserDTO;

import java.util.List;

/**
 * The user service.
 *
 * @author leonzhangxf 20180807
 */
public interface UserService {

    List<UserDTO> listUsers();
}
