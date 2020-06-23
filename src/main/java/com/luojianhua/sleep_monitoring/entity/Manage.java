package com.luojianhua.sleep_monitoring.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * create by luojianhua
 */
@Data
@TableName("manage")
public class Manage {
    @TableId("keyword")
    private String keyword;

    private Integer id;
    private String type;

}
