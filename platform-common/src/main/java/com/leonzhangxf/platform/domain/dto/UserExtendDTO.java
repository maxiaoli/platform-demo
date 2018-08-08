package com.leonzhangxf.platform.domain.dto;

import com.leonzhangxf.platform.domain.UserExtendDO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.BeanUtils;
import org.springframework.util.CollectionUtils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

@ApiModel("用户扩展信息")
public class UserExtendDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty
    private Integer id;

    @ApiModelProperty("用户ID")
    private Integer userId;

    @ApiModelProperty("用户描述")
    private String desc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserExtendDTO that = (UserExtendDTO) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(desc, that.desc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, desc);
    }

    @Override
    public String toString() {
        return "UserExtendDTO{" +
                "id=" + id +
                ", userId=" + userId +
                ", desc='" + desc + '\'' +
                '}';
    }

    public static UserExtendDTO convertUserExtendDO(UserExtendDO userExtendDO) {
        if (null == userExtendDO) return null;

        UserExtendDTO userExtendDTO = new UserExtendDTO();
        BeanUtils.copyProperties(userExtendDO, userExtendDTO);
        return userExtendDTO;
    }

    public static List<UserExtendDTO> convertUserDOs(List<UserExtendDO> userExtendDOs) {
        if (CollectionUtils.isEmpty(userExtendDOs))
            return Collections.EMPTY_LIST;

        List<UserExtendDTO> userExtendDTOs = new ArrayList<>();
        for (UserExtendDO userExtendDO : userExtendDOs) {
            UserExtendDTO userExtendDTO = UserExtendDTO.convertUserExtendDO(userExtendDO);
            userExtendDTOs.add(userExtendDTO);
        }
        return userExtendDTOs;
    }
}
