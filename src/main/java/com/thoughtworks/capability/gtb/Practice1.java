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

    public static long getDaysBetweenNextLaborDay(LocalDate date) {
//        int month = date.getMonthValue();
////    int day=date.getDayOfMonth();
//        int year = date.getYear();
////        date.isAfter()
//        if (month >= 5) {
//            // TODO 使用现有api
//            year += 1;
//        }
////        if(date.is)
//        LocalDate nextLaborDay = LocalDate.of(year, 5, 1);
//        long re = date.until(nextLaborDay, ChronoUnit.DAYS);
//        long between = ChronoUnit.DAYS.between(date, nextLaborDay);
//        return re;
        LocalDate thisYearLaborDay= LocalDate.of(date.getYear(),5,1);
        if(date.isAfter(thisYearLaborDay)){
            LocalDate nextYearLaborDay=thisYearLaborDay.plusYears(1);
            return ChronoUnit.DAYS.between(date,nextYearLaborDay);
        }else{
            return ChronoUnit.DAYS.between(date,thisYearLaborDay);
        }


    }
}
