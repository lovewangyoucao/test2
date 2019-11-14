package com.mdc.test2.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mdc.nacos.entity.MyTest1;
import com.mdc.test2.entity.Permission;
import com.mdc.test2.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class Test2Controller {
    @Autowired
    private TestService testService;
    @PostMapping("/test1")
    public IPage<Permission> removeById(@RequestBody MyTest1 myTest1){
        IPage<Permission> permissionIPage = testService.removeById(myTest1);
        return permissionIPage;
    }
}
