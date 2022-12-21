package days.day22_immutableClasses;

import java.time.LocalDate;

public class C05_LocalDate {
    public static void main(String[] args) {
        LocalDate tarih=LocalDate.now();
        System.out.println(tarih);//2022-12-19

        System.out.println(tarih.getDayOfWeek());//MONDAY
        System.out.println(tarih.getMonth());//DECEMBER
        System.out.println(tarih.getDayOfYear());//353
        System.out.println(tarih.getEra());//CE

        System.out.println(tarih.withYear(2015));//2015-12-19
        System.out.println(tarih.withDayOfMonth(23));//2022-12-23

        System.out.println(tarih.withDayOfMonth(15).withYear(3000));//3000-12-15

        System.out.println(tarih.minusWeeks(5));//2022-11-14
        System.out.println(tarih.minusYears(3).minusWeeks(2).minusDays(23));//2019-11-12

        System.out.println(tarih.plusWeeks(19));//2023-05-01

        LocalDate tarih1=LocalDate.of(1981,4,23);
        LocalDate tarih2=LocalDate.of(1981,4,26);
        System.out.println(tarih1.isBefore(tarih2) ?"tarih 1 daha eski"  :" tarih2 daha eski");//tarih2 daha eski
        System.out.println(tarih1.isLeapYear());//false


        System.out.println(tarih.hashCode());// 4141843
        System.out.println(tarih1.hashCode()); // 4057367
        System.out.println(tarih2.minusDays(3).hashCode()); // 4057367

    }
}
