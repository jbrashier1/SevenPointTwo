/**
 * Created by jackbrashier on 4/26/17.
 */
public class DayDriver {
    public static void main(String [] args) {
        Day day1 = new Day();
        Day day2 = new Day("Saturday");
        System.out.println("day1 has been constructed as: Day day1 = new Day();\nday2 has been constructed as: Day day2 = new Day(\"Saturday\");\n");

        System.out.println("day1.toString() OR day1: " + day1);
        System.out.println("day2.toString() OR day2: " + day2);

        System.out.println("\nday1.getDay(): " + day1.getDay());
        System.out.println("day2.getDay(): " + day2.getDay());

        System.out.println("\nday1.dayOfWeek(): " + day1.dayOfWeek());
        System.out.println("day2.dayOfWeek(): " + day2.dayOfWeek());

        System.out.println("\nday1.isWeekend(): " + day1.isWeekend());
        System.out.println("day2.isWeekend(): " + day2.isWeekend());

        System.out.println("\nday1.getYesterday(): " + day1.getYesterday());
        System.out.println("day2.getYesterday(): " + day2.getYesterday());

        System.out.println("\nday1.getTomorrow(): " + day1.getTomorrow());
        System.out.println("day2.getTomorrow(): " + day2.getTomorrow());

        System.out.println("\nday1.addDays(13): " + day1.addDays(13));
        System.out.println("day2.addDays(13): " + day2.addDays(13));

    }
}
