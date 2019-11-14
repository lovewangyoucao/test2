package com.mdc.test2.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.mdc.nacos.entity.MyTest1;
import com.mdc.test2.entity.Permission;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "outh2-server")
public interface TestService {
    @PostMapping("/permission/list")
    IPage<Permission> removeById(@RequestBody MyTest1 myTest1);
}
