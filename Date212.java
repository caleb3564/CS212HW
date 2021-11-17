package Project1;

public class Date212 {
    private int year, month, day;
    private String smonth;

    public Date212(String input) {
        this.year = Integer.parseInt(input.substring(0, 4));
        this.month = Integer.parseInt(input.substring(4, 6));
        this.day = Integer.parseInt(input.substring(6, 8));
    }
    

    // Set and get methods
    public int getYear() {
        return this.year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getMonth() {
        return this.month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getDay() {
        return this.day;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public String toString() { // Rewriting toString
        return getSmonth(month) + day + ", " + year; 
    }

    // Sort
    public static void sort(Date212 dates[], int counter){
        Date212 temp = new Date212("20010918");
        for (int i = 0; i < counter - 1; i++){
            for (int j = i + 1; j < counter; j++){
                if ((dates[i].getYear()) > (dates[j].getYear())){
                    temp = dates[i];
                    dates[i] = dates[j];
                    dates[j] = temp;
                }
                if ((dates[i].getYear()) == (dates[j].getYear())){
                    if ((dates[i].getMonth()) > (dates[j].getMonth())){
                        temp = dates[i];
                        dates[i] = dates[j];
                        dates[j] = temp;
                    }
                }
                if ((dates[i].getYear()) == (dates[j].getYear()) && dates[i].getMonth() == (dates[j].getMonth())){
                    if ((dates[i].getDay()) > (dates[j].getDay())){
                        temp = dates[i];
                        dates[i] = dates[j];
                        dates[j] = temp;
                    }
                }
            }
        }
    }

    // Setting the months into strings
    String getSmonth(int month) {
        if (month == 01)
            smonth = "January ";
        if (month == 02)
            smonth = "February ";
        if (month == 03)
            smonth = "March ";
        if (month == 04)
            smonth = "April ";
        if (month == 05)
            smonth = "May ";
        if (month == 06)
            smonth = "June ";
        if (month == 07)
            smonth = "July ";
        if (month == 8)
            smonth = "August ";
        if (month == 9)
            smonth = "September ";
        if (month == 10)
            smonth = "October ";
        if (month == 11)
            smonth = "November ";
        if (month == 12)
            smonth = "December ";
        return smonth;
    }
}