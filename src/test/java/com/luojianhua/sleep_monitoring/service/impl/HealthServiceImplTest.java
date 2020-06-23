package com.luojianhua.sleep_monitoring.service.impl;

import com.luojianhua.sleep_monitoring.service.HealthService;
import com.luojianhua.sleep_monitoring.vo.UserVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * create by luojianhua
 */

@SpringBootTest
class HealthServiceImplTest {

    @Autowired
    private HealthService healthService;

    @Test
    void test(){
        UserVO allBaseInfoByUserId = healthService.findAllBaseInfoByUserId("0000");
        System.out.println(allBaseInfoByUserId);

    }

    @Test
    void test2(){
        UserVO userVO=new UserVO();

        userVO.setName("云云");
        userVO.setAge("111");
        userVO.setGender("男");


        healthService.updateBaseInfo(userVO,"yuyu");
    }
}
