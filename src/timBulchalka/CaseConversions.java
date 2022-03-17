package timBulchalka;

import java.util.Locale;

public class CaseConversions {
    public static void main(String[] args) {

        String  month = "januaRy";
        switch (month.toLowerCase()){
            case "january":
                System.out.println("It is January!");
                break;
            case "july":
                System.out.println("It is July");
                break;
            case "October":
                System.out.println("Happy independence");
                break;
            default:
                System.out.println("invalid");
        }
    }
}
