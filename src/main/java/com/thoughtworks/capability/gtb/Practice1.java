package com.thoughtworks.capability.gtb;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * 计算任意日期与下一个劳动节相差多少天
 *
 * @author itutry
 * @create 2020-05-15_16:33
 */
public class Practice1 {

    public static final int LABOR_DAY_MONTH = 5;
    public static final int LABOR_DAY_DATE = 1;

    public static long getDaysBetweenNextLaborDay(LocalDate date) {
        LocalDate thisYearLaborDay= LocalDate.of(date.getYear(), LABOR_DAY_MONTH, LABOR_DAY_DATE);
        if(date.isAfter(thisYearLaborDay)){
            LocalDate nextYearLaborDay=thisYearLaborDay.plusYears(1);
            return ChronoUnit.DAYS.between(date,nextYearLaborDay);
        }else{
            return ChronoUnit.DAYS.between(date,thisYearLaborDay);
        }
    }
}
