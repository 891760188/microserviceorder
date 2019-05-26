package com.zpc.order.common;

import java.io.Serializable;

public class Response<T> implements Serializable {

        //请求成功返回码为：0000
        private static final String successCode = "200";
        //返回数据
        private T data;
        //返回码
        private String code;
        //返回描述
        private String msg;

        public Response(){
            this.code = successCode;
            this.msg = "请求成功";
        }

        public Response(String code,String msg){
            this();
            this.code = code;
            this.msg = msg;
        }
        public Response(String code,String msg,T data){
            this();
            this.code = code;
            this.msg = msg;
            this.data = data;
        }
        public Response(T data){
            this();
            this.code = Response.successCode;
            this.msg = "ok";
            this.data = data;
        }



}
