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
@TableName("user_info")
public class UserInfo {
    @TableId("userid")
    private String userId;
    private String password;
    private String telphone;
    private String district;
    private String community;
    private String building;
    private String floor;
    private String number;
    private String name;
    private String age;
    private String gender;
    private String nation;
    private String birth;
    @TableField("idnum")
    private String idNum;
    private String addr;
    private String height;
    private String weight;
    private String wais;
    private String hipline;
    private String lEye;
    private String rEye;
    private String chronic;
    private String disabled;
    private String deformity;
    private String contacter;
    private String phone;
    private String email;
    private String qq;
    private String weixin;
    private Date time;
}
