package com.bplow.cnap.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bplow.cnap.model.domain.City;
import com.bplow.cnap.service.CityService;

@Service("cityService")
@Transactional
public class CityServiceImpl extends BaseServiceImpl<City, Integer> implements CityService {
}