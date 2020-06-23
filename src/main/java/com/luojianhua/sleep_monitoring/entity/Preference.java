package com.luojianhua.sleep_monitoring.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * create by luojianhua
 */
@Data
@TableName("preference")
public class Preference {
    @TableId("userid")
    private String userId;
    private Integer bmin;
    private Integer bmax;
    private Integer hmin;
    private Integer hmax;
    private Integer tmin;
    private Integer tmax;
    private Integer humax;
    private Integer bumax;
    private Integer tumax;
    private Integer ltmax;
    private Integer lsmax;
    private Date time;




}
