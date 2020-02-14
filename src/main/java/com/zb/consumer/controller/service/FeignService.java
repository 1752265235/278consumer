package com.zb.consumer.controller.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@FeignClient(value = "SERVICE-PROVIDER",fallback = FeignHystixService.class)
public interface FeignService {

    @RequestMapping("/buy")
    public String shopping();

    @RequestMapping("/search")
    public List<Map> search();
}
