package com.thoughtworks.capability.gtb;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * 计算任意日期与下一个劳动节相差多少天
 *
 * @author itutry
 * @create 2020-05-15_16:33
 */
public class Practice1 {

    public static long getDaysBetweenNextLaborDay(LocalDate date) {
        int month = date.getMonthValue();
//    int day=date.getDayOfMonth();
        int year = date.getYear();
        if (month >= 5) {
            year += 1;
        }
        LocalDate nextLaborDay = LocalDate.of(year, 5, 1);
        long re = date.until(nextLaborDay, ChronoUnit.DAYS);
        return re;
    }
}
