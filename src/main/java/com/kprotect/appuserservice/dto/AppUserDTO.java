package com.kprotect.appuserservice.dto;

import java.util.Date;

/***
 * @Author Rajesh Ojha
 * @since
 * Simple pojo class, handling request and response
 */
public class AppUserDTO {

    String userId;
    Double longtitude;
    Double latitude;
    Integer mobile;
    String email;
    boolean bocked;
    Date loginTime;
    Date logoutTime;
    private String serviceAddress;

    public AppUserDTO() {
        this.userId = "";
        this.longtitude = 0.0;
        this.latitude = 0.0;
        this.mobile = 0;
        this.email = "";
        this.bocked = false;
        this.loginTime = null;
        this.logoutTime = null;
    }
    public AppUserDTO(String userId, Double longtitude, Double latitude, Integer mobile, String email, boolean bocked, Date loginTime, Date logoutTime) {
        this.userId = userId;
        this.longtitude = longtitude;
        this.latitude = latitude;
        this.mobile = mobile;
        this.email = email;
        this.bocked = bocked;
        this.loginTime = loginTime;
        this.logoutTime = logoutTime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Double getLongtitude() {
        return longtitude;
    }

    public void setLongtitude(Double longtitude) {
        this.longtitude = longtitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Integer getMobile() {
        return mobile;
    }

    public void setMobile(Integer mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isBocked() {
        return bocked;
    }

    public void setBocked(boolean bocked) {
        this.bocked = bocked;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public Date getLogoutTime() {
        return logoutTime;
    }

    public void setLogoutTime(Date logoutTime) {
        this.logoutTime = logoutTime;
    }

    public String getServiceAddress() {
        return serviceAddress;
    }

    public void setServiceAddress(String serviceAddress) {
        this.serviceAddress = serviceAddress;
    }

    @Override
    public String toString() {
        return "AppUserDTO{" +
                "userId='" + userId + '\'' +
                ", longtitude=" + longtitude +
                ", latitude=" + latitude +
                ", mobile=" + mobile +
                ", email='" + email + '\'' +
                ", bocked=" + bocked +
                ", loginTime=" + loginTime +
                ", logoutTime=" + logoutTime +
                ", serviceAddress='" + serviceAddress + '\'' +
                '}';
    }
}