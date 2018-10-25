package com.hzhetun.example.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.hzhetun.example.pojo.SystemUser;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author cbk
 * @date 2017/12/23
 */

@Repository
public interface SystemUserMapper extends BaseMapper<SystemUser> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_user
     *
     * @mbg.generated
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_user
     *
     * @mbg.generated
     */
//    int insert(SystemUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_user
     *
     * @mbg.generated
     * @param record
     * @return int
     */
    int insertSelective(SystemUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_user
     *
     * @mbg.generated
     * @param id
     * @return SystemUser
     */
    SystemUser selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_user
     *
     * @mbg.generated
     * @param record
     * @return int
     */
    int updateByPrimaryKeySelective(SystemUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_user
     *
     * @mbg.generated
     * @param record
     * @return int
     */
    int updateByPrimaryKey(SystemUser record);

    /**
     * 根据用户名和密码查询用户信息
     * @param systemUser
     * @return SystemUser
     */
    SystemUser getSystemUser(SystemUser systemUser);

    /**
     * 用户列表信息查询方法
     * @param map
     * @return List<SystemUser>
     */
    List<SystemUser> findUserList(Map<String, Object> map);

    /**
     * 用户列表记录总数的查询方法
     * @param map
     * @return Long
     */
    Long count(Map<String, Object> map);

    /**
     * 根据条件动态查询
     * @param systemUser
     * @return SystemUser
     */
    SystemUser findByCondition(SystemUser systemUser);
}