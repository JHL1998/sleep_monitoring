package com.luojianhua.sleep_monitoring.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * create by luojianhua
 */
@SpringBootTest
class UserInfoRepositoryTest {

    @Autowired
    private UserInfoRepository userInfoRepository;
    @Test
    void test(){
         userInfoRepository.selectList(null).forEach(System.out::println);
    }
}
