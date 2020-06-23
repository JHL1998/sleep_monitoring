package com.luojianhua.sleep_monitoring.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * create by luojianhua
 */
@SpringBootTest
class PreferenceRepositoryTest {

    @Autowired
    private PreferenceRepository preferenceRepository;
    @Test
    void test(){
        preferenceRepository.selectList(null).forEach(System.out::println);
    }

}
