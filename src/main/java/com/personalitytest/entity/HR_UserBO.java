/*
 * 鼎方公司源代码，版权归鼎方公司所有。
 * 创建日期 : 2017年4月5日
 * 修改历史 : 
 *     1. [2017年4月5日]创建文件 by gehanbiao
 */
package com.personalitytest.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 *  HR管理员信息表
 * @author gehanbiao
 * @version 2017年4月5日
 */
@Accessors(chain = true)
@Getter
@Setter
public class HR_UserBO {
    /**
     * ID
     */
    private String userId;
    /**
     * 名称
     */
    private String userName;
    /**
     * 密码
     */
    private String userPassword;
    /**
     * 昵称
     */
    private String userSureName;
    /**
     * 电话
     */
    private String userMobile;
    /**
     * 邮箱
     */
    private String userEmail;
    /**
     * 角色ID
     */
    private String roleId;
    /**
     * 备注
     */
    private String column;
    /**
     * 当前页的页号
     */
    private int pageNum = 1;
    /**
     * 当前页显示条目数
     */
    private int pageSize = 5;
    
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserSureName() {
		return userSureName;
	}
	public void setUserSureName(String userSureName) {
		this.userSureName = userSureName;
	}
	public String getUserMobile() {
		return userMobile;
	}
	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public String getColumn() {
		return column;
	}
	public void setColumn(String column) {
		this.column = column;
	}
   
    
}
