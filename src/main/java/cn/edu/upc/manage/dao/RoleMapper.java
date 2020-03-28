package cn.edu.upc.manage.dao;

import cn.edu.upc.manage.model.Role;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface RoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role
     *
     * @mbg.generated Thu Mar 19 17:12:38 CST 2020
     */
    int deleteByPrimaryKey(Integer id);
    Role selectRoles(Integer id);

    int setdelFlag(Role role);
    List<Role> selectAllRole();
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role
     *
     * @mbg.generated Thu Mar 19 17:12:38 CST 2020
     */
    int insert(Role record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role
     *
     * @mbg.generated Thu Mar 19 17:12:38 CST 2020
     */
    int insertSelective(Role record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role
     *
     * @mbg.generated Thu Mar 19 17:12:38 CST 2020
     */
    Role selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role
     *
     * @mbg.generated Thu Mar 19 17:12:38 CST 2020
     */
    int updateByPrimaryKeySelective(Role record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role
     *
     * @mbg.generated Thu Mar 19 17:12:38 CST 2020
     */
    int updateByPrimaryKey(Role record);
}