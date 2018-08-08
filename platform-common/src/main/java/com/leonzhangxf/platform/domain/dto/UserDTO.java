package com.leonzhangxf.platform.domain.dto;

import com.leonzhangxf.platform.domain.UserDO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.BeanUtils;
import org.springframework.util.CollectionUtils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

@ApiModel("用户信息")
public class UserDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty
    private Integer id;

    @ApiModelProperty("用户姓名")
    private String name;

    @ApiModelProperty("用户年龄")
    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDTO userDTO = (UserDTO) o;
        return Objects.equals(id, userDTO.id) &&
                Objects.equals(name, userDTO.name) &&
                Objects.equals(age, userDTO.age);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, age);
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static UserDTO convertUserDO(UserDO userDO) {
        if (null == userDO) return null;

        UserDTO userDTO = new UserDTO();
        BeanUtils.copyProperties(userDO, userDTO);
        return userDTO;
    }

    public static List<UserDTO> convertUserDOs(List<UserDO> userDOList) {
        if (CollectionUtils.isEmpty(userDOList))
            return Collections.EMPTY_LIST;

        List<UserDTO> userDTOList = new ArrayList<>();
        for (UserDO userDO : userDOList) {
            UserDTO userDTO = UserDTO.convertUserDO(userDO);
            userDTOList.add(userDTO);
        }
        return userDTOList;
    }
}
