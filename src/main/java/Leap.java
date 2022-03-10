import java.time.LocalDate;
import java.time.Month;

class Leap {

    boolean isLeapYear(int year) {
        return LocalDate.of(year, Month.JANUARY, 1).isLeapYear();
    }

}
