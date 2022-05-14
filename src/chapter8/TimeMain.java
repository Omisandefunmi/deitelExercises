package chapter8;

public class TimeMain {
    public static void main(String[] args) {
        Time time = new Time();

        System.out.println("Universal time is "+time.getHour()+ ":"+time.getMinute()+ ":"+time.getSeconds());

        time.setTime(2,45,21);
        System.out.println("Standard time is "+time.getHour()+ ":"+time.getMinute()+ ":"+time.getSeconds());

        Time time1 = new Time(23);
        System.out.printf("Universal time is %02d:%02d:%02d%n", time1.getHour(),time1.getMinute(),time1.getSeconds());

        time1.setTime(4,59, 43);
        System.out.printf("Standard time is %02d:%02d:%02d", time1.getHour(),time1.getMinute(),time1.getSeconds());
    }
}
