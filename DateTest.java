    class Date {
    private int month, day, year;

    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public void setMonth(int month) { this.month = month; }
    public int getMonth() { return month; }

    public void setDay(int day) { this.day = day; }
    public int getDay() { return day; }

    public void setYear(int year) { this.year = year; }
    public int getYear() { return year; }

    public void displayDate() {
        System.out.println(month + "/" + day + "/" + year);
    }
}
public class DateTest {
    public static void main(String[] args) {
        Date date = new Date(9, 22, 2024);
        date.displayDate(); 

        date.setMonth(10);
        date.setDay(15);
        date.setYear(2023);
        date.displayDate(); 
    }
}
