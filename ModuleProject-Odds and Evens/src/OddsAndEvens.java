import com.sun.org.apache.xpath.internal.objects.XString;
import com.sun.org.apache.xpath.internal.objects.XStringForChars;

import java.util.Scanner;
import java.util.*;

public class OddsAndEvens {

    public static String PickOddsOrEvens() {
        Scanner input = new Scanner(System.in);

        System.out.println("Let’s play a game called “Odds and Evens”");
        System.out.println("What is your name?");
        String name = input.nextLine();

        System.out.println("Hi "+name+",which do you choose? (O)dds or (E)vens?");

        String typeOE = input.next();

        if(typeOE.equals("O")){
            System.out.println(name+" has picked odds! The computer will be evens.");
        }
        else if(typeOE.equals("E")){
            System.out.println(name+" has picked evens! The computer will be odds.");
        }
        return typeOE;
    }

    public static boolean PlayTheGame() {
        Scanner input = new Scanner(System.in);

        System.out.println("How many “fingers” do you put out?");
        int player = input.nextInt();

        Random rand = new Random();
        int computer = rand.nextInt(50);
        System.out.println("Computer put " + computer);

        int sum = player + computer;
        boolean oddOrEven = sum % 2 == 0;

        if (oddOrEven) {
            System.out.println(sum + " is EVEN!");
        }
        else {
            System.out.println(sum + " is ODD!");
        }
        return oddOrEven;
    }

    public static void WhoWon(String pickResult, boolean oddEven) {
        if (pickResult.equals("O")){
            if (!oddEven){
                System.out.println("You are Won!!");
            }
            else {
                System.out.println("Computer is Won..");
            }
        }
        else {
            if (oddEven){
                System.out.println("You are Won!!");
            }
            else {
                System.out.println("Computer is Won..");
            }
        }
    }
    public static void main (String[] arg){
        String pickResult = PickOddsOrEvens();
        boolean oddEven   = PlayTheGame();
        WhoWon(pickResult, oddEven);
    }
}

