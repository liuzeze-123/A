package com.lening.yygh.hosp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lening.yygh.hosp.mapper.HospitalSetMapper;
import com.lening.yygh.hosp.service.HospitalSetService;
import com.lening.yygh.model.hosp.HospitalSet;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 创作时间：2021/4/25 16:42
 * 作者：李增强
 * 需要我们来实现他的实现类，然后把mapper和我们的反省类给他给他
 */
@Service
public class HospitalSetServiceImpl extends ServiceImpl<HospitalSetMapper, HospitalSet> implements HospitalSetService {
    @Resource
    private HospitalSetMapper hospitalSetMapper;
}
