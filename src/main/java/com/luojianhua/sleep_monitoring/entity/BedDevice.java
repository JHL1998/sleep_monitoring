package com.luojianhua.sleep_monitoring.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * create by luojianhua
 */
@Data
@TableName("bed_device")
public class BedDevice {
    @TableId
     private String number;
     private String district;
     private String community;
     private String building;
     private String floor;
     private String usable;
     private String device;
     private String status;
     private Date time;
}
