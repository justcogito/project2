package Part2.Dialog;

import java.util.Scanner;
public class Dialog {
    public static void main(String[] args) {

        String result_string, NameFirst, NameLast, Country, City, Profession = "", Major = "";
        int result, Age;
        boolean result_bool = false, Married = false, Student = false;


        Scanner in = new Scanner(System.in);

        System.out.println("Hello. My name is Andy, and i'll be your virtual assistant.");
        System.out.println("Nice weather today, don't you think so?");

        result_string = in.nextLine();

        switch (result_string) {
            case "yes":
                result_bool = true;
                break;
            case "yep":
                result_bool = true;
                break;
            case "sure":
                result_bool = true;
                break;
            default:
                result_bool = false;
        }

        System.out.println(result_bool == true ? "Cool! Let's start then." : "Oh, well... Let's start then.");

        System.out.println("Please tell me your 1st name");
        NameFirst = in.nextLine();

        System.out.println("Nice to meet you, " + NameFirst + ". Now, tell me your last name");

        NameLast = in.nextLine();
        System.out.println("Okay. So your full name is " + NameFirst + " " + NameLast + ", right?");

        result_string = in.nextLine();

        switch (result_string) {
            case "yes":
                result_bool = true;
                break;
            default:
                result_bool = false;
        }

        System.out.println(result_bool == true ? "Nice! Let's continue. How old are you?"
                : "What a bummer... Let's try one more time.");

        Age = Integer.parseInt(in.nextLine());

        System.out.println("What country are you from?");
        Country = in.nextLine();

        System.out.println("Good. And what city do you live in?");
        City = in.nextLine();

        System.out.println(City + "! I know it. It's a great city! Okay, let's keep going.");

        System.out.println("Are you a student or do you work already?");

        result_string = in.nextLine();

        switch (result_string) {
            case "a student":
                Student = true;
                System.out.println("It's nice to be young... Can you please tell me what Major is it?");
                Major = in.nextLine();
                break;
            default:
                Student = false;
                System.out.println("And what is your profession?");
                Profession = in.nextLine();
        }

        result_string = in.nextLine();

        switch (result_string) {
            case "yes":
                Married = true;
                break;
            default:
                Married = false;
        }

        System.out.println("Ok, lets summarize it. Your name is " + NameFirst + " " + NameLast + " and you are " + Age + ".");
        System.out.println("You are from  " + Country + " and your home city is " + City + ".");




        if (Student == true) {
            System.out.println("You are a student, your major is " + Major);
        } else {
            System.out.println("You work as " + Profession);
            }

        if (Married == true) {
            System.out.print(" and you are married");
        } else {
            System.out.print(" and you are not married");
        }




    }
}
