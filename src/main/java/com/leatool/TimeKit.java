package com.leatool;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间处理类
 * 作者: liujiawei-l
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
     * 获取当前时间指定的字符类型
     * @param format 获取时间的格式
     * @return
     */
    public static String getNowDateTimeStr(String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(new Date(System.currentTimeMillis()));
    }

    /**
     * 将时间转成指定格式的字符类型
     * @param date 时间入参
     * @return
     */
    public static String dateToStr(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }

    /**
     * 将时间转成指定格式的字符类型
     * @param date   时间入参
     * @param format 时间格式
     * @return
     */
    public static String dateToStr(Date date, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(date);
    }

    /**
     * 获取当前年份
     * @return 年份字符串
     */
    public static String getYear(){
        return getNowDateTimeStr("yyyy");
    }

    /**
     * 获取指定时间年份
     * @param date
     * @return
     */
    public static String getYear(Date date){
        return dateToStr(date, "yyyy");
    }

    /**
     * 获取当前月份
     * @return 月份字符串
     */
    public static String getMonth(){
        return getNowDateTimeStr("MM");
    }

    /**
     * 获取指定时间月份
     * @param date
     * @return
     */
    public static String getMonth(Date date){
        return dateToStr(date, "MM");
    }

    /**
     * 获取当前日期
     * @return 日期字符串
     */
    public static String getDate(){
        return getNowDateTimeStr("dd");
    }

    /**
     * 获取指定时间日期
     * @param date
     * @return
     */
    public static String getDate(Date date){
        return dateToStr(date, "dd");
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
