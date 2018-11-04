package com.shfft.cnap.test;

import com.github.pagehelper.PageInfo;
import com.shfft.cnap.model.domain.City;
import com.shfft.cnap.service.CityService;
import com.shfft.cnap.util.JsonUtils;
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