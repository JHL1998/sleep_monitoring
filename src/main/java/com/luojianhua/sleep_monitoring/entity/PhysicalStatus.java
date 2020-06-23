package com.luojianhua.sleep_monitoring.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * create by luojianhua
 */
@Data
@TableName("physical_status")
public class PhysicalStatus {
    private Integer id;
    @TableField("userid")
    private String userId;
    private Integer breath;
    private Integer heart;
    private Integer turnover;
    private Integer status;
    private Date date;
    private Date datetime;

}
