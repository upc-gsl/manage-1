package cn.edu.upc.manage.dao;

import cn.edu.upc.manage.model.ViewGroupUser;
import cn.edu.upc.manage.model.ViewGroupUserNew;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author zhenwei
 * @date 2020/3/20
 */
public interface ViewGroupUserMapper {
    /**
     * 获取某个项目小组信息
     *
     * @param id
     * @return
     */
    List<ViewGroupUser> selectByPrimaryKey(Integer id);
    /**
     * 获取某个项目小组信息
     *
     * @param ProjectId
     * @return
     */
    List<ViewGroupUser> getGroupUser(Integer ProjectId);
    /**
     * 获取项目小组信息
     *
     * @param projectId
     * @return
     */



    /**
     * 获取某个项目小组信息
     * 加report信息
     *
     * @param projectId
     * @param groupId
     * @param userId
     * @return
     */
    ViewGroupUserNew getProjectDetail(@Param("projectId") Integer projectId,
                                      @Param("groupId") Integer groupId, @Param("userId") Integer userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_group_user
     *
     * @mbg.generated Fri Mar 20 23:11:58 CST 2020
     */
    int insert(ViewGroupUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_group_user
     *
     * @mbg.generated Fri Mar 20 23:11:58 CST 2020
     */
    int insertSelective(ViewGroupUser record);
}