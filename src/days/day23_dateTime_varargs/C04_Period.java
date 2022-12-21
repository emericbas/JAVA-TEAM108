package days.day23_dateTime_varargs;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class C04_Period {
    public static void main(String[] args) {
        LocalDate dogumTarihi = LocalDate.of(1981, 4, 26);
        LocalDate bugun = LocalDate.now();
        Period yas = Period.between(dogumTarihi, bugun);
        System.out.println(yas);//P41Y7M24D



    }}