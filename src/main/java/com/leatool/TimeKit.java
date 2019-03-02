package com.leatool;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间处理类
 * 作者：刘佳伟
 */
public class TimeKit {

    /**
     * @return 获取当前时间字符类型-默认格式
     */
    public static String getNowDateTimeStr() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(new Date(System.currentTimeMillis()));
    }

    /**
     * @param format 获取时间的格式
     * @return 获取当前时间指定的字符类型
     */
    public static String getNowDateTimeStr(String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(new Date(System.currentTimeMillis()));
    }

    /**
     * @param date 时间入参
     * @return 将时间转成指定格式的字符类型
     */
    public static String dateToStr(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }

    /**
     * @param date   时间入参
     * @param format 时间格式
     * @return 将时间转成指定格式的字符类型
     */
    public static String dateToStr(Date date, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(date);
    }

    /**
     * @param date 时间字符串
     * @return 时间类型
     * @throws ParseException
     */
    public static Date strToDate(String date) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.parse(date);
    }


}
