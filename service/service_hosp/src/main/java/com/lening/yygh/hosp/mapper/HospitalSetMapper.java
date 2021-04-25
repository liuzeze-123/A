package com.lening.yygh.hosp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lening.yygh.model.hosp.HospitalSet;
import org.apache.ibatis.annotations.Mapper;

/**
 * 创作时间：2021/4/25 16:34
 * 作者：李增强，注解可以不加，也可以加
 * @Repository
 * 这个mapper忘记了继承mybatis-plus
 */
@Mapper
public interface HospitalSetMapper extends BaseMapper<HospitalSet> {
}
