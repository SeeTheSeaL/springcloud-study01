package com.springcloud.controller;

import com.springcloud.pojo.Dept;
import com.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author lee
 * @date 2020/10/6 - 2:11 下午
 */
//通过restful服务
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    //获取一些配置的信息
    @Autowired
    private DiscoveryClient client;

    @RequestMapping
    @PostMapping("/dept/add")
    public boolean addDept(Dept dept){
        return deptService.addDept(dept);
    }

    @GetMapping("/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return deptService.queryById(id);
    }

    @GetMapping("/dept/list")
    public List<Dept> getAll(){
        return deptService.queryAll();
    }

    //注册进来的微服务～，获取一些消息
    @GetMapping("/discovery")
    public Object discovery(){
        //获得微服务列表的清单
        List<String> services = client.getServices();
        System.out.println(services);

        //得到一个具体的微服务信息,通过具体的微服务id
        List<ServiceInstance> instances = client.getInstances("SPRINGCLOUD-PROVIDER-DEPT");
        for (ServiceInstance instance : instances) {
            System.out.println("getInstanceId"+instance.getInstanceId());
            System.out.println("getHost"+instance.getHost());
            System.out.println("getMetadata"+instance.getMetadata());
            System.out.println("getPort"+instance.getPort());
            System.out.println("getServiceId"+instance.getServiceId());
        }
        return this.client;
    }
}
