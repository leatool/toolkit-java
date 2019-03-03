package com.leatool;

import org.junit.Test;

/**
 * ID生成工具
 * 作者：刘佳伟
 */
public class CreateIdKit {

    /**
     * 返回一个以时间戳和三位随机数的主键ID
     * @return
     */
    public static long getDateTimeId() {
        long resultLongId = 0;
        long time = System.currentTimeMillis();
        return resultLongId = Long.valueOf(time + "" + Math.round(Math.random() * 1000));
    }

}
