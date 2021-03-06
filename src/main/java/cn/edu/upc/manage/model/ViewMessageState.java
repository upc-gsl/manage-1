package cn.edu.upc.manage.model;

import java.util.Date;

public class ViewMessageState {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_message_state.id
     *
     * @mbg.generated Thu Mar 19 18:18:19 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_message_state.project_id
     *
     * @mbg.generated Thu Mar 19 18:18:19 CST 2020
     */
    private Integer projectId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_message_state.project_name
     *
     * @mbg.generated Thu Mar 19 18:18:19 CST 2020
     */
    private String projectName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_message_state.type
     *
     * @mbg.generated Thu Mar 19 18:18:19 CST 2020
     */
    private Integer type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_message_state.receiver
     *
     * @mbg.generated Thu Mar 19 18:18:19 CST 2020
     */
    private Integer receiver;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_message_state.reader
     *
     * @mbg.generated Thu Mar 19 18:18:19 CST 2020
     */
    private String reader;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_message_state.create_time
     *
     * @mbg.generated Thu Mar 19 18:18:19 CST 2020
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_message_state.del_flag
     *
     * @mbg.generated Thu Mar 19 18:18:19 CST 2020
     */
    private Integer delFlag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_message_state.operator
     *
     * @mbg.generated Thu Mar 19 18:18:19 CST 2020
     */
    private String operator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_message_state.operator_ip
     *
     * @mbg.generated Thu Mar 19 18:18:19 CST 2020
     */
    private String operatorIp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_message_state.operator_time
     *
     * @mbg.generated Thu Mar 19 18:18:19 CST 2020
     */
    private Date operatorTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_message_state.user_id
     *
     * @mbg.generated Thu Mar 19 18:18:19 CST 2020
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_message_state.state
     *
     * @mbg.generated Thu Mar 19 18:18:19 CST 2020
     */
    private Long state;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_message_state.content
     *
     * @mbg.generated Thu Mar 19 18:18:19 CST 2020
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_message_state.id
     *
     * @return the value of view_message_state.id
     *
     * @mbg.generated Thu Mar 19 18:18:19 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_message_state.id
     *
     * @param id the value for view_message_state.id
     *
     * @mbg.generated Thu Mar 19 18:18:19 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_message_state.project_id
     *
     * @return the value of view_message_state.project_id
     *
     * @mbg.generated Thu Mar 19 18:18:19 CST 2020
     */
    public Integer getProjectId() {
        return projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_message_state.project_id
     *
     * @param projectId the value for view_message_state.project_id
     *
     * @mbg.generated Thu Mar 19 18:18:19 CST 2020
     */
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_message_state.project_name
     *
     * @return the value of view_message_state.project_name
     *
     * @mbg.generated Thu Mar 19 18:18:19 CST 2020
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_message_state.project_name
     *
     * @param projectName the value for view_message_state.project_name
     *
     * @mbg.generated Thu Mar 19 18:18:19 CST 2020
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_message_state.type
     *
     * @return the value of view_message_state.type
     *
     * @mbg.generated Thu Mar 19 18:18:19 CST 2020
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_message_state.type
     *
     * @param type the value for view_message_state.type
     *
     * @mbg.generated Thu Mar 19 18:18:19 CST 2020
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_message_state.receiver
     *
     * @return the value of view_message_state.receiver
     *
     * @mbg.generated Thu Mar 19 18:18:19 CST 2020
     */
    public Integer getReceiver() {
        return receiver;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_message_state.receiver
     *
     * @param receiver the value for view_message_state.receiver
     *
     * @mbg.generated Thu Mar 19 18:18:19 CST 2020
     */
    public void setReceiver(Integer receiver) {
        this.receiver = receiver;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_message_state.reader
     *
     * @return the value of view_message_state.reader
     *
     * @mbg.generated Thu Mar 19 18:18:19 CST 2020
     */
    public String getReader() {
        return reader;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_message_state.reader
     *
     * @param reader the value for view_message_state.reader
     *
     * @mbg.generated Thu Mar 19 18:18:19 CST 2020
     */
    public void setReader(String reader) {
        this.reader = reader == null ? null : reader.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_message_state.create_time
     *
     * @return the value of view_message_state.create_time
     *
     * @mbg.generated Thu Mar 19 18:18:19 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_message_state.create_time
     *
     * @param createTime the value for view_message_state.create_time
     *
     * @mbg.generated Thu Mar 19 18:18:19 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_message_state.del_flag
     *
     * @return the value of view_message_state.del_flag
     *
     * @mbg.generated Thu Mar 19 18:18:19 CST 2020
     */
    public Integer getDelFlag() {
        return delFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_message_state.del_flag
     *
     * @param delFlag the value for view_message_state.del_flag
     *
     * @mbg.generated Thu Mar 19 18:18:19 CST 2020
     */
    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_message_state.operator
     *
     * @return the value of view_message_state.operator
     *
     * @mbg.generated Thu Mar 19 18:18:19 CST 2020
     */
    public String getOperator() {
        return operator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_message_state.operator
     *
     * @param operator the value for view_message_state.operator
     *
     * @mbg.generated Thu Mar 19 18:18:19 CST 2020
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_message_state.operator_ip
     *
     * @return the value of view_message_state.operator_ip
     *
     * @mbg.generated Thu Mar 19 18:18:19 CST 2020
     */
    public String getOperatorIp() {
        return operatorIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_message_state.operator_ip
     *
     * @param operatorIp the value for view_message_state.operator_ip
     *
     * @mbg.generated Thu Mar 19 18:18:19 CST 2020
     */
    public void setOperatorIp(String operatorIp) {
        this.operatorIp = operatorIp == null ? null : operatorIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_message_state.operator_time
     *
     * @return the value of view_message_state.operator_time
     *
     * @mbg.generated Thu Mar 19 18:18:19 CST 2020
     */
    public Date getOperatorTime() {
        return operatorTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_message_state.operator_time
     *
     * @param operatorTime the value for view_message_state.operator_time
     *
     * @mbg.generated Thu Mar 19 18:18:19 CST 2020
     */
    public void setOperatorTime(Date operatorTime) {
        this.operatorTime = operatorTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_message_state.user_id
     *
     * @return the value of view_message_state.user_id
     *
     * @mbg.generated Thu Mar 19 18:18:19 CST 2020
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_message_state.user_id
     *
     * @param userId the value for view_message_state.user_id
     *
     * @mbg.generated Thu Mar 19 18:18:19 CST 2020
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_message_state.state
     *
     * @return the value of view_message_state.state
     *
     * @mbg.generated Thu Mar 19 18:18:19 CST 2020
     */
    public Long getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_message_state.state
     *
     * @param state the value for view_message_state.state
     *
     * @mbg.generated Thu Mar 19 18:18:19 CST 2020
     */
    public void setState(Long state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_message_state.content
     *
     * @return the value of view_message_state.content
     *
     * @mbg.generated Thu Mar 19 18:18:19 CST 2020
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_message_state.content
     *
     * @param content the value for view_message_state.content
     *
     * @mbg.generated Thu Mar 19 18:18:19 CST 2020
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}