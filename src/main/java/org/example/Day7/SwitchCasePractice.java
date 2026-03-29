package org.example.Day7;

public class SwitchCasePractice {
    public static void main(String[] args) {
        int day = 6;
        String dayName;
        switch (day) {
            case 1:
                dayName = "Sunday";
                System.out.println("Sunday");
                break;
            case 2:
                dayName = "Tuesday";
                System.out.println("working Case 2 !!");
                break;
            case 4:
                dayName = "Wednesday";
                System.out.println("Working Case 4 !!");
                break;
            default:
                dayName = "Invalid day";
                System.out.println("Case Default Case !!");
                break;
        }
        System.out.println(dayName);
    }
}
