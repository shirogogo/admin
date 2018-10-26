package com.hzhetun.example.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.hzhetun.example.pojo.SystemUserRole;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author cbk
 * @date 2017/12/23
 */
@Repository
public interface SystemUserRoleMapper extends BaseMapper<SystemUserRole>{
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_user_role
     *
     * @mbg.generated
     * @param id
     * @return int
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_user_role
     *
     * @mbg.generated
     *
     */
//    int insert(SystemUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_user_role
     *
     * @mbg.generated
     * @param record
     * @return int
     */
    int insertSelective(SystemUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_user_role
     *
     * @mbg.generated
     * @param id
     * @return SystemUserRole
     */
    SystemUserRole selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_user_role
     *
     * @mbg.generated
     * @param record
     * @return int
     */
    int updateByPrimaryKeySelective(SystemUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_user_role
     *
     * @mbg.generated
     * @param record
     * @return int
     */
    int updateByPrimaryKey(SystemUserRole record);

    /**
     * 查询某个人对应的角色方法
     * @param userId
     * @return List<Map<String,Object>>
     */
    List<Map<String,Object>> findByUserId(int userId);
}