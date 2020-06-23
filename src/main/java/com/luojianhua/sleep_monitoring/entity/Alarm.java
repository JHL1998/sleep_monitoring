package com.luojianhua.sleep_monitoring.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * create by luojianhua
 */
@Data
@TableName("alarm")
public class Alarm {
    @TableId( type = IdType.AUTO)
      private Integer id;
      private String district;
      private String community;
      private String building;
      private String floor;
      private String number;
      @TableField("userid")
      private String userId;
      private String breath;
      private String heart;
      private String turnover;
      private String type;
      private String info;
      private Date time;
      private String tel;

}
