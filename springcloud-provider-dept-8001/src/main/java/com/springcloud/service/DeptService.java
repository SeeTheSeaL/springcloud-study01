package com.springcloud.service;

import com.springcloud.pojo.Dept;

import java.util.List;

/**
 * @author lee
 * @date 2020/10/6 - 2:03 下午
 */
public interface DeptService {
    public boolean addDept(Dept dept);

    public Dept queryById(long id);

    public List<Dept> queryAll();

}
