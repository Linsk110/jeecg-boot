package org.jeecg.modules.linsk.kk.service.impl;

import org.jeecg.modules.linsk.kk.entity.user;
import org.jeecg.modules.linsk.kk.mapper.userMapper;
import org.jeecg.modules.linsk.kk.service.IuserService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * @Description: 人员信息
 * @Author: jeecg-boot
 * @Date:   2019-11-02
 * @Version: V1.0
 */
@Service
public class userServiceImpl extends ServiceImpl<userMapper, user> implements IuserService {

}
