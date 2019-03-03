package com.leatool;

import org.junit.Test;

/**
 * ID生成工具
 * 作者：刘佳伟
 */
public class CreateIdKit {

    public static void main(String[] agrs){
        System.out.println("haha");

//        System.out.println(Math.random());
    }

    public long getLongId(){
        long resultLongId = 0;
        long time = System.currentTimeMillis();
        String date = TimeKit.getNowDateTimeStr("yyyyMMddhhmmss");


        return resultLongId;
    }

}
