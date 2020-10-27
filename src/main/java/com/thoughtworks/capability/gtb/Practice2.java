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
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        int gap = 1;
        // TODO 直接用枚举
        if (dayOfWeek == DayOfWeek.FRIDAY) {
            gap = 3;
        } else if (dayOfWeek == DayOfWeek.SATURDAY) {
            gap = 2;
        }
        return date.plusDays(gap);
    }
}
