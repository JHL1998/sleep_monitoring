package com.luojianhua.sleep_monitoring.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.luojianhua.sleep_monitoring.entity.UserInfo;
import com.luojianhua.sleep_monitoring.repository.UserInfoRepository;
import com.luojianhua.sleep_monitoring.service.HealthService;
import com.luojianhua.sleep_monitoring.vo.UserVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * create by luojianhua
 */
@Service
public class HealthServiceImpl implements HealthService {

    @Autowired
    private UserInfoRepository userInfoRepository;

    @Override
    public UserVO findAllBaseInfoByUserId(String userId) {
        QueryWrapper wrapper=new QueryWrapper();
        wrapper.eq("userid",userId);
        UserInfo userInfo = userInfoRepository.selectOne(wrapper);
        UserVO userVO=new UserVO();
        BeanUtils.copyProperties(userInfo,userVO);
        return userVO;

    }

    @Override
    public void updateBaseInfo(UserVO userVO,String userId) {
         UserInfo userInfo=userInfoRepository.selectById(userId);
         BeanUtils.copyProperties(userVO,userInfo);
         userInfoRepository.updateById(userInfo);


    }
}
