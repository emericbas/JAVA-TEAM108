package days.day23_dateTime_varargs;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class C02_LocalDateTime {
    public static void main(String[] args) {
        LocalDateTime ldt=LocalDateTime.now();
        System.out.println(ldt);//  2022-12-20T09:29:14.485167
        LocalDateTime ldt1=LocalDateTime.now(ZoneId.of("Turkey"));
        System.out.println(ldt1);//2022-12-20T12:31:08.339133400
        System.out.println(ldt.getDayOfWeek());//TUESDAY

        System.out.println(ldt.withYear(2030));//2030-12-20T09:33:41.864463700
    }
}
