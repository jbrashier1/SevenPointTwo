/**
 * Created by jackbrashier on 4/26/17.
 */
public class Day {
    public static final String [] WEEK = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    private String day;
    private boolean weekend;
    private String yesterday;
    private String tomorrow;

    /** Default Constructor of Monday*/
    public Day() {
        this.day = "Monday";
    }

    /**Custom constructor allows setting of day*/
    public Day(String thisDay) {
        this.day = thisDay;
    }

    /**Method to return a string of the day's name*/
    public String toString() { return day; }

    /**Method to return the name of the day*/
    public String getDay() {
        return day;
    }

    /**Method to set a new name of the day*/
    public void setDay(String newDay) {
        this.day = newDay;
    }

    /**Method to get the number of the day in the week*/
    public int dayOfWeek() {
        int returnValue = -1;
        for (int i = 0; i < WEEK.length; i++) {
            if (WEEK[i] == this.getDay()) {
                returnValue = i + 1;
            }
        }
        return returnValue;
    }

    /**Method to determine if the day is part of the weekend*/
    public boolean isWeekend() {
        boolean returnValue;
        if(this.dayOfWeek() == 6 || this.dayOfWeek() == 7) {
            returnValue = true;
        } else {
            returnValue = false;
        }
        return returnValue;
    }

    /**Method to determine the day before the selected day*/
    public String getYesterday() {
        if(this.dayOfWeek() == 1) {
            return WEEK[6];
        } else {
            return (WEEK[this.dayOfWeek() - 2]);
        }
    }

    /**Method to determine the day after the selected day*/
    public String getTomorrow() {
        if(this.dayOfWeek() == 7) {
            return WEEK[0];
        } else {
            return (WEEK[this.dayOfWeek()]);
        }
    }

    /**Method to return which day of the week it will be a certain number of days after this day*/
    public String addDays(int added) {
        return WEEK[(this.dayOfWeek() - 1 + added)%7];
    }
}
