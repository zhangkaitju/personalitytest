/*
 * 鼎方公司源代码，版权归鼎方公司所有。
 * 创建日期 : 2017年4月7日
 * 修改历史 : 
 *     1. [2017年4月7日]创建文件 by gehanbiao
 */
package com.personalitytest.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * 应试者信息表
 * @author gehanbiao
 * @version 2017年4月7日
 */
@Accessors(chain = true)
@Getter
@Setter
public class HR_CandiDateBO {
    /**
     * 应试者信息表id
     */
    private String candidateId;
    /**
     * 姓名
     */
    private String name;
    /**
     * 性别
     */
    private String gender;
    /**
     * 出生年份 date
     */
    private String dayOfBirth;
    /**
     * 职位id
     */
    private String positionId;
    /**
     * 手机号码
     */
    private String mobile;
    /**
     * 备用电话
     */
    private String phone;
    /**
     * 邮箱地址
     */
    private String email;
    /**
     * 最高学历
     */
    private String education;
    /**
     * 毕业学校
     */
    private String collage;
    /**
     * 毕业学院
     */
    private String school;
    /**
     * 所学专业
     */
    private String major;
    /**
     * 毕业时间 date
     */
    private String graduation;
    /**
     * QQ
     */
    private String qq;
    /**
     * 信息来源id
     */
    private String sourceId;
    /**
     * 目前状态id
     */
    private String stateId;
    /**
     * 录入主管id
     */
    private String userId;
    /**
     * 所在城市id
     */
    private String cityId;
    
	public String getCandidateId() {
		return candidateId;
	}
	public void setCandidateId(String candidateId) {
		this.candidateId = candidateId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDayOfBirth() {
		return dayOfBirth;
	}
	public void setDayOfBirth(String dayOfBirth) {
		this.dayOfBirth = dayOfBirth;
	}
	public String getPositionId() {
		return positionId;
	}
	public void setPositionId(String positionId) {
		this.positionId = positionId;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getCollage() {
		return collage;
	}
	public void setCollage(String collage) {
		this.collage = collage;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getGraduation() {
		return graduation;
	}
	public void setGraduation(String graduation) {
		this.graduation = graduation;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getSourceId() {
		return sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}
	public String getStateId() {
		return stateId;
	}
	public void setStateId(String stateId) {
		this.stateId = stateId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getCityId() {
		return cityId;
	}
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}
    
    
}
