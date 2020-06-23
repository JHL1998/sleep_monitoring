package com.luojianhua.sleep_monitoring.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


/**
 * create by luojianhua
 */
@SpringBootTest
class BedDeviceRepositoryTest {

    @Autowired
    private BedDeviceRepository bedDeviceRepository;

    @Test
    void test(){
         bedDeviceRepository.selectList(null).forEach(System.out::println);
    }

}
