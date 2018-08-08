package com.leonzhangxf.platform.dao.mapper;

import com.leonzhangxf.platform.domain.UserExtendDO;
import com.leonzhangxf.platform.domain.UserExtendDOCriteria;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface UserExtendMapper {
    /**
     *
     * @mbg.generated 2018-08-08
     */
    @SelectProvider(type=UserExtendSqlProvider.class, method="countByExample")
    long countByExample(UserExtendDOCriteria example);

    /**
     *
     * @mbg.generated 2018-08-08
     */
    @DeleteProvider(type=UserExtendSqlProvider.class, method="deleteByExample")
    int deleteByExample(UserExtendDOCriteria example);

    /**
     *
     * @mbg.generated 2018-08-08
     */
    @Delete({
        "delete from user_extend",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-08-08
     */
    @Insert({
        "insert into user_extend (id, user_id, ",
        "`desc`)",
        "values (#{id,jdbcType=INTEGER}, #{userId,jdbcType=INTEGER}, ",
        "#{desc,jdbcType=VARCHAR})"
    })
    int insert(UserExtendDO record);

    /**
     *
     * @mbg.generated 2018-08-08
     */
    @InsertProvider(type=UserExtendSqlProvider.class, method="insertSelective")
    int insertSelective(UserExtendDO record);

    /**
     *
     * @mbg.generated 2018-08-08
     */
    @SelectProvider(type=UserExtendSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="desc", property="desc", jdbcType=JdbcType.VARCHAR)
    })
    List<UserExtendDO> selectByExample(UserExtendDOCriteria example);

    /**
     *
     * @mbg.generated 2018-08-08
     */
    @Select({
        "select",
        "id, user_id, `desc`",
        "from user_extend",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="desc", property="desc", jdbcType=JdbcType.VARCHAR)
    })
    UserExtendDO selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-08-08
     */
    @UpdateProvider(type=UserExtendSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") UserExtendDO record, @Param("example") UserExtendDOCriteria example);

    /**
     *
     * @mbg.generated 2018-08-08
     */
    @UpdateProvider(type=UserExtendSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") UserExtendDO record, @Param("example") UserExtendDOCriteria example);

    /**
     *
     * @mbg.generated 2018-08-08
     */
    @UpdateProvider(type=UserExtendSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UserExtendDO record);

    /**
     *
     * @mbg.generated 2018-08-08
     */
    @Update({
        "update user_extend",
        "set user_id = #{userId,jdbcType=INTEGER},",
          "`desc` = #{desc,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(UserExtendDO record);
}