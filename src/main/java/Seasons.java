import java.time.Month;

public class Seasons {
    public static void getSeason (Month month){
        switch (month){
            case JANUARY, FEBRUARY, DECEMBER:
                System.out.println("Winter");
            break;
            case SEPTEMBER, OCTOBER, NOVEMBER:
                System.out.println("Autumn");
            break;
            case JUNE, JULY, AUGUST:
                System.out.println("Summer");
            break;
            case MARCH, APRIL, MAY:
                System.out.println("Spring");
            break;
        }

    }
}
