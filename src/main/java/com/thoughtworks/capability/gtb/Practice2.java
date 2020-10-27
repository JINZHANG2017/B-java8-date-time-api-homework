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

    public static final int GENERAL_GAP = 1;
    public static final int FRIDAY_GAP = 3;
    public static final int SATURDAY_GAP = 2;

    public static LocalDate getNextWorkDate(LocalDate date) {
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        int gap = GENERAL_GAP;
        if (dayOfWeek == DayOfWeek.FRIDAY) {
            gap = FRIDAY_GAP;
        } else if (dayOfWeek == DayOfWeek.SATURDAY) {
            gap = SATURDAY_GAP;
        }
        return date.plusDays(gap);
    }
}
