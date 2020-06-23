package com.luojianhua.sleep_monitoring.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * create by luojianhua
 */
@Data
@TableName("manager_info")
public class ManagerInfo {
    @TableId(value = "managerid")
    private String managerId;
    private String district;
    private String community;
    private String building;
    private String floor;
    private String number;
    private String mName;
    private String password;
    private String keyword;
    private String type;
    private String age;
    private String gender;
    @TableField("idnum")
    private String idNum;
    private String telphone;
    private String addr;
    private Date time;

}
