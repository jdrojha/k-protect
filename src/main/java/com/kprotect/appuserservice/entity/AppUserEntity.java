package com.kprotect.appuserservice.entity;

import javax.persistence.*;
import java.util.Date;

/***
 * @author Rajesh Ojha
 * It is not autogenerated class, table is generated using this entity.
 *
 */
@Entity
@Table(name = "appuserinfo")
public class AppUserEntity {

    @Id @GeneratedValue
    private int id;

    @Version
    private int version;

    String companyId;
    String userId;
    Double longtitude;
    Double latitude;
    Integer mobile;
    String email;
    boolean bocked;
    Date loginTime;
    Date logoutTime;

    public AppUserEntity() {

    }

    public AppUserEntity(String userId, Double longtitude, Double latitude, Integer mobile, String email, boolean bocked, Date loginTime, Date logoutTime) {
        this.userId = userId;
        this.longtitude = longtitude;
        this.latitude = latitude;
        this.mobile = mobile;
        this.email = email;
        this.bocked = bocked;
        this.loginTime = loginTime;
        this.logoutTime = logoutTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
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

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }
}