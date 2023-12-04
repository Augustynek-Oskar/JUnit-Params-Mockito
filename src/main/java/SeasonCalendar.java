import java.time.Month;
public class SeasonCalendar {
    public static Season getSeason (Month month){
        switch (month){

            case JANUARY, FEBRUARY, DECEMBER:
            return Season.WINTER;

            case SEPTEMBER, OCTOBER, NOVEMBER:
            return Season.AUTUMN;

            case JUNE, JULY, AUGUST:
            return Season.SUMMER;

            case MARCH, APRIL, MAY:
            return Season.SPRING;

            default:
                throw new IllegalArgumentException("Incorrect month!");
        }
    }
}
