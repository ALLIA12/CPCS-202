
package a2_xa_1945958;

import java.util.*;

public class A2_XA_1945958 {

    public static void main(String[] args) {
        double MonthlyCost, AnnualCost;
        String name, mobile, type_of_insurance, description_of_insuarnce, payment_method, starting_date, claim, starting_time;

        final String services_screen = "     ------- SERVICES -------\n"
                + "-----------------------------------\n"
                + " | L or l : Life Insurance           | \n"
                + " | H or h : Health Insurance         | \n"
                + " | C or c : Car Insurance            | \n"
                + " | R or r : Return to Main Menu      | \n"
                + " --------------------------------- ";
        final String life_insurance = "---------- Life Insurance-----------\n"
                + "--------------------------------------\n"
                + " | S or s:  Saudi Arabia Only        |\n"
                + " | G or g:  Gulf Countries           |\n"
                + " | W or w:  World Wide               |\n"
                + " | P or p:  Previous Menu            |\n"
                + " -------------------------------------";
        final String health_insurance = "---------- Health Insurance -------\n"
                + "-------------------------------------\n"
                + " | N or n:  New Membership         | \n"
                + " | R or r:  Renew Membership       | \n"
                + " | P or p:  Previous Menu          | \n"
                + " ----------------------------------- ";
        final String car_insurance = "------------- Car Insurance-------------\n"
                + "-----------------------------------------\n"
                + " | FC: Fully comprehensive            | \n"
                + " | TPft: Third-party, fire and theft  | \n"
                + " | TP: Third party                    | \n"
                + " | PR:  Previous Menu                 | \n"
                + " -------------------------------------- ";
        final String membership_screen = "--------------- Request Membership ------------------\n"
                + "------------------------------------------------------\n"
                + " | 1: Via world insurance company representative    | \n"
                + " | 2: Pay insurance fee                             | \n"
                + " | 3: Previous Menu                                 | \n"
                + " ---------------------------------------------------- ";
        final String CC_screen = " ------ CLAIM/COMPLAINT ------\n"
                + "-------------------------------------\n"
                + " | 1: Submit Claim                 | \n"
                + " | 2: Submit Complaint             | \n"
                + " | 3: Previous Menu                | \n"
                + " ----------------------------------- ";

        char loop_one = '0';
        int count_life_query = 0, count_health_query = 0, count_car_query = 0;
        int count_request_memebership_life = 0, count_request_memebership_health = 0, count_request_memebership_car = 0;
        int count_CC_life = 0, count_CC_health = 0, count_CC_car = 0;
        int amount_of_insuarnce, cost_of_insuarnce;
        Scanner KEKW = new Scanner(System.in);
        while (loop_one != '4') {
            loop_one = '0'; //reseting the value
            int loop_two = 0, loop_three = 0; // intial values 
            String string_for_car_loop = "";
            char char_for_loop_insurance_one = 'z';
            System.out.println("----------------------------------------------------------------------------------\n"
                    + "-------            Welcome to World Insurance Company      -------\n"
                    + "----------------------------------------------------------------------------------\n"
                    + " | 1 : Information about insurance types                                  | \n"
                    + " | 2 : Be a member of World Insurance Company (Appointment or Pay Bill )  | \n"
                    + " | 3 : Submit customer claim or complaint                                 | \n"
                    + " | 4 : Exit                                                               | \n"
                    + " --------------------------------------------------------------------------------");
            System.out.print(" > Please enter the choice: ");
            loop_one = KEKW.next().charAt(0);
            if (loop_one == '1') {
                while (Character.toUpperCase(char_for_loop_insurance_one) != 'R') {
                    System.out.println(services_screen);
                    System.out.print(" > Please enter the choice: ");
                    char_for_loop_insurance_one = KEKW.next().charAt(0);
                    System.out.println("");
                    if (Character.toUpperCase(char_for_loop_insurance_one) == 'L') {
                        while (Character.toUpperCase(char_for_loop_insurance_one) != 'P') {
                            System.out.println(life_insurance);
                            System.out.print(" > Please enter the choice: ");
                            char_for_loop_insurance_one = KEKW.next().charAt(0);
                            if (Character.toUpperCase(char_for_loop_insurance_one) == 'S') {
                                AnnualCost = 10000;
                                MonthlyCost = AnnualCost / 12.0 + ((AnnualCost / 12.0) * (20.0 / 100.0));
                                System.out.printf("AnnualCost : %.1f\n"
                                        + "MonthlyCost : %.2f \n"
                                        + "Needed Number of Days to be settled : 10\n", AnnualCost, MonthlyCost);
                                count_life_query++;
                            }
                            if (Character.toUpperCase(char_for_loop_insurance_one) == 'G') {
                                AnnualCost = 15000;
                                MonthlyCost = AnnualCost / 12.0 + ((AnnualCost / 12.0) * (20.0 / 100.0));
                                System.out.printf("AnnualCost : %.1f\n"
                                        + "MonthlyCost : %.2f \n"
                                        + "Needed Number of Days to be settled : 20\n", AnnualCost, MonthlyCost);
                                count_life_query++;
                            }
                            if (Character.toUpperCase(char_for_loop_insurance_one) == 'W') {
                                AnnualCost = 20000;
                                MonthlyCost = AnnualCost / 12.0 + ((AnnualCost / 12.0) * (20.0 / 100.0));
                                System.out.printf("AnnualCost : %.1f\n"
                                        + "MonthlyCost : %.2f \n"
                                        + "Needed Number of Days to be settled : 30\n", AnnualCost, MonthlyCost);
                                count_life_query++;
                            }

                        }
                    }
                    if (Character.toUpperCase(char_for_loop_insurance_one) == 'H') {
                        while (Character.toUpperCase(char_for_loop_insurance_one) != 'P') {
                            System.out.println(health_insurance);
                            System.out.print(" > Please enter the choice: ");
                            char_for_loop_insurance_one = KEKW.next().charAt(0);
                            if (Character.toUpperCase(char_for_loop_insurance_one) == 'N') {
                                AnnualCost = 3000;
                                MonthlyCost = AnnualCost / 12.0 + ((AnnualCost / 12.0) * (20.0 / 100.0));
                                System.out.printf("AnnualCost : %.1f\n"
                                        + "MonthlyCost : %.2f \n"
                                        + "Needed Number of Days to be settled : 5\n", AnnualCost, MonthlyCost);
                                count_health_query++;
                            }
                            if (Character.toUpperCase(char_for_loop_insurance_one) == 'R') {
                                AnnualCost = (int) 3000 - (3000 * (10.0 / 100.0));
                                MonthlyCost = AnnualCost / 12.0 + ((AnnualCost / 12.0) * (20.0 / 100.0));
                                System.out.printf("AnnualCost : %.1f\n"
                                        + "MonthlyCost : %.2f \n"
                                        + "Needed Number of Days to be settled : 1\n", AnnualCost, MonthlyCost);
                                count_health_query++;
                            }
                        }
                    }
                    if (Character.toUpperCase(char_for_loop_insurance_one) == 'C') {
                        while (!string_for_car_loop.equalsIgnoreCase("PR")) {
                            System.out.println(car_insurance);
                            System.out.print(" > Please enter the choice: ");
                            string_for_car_loop = KEKW.next();
                            if (string_for_car_loop.equalsIgnoreCase("FC")) {
                                AnnualCost = 4000;
                                MonthlyCost = AnnualCost / 12.0 + ((AnnualCost / 12.0) * (20.0 / 100.0));
                                System.out.printf("AnnualCost : %.1f\n"
                                        + "MonthlyCost : %.2f \n"
                                        + "Needed Number of Days to be settled : 1\n", AnnualCost, MonthlyCost);
                                count_car_query++;

                            }
                            if (string_for_car_loop.equalsIgnoreCase("TPft")) {
                                AnnualCost = 2000;
                                MonthlyCost = AnnualCost / 12.0 + ((AnnualCost / 12.0) * (20.0 / 100.0));
                                System.out.printf("AnnualCost : %.1f\n"
                                        + "MonthlyCost : %.2f \n"
                                        + "Needed Number of Days to be settled : 1\n", AnnualCost, MonthlyCost);
                                count_car_query++;

                            }
                            if (string_for_car_loop.equalsIgnoreCase("TP")) {
                                AnnualCost = 1000;
                                MonthlyCost = AnnualCost / 12.0 + ((AnnualCost / 12.0) * (20.0 / 100.0));
                                System.out.printf("AnnualCost : %.1f\n"
                                        + "MonthlyCost : %.2f \n"
                                        + "Needed Number of Days to be settled : 2\n", AnnualCost, MonthlyCost);
                                count_car_query++;

                            }
                        }
                    }
                }

            }
            if (loop_one == '2') {
                while (Character.toUpperCase(char_for_loop_insurance_one) != 'R') {
                    loop_two = 0;
                    System.out.println(services_screen);
                    System.out.print(" > Please enter the choice: ");
                    char_for_loop_insurance_one = KEKW.next().charAt(0);
                    if (Character.toUpperCase(char_for_loop_insurance_one) == 'L') {      // MIGHT NEED TO CHANGE THIS 
                        while (loop_two != 3) {
                            System.out.println(membership_screen);
                            System.out.print(" > Please enter the choice: ");
                            loop_two = KEKW.nextInt();
                            if (loop_two == 1) {      // WHAT DO I WRITE HERE ?
                                KEKW.nextLine();
                                System.out.print("> Enter your name (first and last):");
                                name = KEKW.nextLine();
                                System.out.print("> Enter your mobile (##-###-####):");
                                mobile = KEKW.next();
                                System.out.print("> Type of insurance [Life/Health/Car] : ");
                                type_of_insurance = KEKW.next();
                                KEKW.nextLine();
                                System.out.print("> Description service of selected insurance type : ");
                                description_of_insuarnce = KEKW.nextLine();
                                System.out.print("> Method of payment [Monthly/Annually] :");
                                payment_method = KEKW.next(); // never used 
                                System.out.print("> When do you want to start your Membership service :");
                                starting_date = KEKW.next(); // never used 
                                System.out.print("> Quantity required : ");
                                amount_of_insuarnce = KEKW.nextInt();
                                System.out.print("> Preferred appointment time [morning/afternoon]: ");
                                starting_time = KEKW.next();
                                System.out.printf("-------------------------------------------------------------------------------------\n"
                                        + " | Your request was received; you will be contacted within 24 hours to finalize it. |\n"
                                        + " -----------------------------------------------------------------------------------\n"
                                        + " Here is a confirmation of your request to %S INSURANCE:\n"
                                        + "	An appointment Confirmation with company representative\n"
                                        + "	Name:  %s                  Phone:  %s\n"
                                        + "	Insurance Type: %s\n"
                                        + "	Insurance sub-Type : %s\n"
                                        + "	Number of Quantities: %d\n"
                                        + "	Preferred date for  appointment: %s\n"
                                        + "\n"
                                        + "	**You will now be returned to the Membership Menu.\n", type_of_insurance, name, mobile, type_of_insurance,
                                        description_of_insuarnce, amount_of_insuarnce, starting_time);
                                count_request_memebership_life++;

                            }
                            if (loop_two == 2) {
                                KEKW.nextLine();
                                System.out.print("> Enter your name (first and last): ");
                                name = KEKW.nextLine();

                                System.out.print("> Enter your mobile (##-###-####): ");
                                mobile = KEKW.next();

                                System.out.print("> Enter type of the insurance Life or Health or Car name: ");
                                type_of_insurance = KEKW.next();
                                KEKW.nextLine();
                                System.out.print("> Enter the description service of the selected insurance type  : ");
                                description_of_insuarnce = KEKW.nextLine(); // never used 

                                System.out.print("> Method of payment Monthly or Annually : ");
                                payment_method = KEKW.next();

                                System.out.print("> When do you want to start your Membership service : ");
                                starting_date = KEKW.next();

                                System.out.print("> Enter number of quantities of this service you want: ");
                                amount_of_insuarnce = KEKW.nextInt();

                                System.out.print("> Please enter the cost of the selected type insurance: ");
                                cost_of_insuarnce = KEKW.nextInt();
                                double paid = (amount_of_insuarnce * cost_of_insuarnce);

                                System.out.println("------------------------------------------------------------------------------------\n"
                                        + " | Your request was received; you will be contacted within 24 hours to finalize it. |\n"
                                        + " -----------------------------------------------------------------------------------");
                                System.out.printf("Here is a confirmation of your request to %S INSURANCE:\n"
                                        + "	The confirmation of the type insurance and the amount you have paid\n"
                                        + "	Name:  %s                     Phone:  %s\n"
                                        + "	the starting date of the membership: %s\n"
                                        + "	Preferred payment method monthly or annually : %s\n"
                                        + "	The amount you have paid is: %.1f\n"
                                        + "\n"
                                        + "	**You will now be returned to the Membership Menu.\n", type_of_insurance, name, mobile,
                                        starting_date, payment_method, paid);
                                count_request_memebership_life++;

                            }
                        }
                    }
                    if (Character.toUpperCase(char_for_loop_insurance_one) == 'H') {      // MIGHT NEED TO CHANGE THIS 
                        while (loop_two != 3) {
                            System.out.println(membership_screen);
                            System.out.print(" > Please enter the choice: ");
                            loop_two = KEKW.nextInt();
                            if (loop_two == 1) {      // WHAT DO I WRITE HERE ?
                                KEKW.nextLine();
                                System.out.print("> Enter your name (first and last):");
                                name = KEKW.nextLine();
                                System.out.print("> Enter your mobile (##-###-####):");
                                mobile = KEKW.next();
                                System.out.print("> Type of insurance [Life/Health/Car] : ");
                                type_of_insurance = KEKW.next();
                                KEKW.nextLine();
                                System.out.print("> Description service of selected insurance type : ");
                                description_of_insuarnce = KEKW.nextLine();
                                System.out.print("> Method of payment [Monthly/Annually] :");
                                payment_method = KEKW.next(); // never used 
                                System.out.print("> When do you want to start your Membership service :");
                                starting_date = KEKW.next(); // never used 
                                System.out.print("> Quantity required : ");
                                amount_of_insuarnce = KEKW.nextInt();
                                System.out.print("> Preferred appointment time [morning/afternoon]: ");
                                starting_time = KEKW.next();
                                System.out.printf("-------------------------------------------------------------------------------------\n"
                                        + " | Your request was received; you will be contacted within 24 hours to finalize it. |\n"
                                        + " -----------------------------------------------------------------------------------\n"
                                        + " Here is a confirmation of your request to %S INSURANCE:\n"
                                        + "	An appointment Confirmation with company representative\n"
                                        + "	Name:  %s                  Phone:  %s\n"
                                        + "	Insurance Type: %s\n"
                                        + "	Insurance sub-Type : %s\n"
                                        + "	Number of Quantities: %d\n"
                                        + "	Preferred date for  appointment: %s\n"
                                        + "\n"
                                        + "	**You will now be returned to the Membership Menu.\n", type_of_insurance, name, mobile, type_of_insurance,
                                        description_of_insuarnce, amount_of_insuarnce, starting_time);
                                count_request_memebership_health++;
                            }
                            if (loop_two == 2) {
                                KEKW.nextLine();
                                System.out.print("> Enter your name (first and last): ");
                                name = KEKW.nextLine();

                                System.out.print("> Enter your mobile (##-###-####): ");
                                mobile = KEKW.next();

                                System.out.print("> Enter type of the insurance Life or Health or Car name: ");
                                type_of_insurance = KEKW.next();
                                KEKW.nextLine();
                                System.out.print("> Enter the description service of the selected insurance type  : ");
                                description_of_insuarnce = KEKW.nextLine(); // never used 

                                System.out.print("> Method of payment Monthly or Annually : ");
                                payment_method = KEKW.next();

                                System.out.print("> When do you want to start your Membership service : ");
                                starting_date = KEKW.next();

                                System.out.print("> Enter number of quantities of this service you want: ");
                                amount_of_insuarnce = KEKW.nextInt();

                                System.out.print("> Please enter the cost of the selected type insurance: ");
                                cost_of_insuarnce = KEKW.nextInt();
                                double paid = (amount_of_insuarnce * cost_of_insuarnce);

                                System.out.println("------------------------------------------------------------------------------------\n"
                                        + " | Your request was received; you will be contacted within 24 hours to finalize it. |\n"
                                        + " -----------------------------------------------------------------------------------");
                                System.out.printf("Here is a confirmation of your request to %S INSURANCE:\n"
                                        + "	The confirmation of the type insurance and the amount you have paid\n"
                                        + "	Name:  %s                     Phone:  %s\n"
                                        + "	the starting date of the membership: %s\n"
                                        + "	Preferred payment method monthly or annually : %s\n"
                                        + "	The amount you have paid is: %.1f\n"
                                        + "\n"
                                        + "	**You will now be returned to the Membership Menu.\n", type_of_insurance, name, mobile,
                                        starting_date, payment_method, paid);
                                count_request_memebership_health++;

                            }
                        }
                    }
                    if (Character.toUpperCase(char_for_loop_insurance_one) == 'C') {      // MIGHT NEED TO CHANGE THIS 
                        while (loop_two != 3) {
                            System.out.println(membership_screen);
                            System.out.print(" > Please enter the choice: ");
                            loop_two = KEKW.nextInt();
                            if (loop_two == 1) {      // WHAT DO I WRITE HERE ?
                                KEKW.nextLine();
                                System.out.print("> Enter your name (first and last):");
                                name = KEKW.nextLine();
                                System.out.print("> Enter your mobile (##-###-####):");
                                mobile = KEKW.next();
                                System.out.print("> Type of insurance [Life/Health/Car] : ");
                                type_of_insurance = KEKW.next();
                                KEKW.nextLine();
                                System.out.print("> Description service of selected insurance type : ");
                                description_of_insuarnce = KEKW.nextLine();
                                System.out.print("> Method of payment [Monthly/Annually] :");
                                payment_method = KEKW.next(); // never used 
                                System.out.print("> When do you want to start your Membership service :");
                                starting_date = KEKW.next(); // never used 
                                System.out.print("> Quantity required : ");
                                amount_of_insuarnce = KEKW.nextInt();
                                System.out.print("> Preferred appointment time [morning/afternoon]: ");
                                starting_time = KEKW.next();
                                System.out.printf("-------------------------------------------------------------------------------------\n"
                                        + " | Your request was received; you will be contacted within 24 hours to finalize it. |\n"
                                        + " -----------------------------------------------------------------------------------\n"
                                        + " Here is a confirmation of your request to %S INSURANCE:\n"
                                        + "	An appointment Confirmation with company representative\n"
                                        + "	Name:  %s                  Phone:  %s\n"
                                        + "	Insurance Type: %s\n"
                                        + "	Insurance sub-Type : %s\n"
                                        + "	Number of Quantities: %d\n"
                                        + "	Preferred date for  appointment: %s\n"
                                        + "\n"
                                        + "	**You will now be returned to the Membership Menu.\n", type_of_insurance, name, mobile, type_of_insurance,
                                        description_of_insuarnce, amount_of_insuarnce, starting_time);
                                count_request_memebership_car++;
                            }
                            if (loop_two == 2) {
                                KEKW.nextLine();
                                System.out.print("> Enter your name (first and last): ");
                                name = KEKW.nextLine();

                                System.out.print("> Enter your mobile (##-###-####): ");
                                mobile = KEKW.next();

                                System.out.print("> Enter type of the insurance Life or Health or Car name: ");
                                type_of_insurance = KEKW.next();
                                KEKW.nextLine();
                                System.out.print("> Enter the description service of the selected insurance type  : ");
                                description_of_insuarnce = KEKW.nextLine(); //never used 

                                System.out.print("> Method of payment Monthly or Annually : ");
                                payment_method = KEKW.next();

                                System.out.print("> When do you want to start your Membership service : ");
                                starting_date = KEKW.next();

                                System.out.print("> Enter number of quantities of this service you want: ");
                                amount_of_insuarnce = KEKW.nextInt();

                                System.out.print("> Please enter the cost of the selected type insurance: ");
                                cost_of_insuarnce = KEKW.nextInt();
                                double paid = (amount_of_insuarnce * cost_of_insuarnce);

                                System.out.println("------------------------------------------------------------------------------------\n"
                                        + " | Your request was received; you will be contacted within 24 hours to finalize it. |\n"
                                        + " -----------------------------------------------------------------------------------");
                                System.out.printf("Here is a confirmation of your request to %S INSURANCE:\n"
                                        + "	The confirmation of the type insurance and the amount you have paid\n"
                                        + "	Name:  %s                     Phone:  %s\n"
                                        + "	the starting date of the membership: %s\n"
                                        + "	Preferred payment method monthly or annually : %s\n"
                                        + "	The amount you have paid is: %.1f\n"
                                        + "\n"
                                        + "	**You will now be returned to the Membership Menu.\n", type_of_insurance, name, mobile,
                                        starting_date, payment_method, paid);
                                count_request_memebership_car++;

                            }
                        }
                    }

                }
            }
            if (loop_one == '3') {
                while (Character.toUpperCase(char_for_loop_insurance_one) != 'R') {
                    loop_three = 0;
                    System.out.println(services_screen);
                    System.out.print(" > Please enter the choice: ");
                    char_for_loop_insurance_one = KEKW.next().charAt(0);
                    if (Character.toUpperCase(char_for_loop_insurance_one) == 'L') {
                        while (loop_three != 3) {
                            System.out.println(CC_screen);
                            System.out.print(" > Please enter the choice: ");
                            loop_three = KEKW.nextInt();
                            if (loop_three == 1) {
                                KEKW.nextLine();
                                System.out.print(" > Enter your name (first and last): ");
                                name = KEKW.nextLine();

                                System.out.print(" > Enter your mobile (##-###-####): ");
                                mobile = KEKW.next();
                                KEKW.nextLine();
                                System.out.print(" > Enter your claim (on one line only): ");
                                claim = KEKW.nextLine();

                                System.out.printf("--------------------------------------------------------------------------------------\n"
                                        + " | Your Claim / Complaint was submitted successfully; you will contact you shortly.  |\n"
                                        + " -------------------------------------------------------------------------------------\n"
                                        + " Here is a confirmation of your submission to LIFE INSURANCE:\n"
                                        + "	Submission Type: claim\n"
                                        + "	Name:  %s                     Phone:  %s\n"
                                        + "	Claim:\n"
                                        + "	\"%s \"\n"
                                        + "\n"
                                        + "	**You will now be returned to the Claim and Complaint  Menu.\n", name, mobile, claim);
                                count_CC_life++;

                            }
                            if (loop_three == 2) {
                                KEKW.nextLine();
                                System.out.print(" > Enter your name (first and last): ");
                                name = KEKW.nextLine();

                                System.out.print(" > Enter your mobile (##-###-####): ");
                                mobile = KEKW.next();
                                KEKW.nextLine();
                                System.out.print(" > Enter your complaint (on one line only): ");
                                claim = KEKW.nextLine();

                                System.out.printf("--------------------------------------------------------------------------------------\n"
                                        + " | Your Claim / Complaint was submitted successfully; you will contact you shortly.  |\n"
                                        + " -------------------------------------------------------------------------------------\n"
                                        + " Here is a confirmation of your submission to LIFE INSURANCE:\n"
                                        + "	Submission Type: complaint\n"
                                        + "	Name:  %s                     Phone:  %s\n"
                                        + "	Complaint:\n"
                                        + "	\"%s \"\n"
                                        + "\n"
                                        + "	**You will now be returned to the Claim and Complaint  Menu.\n", name, mobile, claim);
                                count_CC_life++;

                            }

                        }
                    }
                    if (Character.toUpperCase(char_for_loop_insurance_one) == 'C') {
                        while (loop_three != 3) {
                            System.out.println(CC_screen);
                            System.out.print(" > Please enter the choice: ");
                            loop_three = KEKW.nextInt();
                            if (loop_three == 1) {
                                KEKW.nextLine();
                                System.out.print(" > Enter your name (first and last): ");
                                name = KEKW.nextLine();

                                System.out.print(" > Enter your mobile (##-###-####): ");
                                mobile = KEKW.next();
                                KEKW.nextLine();
                                System.out.print(" > Enter your claim (on one line only): ");
                                claim = KEKW.nextLine();

                                System.out.printf("--------------------------------------------------------------------------------------\n"
                                        + " | Your Claim / Complaint was submitted successfully; you will contact you shortly.  |\n"
                                        + " -------------------------------------------------------------------------------------\n"
                                        + " Here is a confirmation of your submission to CAR INSURANCE:\n"
                                        + "	Submission Type: claim\n"
                                        + "	Name:  %s                     Phone:  %s\n"
                                        + "	Claim:\n"
                                        + "	\"%s \"\n"
                                        + "\n"
                                        + "	**You will now be returned to the Claim and Complaint  Menu.\n", name, mobile, claim);
                                count_CC_car++;

                            }
                            if (loop_three == 2) {
                                KEKW.nextLine();
                                System.out.print(" > Enter your name (first and last): ");
                                name = KEKW.nextLine();

                                System.out.print(" > Enter your mobile (##-###-####): ");
                                mobile = KEKW.next();
                                KEKW.nextLine();
                                System.out.print(" > Enter your complaint (on one line only): ");
                                claim = KEKW.nextLine();

                                System.out.printf("--------------------------------------------------------------------------------------\n"
                                        + " | Your Claim / Complaint was submitted successfully; you will contact you shortly.  |\n"
                                        + " -------------------------------------------------------------------------------------\n"
                                        + " Here is a confirmation of your submission to CAR INSURANCE:\n"
                                        + "	Submission Type: complaint\n"
                                        + "	Name:  %s                     Phone:  %s\n"
                                        + "	Complaint:\n"
                                        + "	\"%s \"\n"
                                        + "\n"
                                        + "	**You will now be returned to the Claim and Complaint  Menu.\n", name, mobile, claim);
                                count_CC_car++;

                            }

                        }
                    }
                    if (Character.toUpperCase(char_for_loop_insurance_one) == 'H') {
                        while (loop_three != 3) {
                            System.out.println(CC_screen);
                            System.out.print(" > Please enter the choice: ");
                            loop_three = KEKW.nextInt();
                            if (loop_three == 1) {
                                KEKW.nextLine();
                                System.out.print(" > Enter your name (first and last): ");
                                name = KEKW.nextLine();

                                System.out.print(" > Enter your mobile (##-###-####): ");
                                mobile = KEKW.next();
                                KEKW.nextLine();
                                System.out.print(" > Enter your claim (on one line only): ");
                                claim = KEKW.nextLine();

                                System.out.printf("--------------------------------------------------------------------------------------\n"
                                        + " | Your Claim / Complaint was submitted successfully; you will contact you shortly.  |\n"
                                        + " -------------------------------------------------------------------------------------\n"
                                        + " Here is a confirmation of your submission to HEALTH INSURANCE:\n"
                                        + "	Submission Type: claim\n"
                                        + "	Name:  %s                     Phone:  %s\n"
                                        + "	Claim:\n"
                                        + "	\"%s \"\n"
                                        + "\n"
                                        + "	**You will now be returned to the Claim and Complaint  Menu.\n", name, mobile, claim);
                                count_CC_health++;

                            }
                            if (loop_three == 2) {
                                KEKW.nextLine();
                                System.out.print(" > Enter your name (first and last): ");
                                name = KEKW.nextLine();

                                System.out.print(" > Enter your mobile (##-###-####): ");
                                mobile = KEKW.next();
                                KEKW.nextLine();
                                System.out.print(" > Enter your complaint (on one line only): ");
                                claim = KEKW.nextLine();

                                System.out.printf("--------------------------------------------------------------------------------------\n"
                                        + " | Your Claim / Complaint was submitted successfully; you will contact you shortly.  |\n"
                                        + " -------------------------------------------------------------------------------------\n"
                                        + " Here is a confirmation of your submission to HEALTH INSURANCE:\n"
                                        + "	Submission Type: complaint\n"
                                        + "	Name:  %s                     Phone:  %s\n"
                                        + "	Complaint:\n"
                                        + "	\"%s \"\n"
                                        + "\n"
                                        + "	**You will now be returned to the Claim and Complaint  Menu.\n", name, mobile, claim);
                                count_CC_health++;

                            }

                        }
                    }
                }
            }
        }
        System.out.printf("***SUMMARY Activity for\n"
                + " World Insurance Company:\n"
                + "Insurance Type     # query for Insurance     # of request Membership     # of Claim & Complaint \n"
                + "--------------------------------------------------------------------------------------------------\n"
                + "Life                          %d                        %d                             %d\n"
                + "Health                        %d                        %d                             %d\n"
                + "Car                           %d                        %d                             %d\n", count_life_query, count_request_memebership_life, count_CC_life,
                count_health_query, count_request_memebership_health, count_CC_health, count_car_query, count_request_memebership_car, count_CC_car);
    }
}
