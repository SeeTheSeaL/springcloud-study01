package com.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author lee
 * @date 2020/10/6 - 11:20 上午
 */
@Data
@NoArgsConstructor
@Accessors(chain = true) //链式写法
public class Dept implements Serializable { //dept实体类

    private Long deptno;
    private String dname;

    //这个数据存在哪个数据库，一个服务对应一个数据库，同一个信息可能存在于不同的数据库
    private String db_source;

    public Dept(String name) {
        this.dname = dname;
    }

}
