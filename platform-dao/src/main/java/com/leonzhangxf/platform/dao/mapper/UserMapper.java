package com.leonzhangxf.platform.dao.mapper;

import com.leonzhangxf.platform.domain.UserDO;
import com.leonzhangxf.platform.domain.UserDOCriteria;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface UserMapper {
    /**
     *
     * @mbg.generated 2018-08-08
     */
    @SelectProvider(type=UserSqlProvider.class, method="countByExample")
    long countByExample(UserDOCriteria example);

    /**
     *
     * @mbg.generated 2018-08-08
     */
    @DeleteProvider(type=UserSqlProvider.class, method="deleteByExample")
    int deleteByExample(UserDOCriteria example);

    /**
     *
     * @mbg.generated 2018-08-08
     */
    @Delete({
        "delete from user",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-08-08
     */
    @Insert({
        "insert into user (id, `name`, ",
        "age)",
        "values (#{id,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, ",
        "#{age,jdbcType=INTEGER})"
    })
    int insert(UserDO record);

    /**
     *
     * @mbg.generated 2018-08-08
     */
    @InsertProvider(type=UserSqlProvider.class, method="insertSelective")
    int insertSelective(UserDO record);

    /**
     *
     * @mbg.generated 2018-08-08
     */
    @SelectProvider(type=UserSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="age", property="age", jdbcType=JdbcType.INTEGER)
    })
    List<UserDO> selectByExample(UserDOCriteria example);

    /**
     *
     * @mbg.generated 2018-08-08
     */
    @Select({
        "select",
        "id, `name`, age",
        "from user",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="age", property="age", jdbcType=JdbcType.INTEGER)
    })
    UserDO selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-08-08
     */
    @UpdateProvider(type=UserSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") UserDO record, @Param("example") UserDOCriteria example);

    /**
     *
     * @mbg.generated 2018-08-08
     */
    @UpdateProvider(type=UserSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") UserDO record, @Param("example") UserDOCriteria example);

    /**
     *
     * @mbg.generated 2018-08-08
     */
    @UpdateProvider(type=UserSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UserDO record);

    /**
     *
     * @mbg.generated 2018-08-08
     */
    @Update({
        "update user",
        "set `name` = #{name,jdbcType=VARCHAR},",
          "age = #{age,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(UserDO record);
}