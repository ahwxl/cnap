package com.shfft.cnap.test;

import com.bplow.cnap.model.domain.City;
import com.bplow.cnap.service.CityService;
import com.bplow.cnap.util.JsonUtils;
import com.github.pagehelper.PageInfo;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ApplicationTests extends SpringBaseTest {

    @Autowired
    private CityService cityService;

    @Test
    public void selectPage() {
        cityService.selectPageAndCount(null, 1, 3).getList().stream()
                .map(JsonUtils::toJson)
                .forEach(log::info);
    }

}