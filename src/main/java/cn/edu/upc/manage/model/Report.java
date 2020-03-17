package cn.edu.upc.manage.model;

import java.util.Date;

public class Report {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column report.id
     *
     * @mbg.generated Tue Mar 17 22:10:51 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column report.project_id
     *
     * @mbg.generated Tue Mar 17 22:10:51 CST 2020
     */
    private Integer projectId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column report.project_name
     *
     * @mbg.generated Tue Mar 17 22:10:51 CST 2020
     */
    private String projectName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column report.group_id
     *
     * @mbg.generated Tue Mar 17 22:10:51 CST 2020
     */
    private Integer groupId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column report.group_name
     *
     * @mbg.generated Tue Mar 17 22:10:51 CST 2020
     */
    private String groupName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column report.employee_id
     *
     * @mbg.generated Tue Mar 17 22:10:51 CST 2020
     */
    private Integer employeeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column report.employee_name
     *
     * @mbg.generated Tue Mar 17 22:10:51 CST 2020
     */
    private String employeeName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column report.date
     *
     * @mbg.generated Tue Mar 17 22:10:51 CST 2020
     */
    private Date date;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column report.document
     *
     * @mbg.generated Tue Mar 17 22:10:51 CST 2020
     */
    private String document;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column report.type
     *
     * @mbg.generated Tue Mar 17 22:10:51 CST 2020
     */
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column report.content
     *
     * @mbg.generated Tue Mar 17 22:10:51 CST 2020
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column report.create_time
     *
     * @mbg.generated Tue Mar 17 22:10:51 CST 2020
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column report.del_flag
     *
     * @mbg.generated Tue Mar 17 22:10:51 CST 2020
     */
    private Integer delFlag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column report.operator
     *
     * @mbg.generated Tue Mar 17 22:10:51 CST 2020
     */
    private String operator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column report.operator_ip
     *
     * @mbg.generated Tue Mar 17 22:10:51 CST 2020
     */
    private String operatorIp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column report.operator_time
     *
     * @mbg.generated Tue Mar 17 22:10:51 CST 2020
     */
    private Date operatorTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column report.id
     *
     * @return the value of report.id
     *
     * @mbg.generated Tue Mar 17 22:10:51 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column report.id
     *
     * @param id the value for report.id
     *
     * @mbg.generated Tue Mar 17 22:10:51 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column report.project_id
     *
     * @return the value of report.project_id
     *
     * @mbg.generated Tue Mar 17 22:10:51 CST 2020
     */
    public Integer getProjectId() {
        return projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column report.project_id
     *
     * @param projectId the value for report.project_id
     *
     * @mbg.generated Tue Mar 17 22:10:51 CST 2020
     */
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column report.project_name
     *
     * @return the value of report.project_name
     *
     * @mbg.generated Tue Mar 17 22:10:51 CST 2020
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column report.project_name
     *
     * @param projectName the value for report.project_name
     *
     * @mbg.generated Tue Mar 17 22:10:51 CST 2020
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column report.group_id
     *
     * @return the value of report.group_id
     *
     * @mbg.generated Tue Mar 17 22:10:51 CST 2020
     */
    public Integer getGroupId() {
        return groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column report.group_id
     *
     * @param groupId the value for report.group_id
     *
     * @mbg.generated Tue Mar 17 22:10:51 CST 2020
     */
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column report.group_name
     *
     * @return the value of report.group_name
     *
     * @mbg.generated Tue Mar 17 22:10:51 CST 2020
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column report.group_name
     *
     * @param groupName the value for report.group_name
     *
     * @mbg.generated Tue Mar 17 22:10:51 CST 2020
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column report.employee_id
     *
     * @return the value of report.employee_id
     *
     * @mbg.generated Tue Mar 17 22:10:51 CST 2020
     */
    public Integer getEmployeeId() {
        return employeeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column report.employee_id
     *
     * @param employeeId the value for report.employee_id
     *
     * @mbg.generated Tue Mar 17 22:10:51 CST 2020
     */
    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column report.employee_name
     *
     * @return the value of report.employee_name
     *
     * @mbg.generated Tue Mar 17 22:10:51 CST 2020
     */
    public String getEmployeeName() {
        return employeeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column report.employee_name
     *
     * @param employeeName the value for report.employee_name
     *
     * @mbg.generated Tue Mar 17 22:10:51 CST 2020
     */
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName == null ? null : employeeName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column report.date
     *
     * @return the value of report.date
     *
     * @mbg.generated Tue Mar 17 22:10:51 CST 2020
     */
    public Date getDate() {
        return date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column report.date
     *
     * @param date the value for report.date
     *
     * @mbg.generated Tue Mar 17 22:10:51 CST 2020
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column report.document
     *
     * @return the value of report.document
     *
     * @mbg.generated Tue Mar 17 22:10:51 CST 2020
     */
    public String getDocument() {
        return document;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column report.document
     *
     * @param document the value for report.document
     *
     * @mbg.generated Tue Mar 17 22:10:51 CST 2020
     */
    public void setDocument(String document) {
        this.document = document == null ? null : document.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column report.type
     *
     * @return the value of report.type
     *
     * @mbg.generated Tue Mar 17 22:10:51 CST 2020
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column report.type
     *
     * @param type the value for report.type
     *
     * @mbg.generated Tue Mar 17 22:10:51 CST 2020
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column report.content
     *
     * @return the value of report.content
     *
     * @mbg.generated Tue Mar 17 22:10:51 CST 2020
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column report.content
     *
     * @param content the value for report.content
     *
     * @mbg.generated Tue Mar 17 22:10:51 CST 2020
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column report.create_time
     *
     * @return the value of report.create_time
     *
     * @mbg.generated Tue Mar 17 22:10:51 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column report.create_time
     *
     * @param createTime the value for report.create_time
     *
     * @mbg.generated Tue Mar 17 22:10:51 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column report.del_flag
     *
     * @return the value of report.del_flag
     *
     * @mbg.generated Tue Mar 17 22:10:51 CST 2020
     */
    public Integer getDelFlag() {
        return delFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column report.del_flag
     *
     * @param delFlag the value for report.del_flag
     *
     * @mbg.generated Tue Mar 17 22:10:51 CST 2020
     */
    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column report.operator
     *
     * @return the value of report.operator
     *
     * @mbg.generated Tue Mar 17 22:10:51 CST 2020
     */
    public String getOperator() {
        return operator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column report.operator
     *
     * @param operator the value for report.operator
     *
     * @mbg.generated Tue Mar 17 22:10:51 CST 2020
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column report.operator_ip
     *
     * @return the value of report.operator_ip
     *
     * @mbg.generated Tue Mar 17 22:10:51 CST 2020
     */
    public String getOperatorIp() {
        return operatorIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column report.operator_ip
     *
     * @param operatorIp the value for report.operator_ip
     *
     * @mbg.generated Tue Mar 17 22:10:51 CST 2020
     */
    public void setOperatorIp(String operatorIp) {
        this.operatorIp = operatorIp == null ? null : operatorIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column report.operator_time
     *
     * @return the value of report.operator_time
     *
     * @mbg.generated Tue Mar 17 22:10:51 CST 2020
     */
    public Date getOperatorTime() {
        return operatorTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column report.operator_time
     *
     * @param operatorTime the value for report.operator_time
     *
     * @mbg.generated Tue Mar 17 22:10:51 CST 2020
     */
    public void setOperatorTime(Date operatorTime) {
        this.operatorTime = operatorTime;
    }
}