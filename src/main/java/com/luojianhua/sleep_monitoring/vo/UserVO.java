package com.luojianhua.sleep_monitoring.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * create by luojianhua
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserVO {

    private String name;
    private String age;
    private String gender;
    private String nation;
    private String birth;
    private String building;
    private String floor;
    @JsonProperty("idnum")
    private String idNum;
    private String addr;
    private String height;
    private String weight;
    private String wais;
    private String hipline;
    @JsonProperty("l_eye")
    private String lEye;
    @JsonProperty("r_eye")
    private String rEye;
    private String chronic;
    private String disabled;
    private String deformity;

}
