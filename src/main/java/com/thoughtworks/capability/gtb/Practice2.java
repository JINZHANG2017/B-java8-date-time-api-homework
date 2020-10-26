package com.thoughtworks.capability.gtb;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * 对任意日期获取下一个工作日, 不考虑节假日
 *
 * @author itutry
 * @create 2020-05-15_17:20
 */
public class Practice2 {

    public static LocalDate getNextWorkDate(LocalDate date) {
        int dayOfWeek = date.getDayOfWeek().getValue();
        int gap = 1;
        if (dayOfWeek == 5) {
            gap = 3;
        } else if (dayOfWeek == 6) {
            gap = 2;
        }
        return date.plusDays(gap);
    }
}
