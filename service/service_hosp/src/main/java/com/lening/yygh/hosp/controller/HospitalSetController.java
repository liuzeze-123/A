package com.lening.yygh.hosp.controller;

import com.lening.yygh.hosp.service.HospitalSetService;
import com.lening.yygh.model.hosp.HospitalSet;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 创作时间：2021/4/25 16:47
 * 作者：李增强
 */
@RestController
@RequestMapping("/admin/hosp/hospitalSet")
public class HospitalSetController {

    @Resource
    private HospitalSetService hospitalSetService;


    @RequestMapping("/findAll")
    public List<HospitalSet> findAll(){
        return hospitalSetService.list();
    }
}
