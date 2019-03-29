package com.chen.utils;


/**
 * 统一返回客户端 数据格式
 *
 * 在这里使用的是饿汉式
 *
 * @author chen
 * @create 2019-03-29 14:12
 **/
public class ResponseResult{

    private static ResponseResult instance = new ResponseResult();

    //为了保证只有一个实例   构造方法无做任何操作
    private ResponseResult(){}

    public static ResponseResult getInstance(){
        return instance;
    }

    //返回给客户端的数据说明
    private String msg;

    //如果操作成功，返回的数据
    private Object data;

    //返回的编码  0：表示操作成功  1：表示失败
    private int code;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }


    @Override
    public String toString() {
        return "ResponseResult{" +
                "msg='" + msg + '\'' +
                ", data=" + data +
                ", code=" + code +
                '}';
    }
}
