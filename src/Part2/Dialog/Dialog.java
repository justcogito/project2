package Part2.Dialog;

import java.util.Scanner;
public class Dialog {
    public static void main(String[] args) {

        String result_string, NameFirst = "", NameLast = "", Country, City, Profession = "", Major = "", FavSeason, KindOfPet = "", PetsName = "";
        int result, Age = 0, LivedForHowLong = 0, FavNumber = 0;
        boolean result_bool = false, HaveAPet = false, Student = false;

        Scanner in = new Scanner(System.in);
        System.out.println("Hello. My name is Andy, and i'll be your virtual assistant.");
        System.out.println("Nice weather today, don't you think so?");

        result_string = in.nextLine().toLowerCase();

        // trying to interpret entered string to find out if user agrees
        if (result_string.contains("y")) {
            result_bool = true;
        }
        else {
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
        }

        boolean FirstTry = true, FullNameIsCorrect = false;

        System.out.println(result_bool == true ? "Indeed! Let's start then." : "Oh, well... Let's start then.");

        // Keep asking for the name until everything is correct:
        while (FullNameIsCorrect == false) {

            System.out.println("Please tell me your 1st name.");
            NameFirst = in.nextLine();

            System.out.println((FirstTry) ? "Nice to meet you, " + NameFirst + ". Now, please tell me your last name."
                                                 : "Now, please tell me your last name");

            NameLast = in.nextLine();
            System.out.println("Okay. So your full name is " + NameFirst + " " + NameLast + ", right?");

            result_string = in.nextLine().toLowerCase();

            // trying to interpret entered string to find out if user agrees
            if (result_string.contains("y")) {
                result_bool = true;
            }
            else if (result_string.contains("r")) {
                result_bool = true;
            }
            else {
                switch (result_string) {
                    case "right":
                        result_bool = true;
                        break;
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
            }

            if (result_bool == true) {
                FullNameIsCorrect = true;
                System.out.println("Nice! Let's continue.");
            }
            else {
                FirstTry = false;
                System.out.println("What a bummer. Let's try one more time.");
            }
        }


        boolean AgeIsCorrect = false;

        // Keep asking for the age until everything is correct:
        while (AgeIsCorrect == false) {
            System.out.println("How old are you?");
            Age = Integer.parseInt(in.nextLine());
            if (Age < 10) {
                System.out.println("Oh, come on. You don't look like a child to me, please take it seriously. Let's try again.");
            } else if (Age > 50) {
                System.out.println("Oh, come on. You don't look that old, please take it seriously. Let's try again.");
            }
            else {
                AgeIsCorrect = true;
                System.out.println("Ok, so you are " + Age + '.');

            }

        }


        System.out.println("What country are you from?");
        Country = in.nextLine();
        String Country_temp = Country.toLowerCase();

        // Trying to recognize the country user is from
        if (Country_temp.startsWith("ukr") && Country_temp != "ukraine") {
            System.out.println("You mean Ukraine?");
            // A lot of code needs to be here, so I'll simplify it for now.
            Country = "Ukraine";
        }
        else if (Country_temp.startsWith("ame") && Country_temp != "america") {
            System.out.println("You mean USA?");
            // A lot of code needs to be here, so I'll simplify it for now.
            Country = "USA";
        }



        System.out.println("Good. And what city do you live in?");
        City = in.nextLine();
        String City_temp = City.toLowerCase();

        // Trying to recognize the city user lives in
        if (City_temp.contains("live in")) {
            int Index = City_temp.indexOf ("live in");
            City = City.substring(Index + 8);
        }

        System.out.println("I know a couple of things know it. It's a great city!");

        System.out.println("For how many years you've been living in " + City + "?");
        LivedForHowLong = Integer.parseInt(in.nextLine());


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

        System.out.println("Moving to the next questions. What is your favorite season?");
        FavSeason = in.nextLine();

        System.out.println("What about your favorite number?");
        FavNumber = Integer.parseInt(in.nextLine());

        System.out.println("Do you have a pet?");
        result_string = in.nextLine().toLowerCase();

        HaveAPet = result_string.equals("yes") ? true : false;
        System.out.println(HaveAPet);

        if (HaveAPet) {
            System.out.println("Nice. What kind of pet do you have?");
            KindOfPet = in.nextLine();
            System.out.println("And what's it's name?");
            PetsName = in.nextLine();
        }

        System.out.println("Ok, lets summarize it. Your name is " + NameFirst + " " + NameLast + " and you are " + Age + ".");
        System.out.println("You are from " + Country + " and your home city is " + City + ", in which you have lived for " + LivedForHowLong + " years.");

        if (Student) {
            System.out.println("You are a student and your major is " + Major + ".");
        } else {
            System.out.println("You work as " + Profession);
            }

        System.out.println("Your favorite number is " + FavNumber + ", as for the season - it's " + FavSeason + ".");

        if (HaveAPet) {
            System.out.println("You have a " + KindOfPet + " as a pet. It's name is " + PetsName);
        }
        else {

        }

        System.out.println("Thank you for the information, " + NameFirst + ". Have a nice day.");

    }
}
