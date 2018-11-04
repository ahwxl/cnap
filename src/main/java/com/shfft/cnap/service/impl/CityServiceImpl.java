package com.shfft.cnap.service.impl;

import com.shfft.cnap.model.domain.City;
import com.shfft.cnap.service.CityService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("cityService")
@Transactional
public class CityServiceImpl extends BaseServiceImpl<City, Integer> implements CityService {
}