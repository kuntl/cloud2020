package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @auther zzyy
 * @create 2020-02-18 17:22
 */
/*
* @AllArgsConstructor自动创建带有所有参数的构造器
* @NoArgsConstructor自动创建不带参数的构造器
* */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable
{
    private Long id;
    private String serial;
}
