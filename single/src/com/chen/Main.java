package com.chen;

import com.chen.utils.ResponseResult;

/**
 * 测试入口
 *
 * @author chen
 * @create 2019-03-29 14:11
 **/
public class Main {

    public static void main(String[] args) {

        ResponseResult responseResult = ResponseResult.getInstance();

        responseResult.setCode(0);
        responseResult.setMsg("操作成功");
        responseResult.setData("这里是存放，请求的数据");

        System.out.println(responseResult.toString());
    }

}
