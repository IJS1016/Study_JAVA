import java.lang.reflect.Field;
import java.text.DecimalFormat;
import java.util.Scanner;

public class TripPlanner {

    // Calculate Methods
    public int hours (int days) {
        return days*24;
    }
    public int minutes (int days) {
        return days*24*60;
    }

    // Print, Input Methods
    // Why function have to be static?
    // How to import scanner only once?
    public static void Greeting (){
        // Scanner input needs only once.
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Vacation Planner!");

        System.out.println("What is your name?");
        String name = input.nextLine();

        System.out.println("Nice to meet you " + name + ", where are you travelling to?");
        String site = input.nextLine();

        System.out.println("Great! " + site + " sounds like a great trip!");
    }
    public static void TimeAndBudget (){
        Scanner input = new Scanner(System.in);

        System.out.println("How many days are they going to spend in their destination?");
        Integer days = input.nextInt();

        System.out.println("What is their total budget for the trip in USD?");
        float budgetUSD = input.nextInt();

        System.out.println("What is the currency symbol for their destination? For example, the us dollar’s is USD, the euro’s is EU etc…");
        String current_symbol = input.next();

        System.out.println("The conversion rate between 1 USD to however many of that destinations currency. For example, there are 0.9 euro to 1 usd, so the user would type in 0.9");
        Double conversion_rate = input.nextDouble();
        System.out.println("**************\n\n");

        //Print
        TripPlanner cal = new TripPlanner();
        int hours = cal.hours(days);
        int minutes = cal.minutes(days);
        System.out.println("If you are travelling for " + days + " days that is the same as " + hours + " hours or " + minutes + " minutes");

        System.out.println("If you are going to spend $" + budgetUSD +" USD that means per day you can spend up to $" + budgetUSD/days + " USD");

        double conversion_total = budgetUSD*conversion_rate;
        System.out.println("Your total budget in " + current_symbol + " is " + conversion_total + " " + current_symbol + "which per day is " + conversion_total/days + " " + current_symbol);
        System.out.println("**************\n\n");
    }
    public static void TimeDifference () {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the time difference, in hours, between your home and your destination?");
        int between_hours = input.nextInt();
        int between_hours_noon = between_hours + 12;

        System.out.println("That means that when it is midnight at home it will be " + between_hours +":00 in your travel destination");
        System.out.println("and when it is noon at home it will be" + between_hours_noon + ":00");
        System.out.println("**************\n\n");
    }
    public static void CountryArea (){
        DecimalFormat form = new DecimalFormat("#.##");

        Scanner input = new Scanner(System.in);

        System.out.println("What is the square area of your destination country in km2?");
        double km2 = input.nextInt();
        double mile = km2 * 0.386102;
        System.out.println("In miles2 that is " + form.format(mile));
    }


    public static void main (String[] arg) {
        //Greeting();
        //TimeAndBudget();
        //TimeDifference();
        CountryArea();
    }
}
