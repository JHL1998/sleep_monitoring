package com.luojianhua.sleep_monitoring.service;

import com.luojianhua.sleep_monitoring.vo.UserVO;

/**
 * create by luojianhua
 */
public interface HealthService {
        /**
         * 显示健康档案
         * @return
         */
       UserVO findAllBaseInfoByUserId(String userId);

        /**
         * 编辑健康档案
          */
        void updateBaseInfo(UserVO userVO,String userId);
}
