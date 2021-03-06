package project.hrms.start.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;
import java.util.Date;

/**
 * (Employ)实体类
 *
 */
public class Employ implements Serializable {
    private static final long serialVersionUID = 962935093499091885L;
    @TableId(value = "uid",type = IdType.ID_WORKER)
    private Long uid;

    private String password;

    private Integer sex;

    private String name;

    private String phone;

    private String address;

    private String national;

    private String idNumber;

    private String culture;

    private String school;

    private String email;

    private Date contract;

    private Integer departmentId;

    private Date birthday;

    private String employFrom;

    private Integer roleId;

    private String imgKey;

    private Date createTime;

    private Role role;

    private Department department;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNational() {
        return national;
    }

    public void setNational(String national) {
        this.national = national;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getCulture() {
        return culture;
    }

    public void setCulture(String culture) {
        this.culture = culture;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getContract() {
        return contract;
    }

    public void setContract(Date contract) {
        this.contract = contract;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEmployFrom() {
        return employFrom;
    }

    public void setEmployFrom(String employFrom) {
        this.employFrom = employFrom;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getImgKey() {
        return imgKey;
    }

    public void setImgKey(String imgKey) {
        this.imgKey = imgKey;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Employ{" +
                "uid=" + uid +
                ", password='" + password + '\'' +
                ", sex=" + sex +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", national='" + national + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", culture='" + culture + '\'' +
                ", school='" + school + '\'' +
                ", email='" + email + '\'' +
                ", contract=" + contract +
                ", departmentId=" + departmentId +
                ", birthday=" + birthday +
                ", employFrom='" + employFrom + '\'' +
                ", roleId=" + roleId +
                ", imgKey='" + imgKey + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
