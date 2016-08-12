package com.arch.common.biz.utils;

import com.arch.common.api.constants.Constants;
import lombok.extern.log4j.Log4j;
import org.joda.time.DateTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by chenxiaobian on 16/4/20.
 */
@Log4j
public class DateUtils {


    /** |
     * 获取日期格式化为当天00:00:00
     * @param date
     * @return
     */
    public static Date formatDayStart(Date date) {

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        return calendar.getTime();

    }

    /** |
     * 获取日期格式化到分钟,秒设置为0
     * @param date
     * @return
     */
    public static Date formatZeroSecond(Date date) {

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.SECOND, 0);
        return calendar.getTime();

    }

    /** |
     * 日期格式化,"yyyy-MM-dd HH:mm:ss"
     * @param date
     * @return
     */
    public static Date getDateFormat(String date){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            return sdf.parse(date);
        } catch (ParseException e) {
            log.error("时间格式化失败",e);
            throw new RuntimeException("时间格式化失败",e);
        }
    }

    /** |
     * 日期格式化,"yyyy-MM-dd HH:mm"
     * @param date
     * @return
     */
    public static Date getDateFormat_minute(String date){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        try {
            return sdf.parse(date);
        } catch (ParseException e) {
            log.error("时间格式化失败",e);
            throw new RuntimeException("时间格式化失败",e);
        }
    }

    /** |
     * 日期格式化,"yyyyMMdd"
     * @param date
     * @return
     */
    public static Date getDateFormatyyyyMMdd(String date){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        try {
            return sdf.parse(date);
        } catch (ParseException e) {
            log.error("日期格式化失败",e);
            throw new RuntimeException("日期格式化失败",e);
        }
    }

    /**|
     * 获取日期格式化为明天00:00:00
     * @param date
     * @return
     */
    public static Date formatNextDayStart(Date date) {

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        return calendar.getTime();

    }

    /** |
     * 获取日期格式化为当天23:59:59
     * @param date
     * @return
     */
    public static Date formatDayEnd(Date date) {

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        return calendar.getTime();

    }

    /** |
     * 获取字符串,格式化为"yyyy-MM-dd"
     * @param date
     * @return
     */
    public static String formatDay(Date date) {
        DateTime dateTime = new DateTime(date.getTime());
        return dateTime.toString(Constants.DAY_FORMAT);
    }
    /** |
     * 获取字符串,格式化为"yyyy-MM-dd HH:MM:ss"
     * @param date
     * @return
     */
    public static String formatSecond(Date date) {
        DateTime dateTime = new DateTime(date.getTime());
        return dateTime.toString(Constants.SECOND_FORMAT);
    }


    /** |
     * 获取前一天日期格式化为23:59:59
     * @param date
     * @return
     */
    public static Date formatDayBackEnd(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, -1);
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        return calendar.getTime();

    }

    /** |
     * 获取前N月日期
     * @param date
     * @return
     */
    public static Date getFrontDate(Date date,Integer nMonth) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, -nMonth);
        return calendar.getTime();

    }

    /** |
     * 获取前一分钟,并且设置秒为59
     * @param date
     * @return
     */
    public static Date formatMinuteBackEnd(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MINUTE, -1);
        calendar.set(Calendar.SECOND, 59);
        return calendar.getTime();
    }

}
