package com.bplow.cnap.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.bplow.cnap.model.domain.City;
import com.bplow.cnap.util.BaseMapper;

/**
 * CityMapper
 *
 * @author trang
 */
@Mapper
public interface CityMapper extends BaseMapper<City> {
}