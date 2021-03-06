package project.hrms.start.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;

/**
 * (Role)实体类
 *
 */
public class Role implements Serializable {
    private static final long serialVersionUID = 332920385841419947L;
    @TableId(value = "rid", type = IdType.AUTO)
    private Integer rid;

    private String roleName;

    private Integer roleVal;


    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Integer getRoleVal() {
        return roleVal;
    }

    public void setRoleVal(Integer roleVal) {
        this.roleVal = roleVal;
    }

    @Override
    public String toString() {
        return "Role{" +
                "rid=" + rid +
                ", roleName='" + roleName + '\'' +
                ", roleVal=" + roleVal +
                '}';
    }
}
