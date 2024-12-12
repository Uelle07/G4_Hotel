package tester;
import java.util.Scanner;
import java.text.DecimalFormat;
public class HotelG4_MethodDesigns {
    //Second Method Design:
   
    public static void mainMenu() 
    {
        DecimalFormat df = new DecimalFormat("0.00");
        
        double standard = 1800.00;
        double deluxe = 2300.00;
        double suite = 3000.00;
        
        System.out.println();
        System.out.println("           " + "_________");
        System.out.println("           " + "Main Menu");
        System.out.println("--------------------------------");
        System.out.println("Here are the lists of our Rooms:");
        System.out.println();
        System.out.println("[A] Standard Room");
        System.out.println("        " + "PHP " + df.format(standard) + " per night");
        System.out.println();
        System.out.println("[B] Deluxe Room");
        System.out.println("        " + "PHP " +df.format(deluxe) + " per night");
        System.out.println();
        System.out.println("[C] Suite Room");
        System.out.println("        " + "PHP " + df.format(suite) + " per night");
        System.out.println();
        System.out.println("[X] to Exit the Program");
        System.out.println("--------------------------------");
    }
    
    public static double extra_Charge_Deluxe (int Number_Of_Nights, int Number_Of_Guests, double deluxe_room_price)  
    {
        double room_charge = deluxe_room_price * 0.10;
        
        double final_room_charge = room_charge + deluxe_room_price;
        
        double totalBill = final_room_charge * Number_Of_Guests * Number_Of_Nights;
        
        return totalBill;
    }
    
    public static double extra_Charge_Suite(int Number_Of_Nights, int Number_Of_Guests, double suite_room_price) 
    {
        double room_charge = suite_room_price * 0.10;
        
        double final_room_charge = room_charge + suite_room_price; //price of the room
           
        double totalBill = final_room_charge * Number_Of_Guests * Number_Of_Nights;
        
        return totalBill;
    }
    
    //First Method Design:
    public static void main(String[] args) 
    {         
        //Scanners
        Scanner input = new Scanner(System.in);
        
        //Variables
        String Name;
        DecimalFormat df = new DecimalFormat("0.00");
         double standard_room_price = 1800.00;
        double deluxe_room_price = 2300.00;
        double suite_room_price = 3000.00;       
        char Program;
        char Room_Choice;
        char Confirmation;
        int Number_Of_Guests;
        int Number_Of_Nights;
        double Total_Bill;
        double Total_Bill_VAT;
        double VAT_Calculation_Standard;
        double VAT_Calculation_Deluxe;
        double additional_deluxe_charge;
        double Guests_Receipt;
        double Nights_Receipt;
        double additional_suite_charge;
        double VAT_Calculation_Suite;
                
        while(true) 
        {
            System.out.println("Welcome to the G4 Hotel Interface!");
            System.out.println();

            System.out.println("Press [C] to book a room.");
            System.out.println("Press [X] anytime that you want to leave the program.");
            System.out.println();
            Program = input.next().toUpperCase().charAt(0);
            input.nextLine();
            
            switch(Program){
                case 'X':{
                    System.out.println("Thank you. Take care and see you again next time!");
                break;
                }
                case 'C':{
                    do
                    {
                        System.out.println();
                        System.out.println("Enter Your Name To Book A Room.");
                        System.out.print("Name: ");
                        Name = input.nextLine();       
    
                        if(Name.length() == 0 || Name.length() == 1) 
                        {
                            System.out.println("Please input a valid name!");
                        }
    
                    }while(Name.length() == 0 || Name.length() == 1);
    
                     System.out.println();
                    System.out.println("---------------------------------------------------");
                    System.out.println("How would you like us to address you?");
                    System.out.println();
                    System.out.println("Press [F] for Female");
                    System.out.println();
                    System.out.println("Press [M] for Male");
                    System.out.println();
                    System.out.println("Press [R] for Rather Not Say");
                    System.out.println("---------------------------------------------------");
                    char Gender = input.next().toUpperCase().charAt(0);
                    
                    if(Gender == 'F') 
                    {
                        System.out.println();
                        System.out.println("Welcome to the G4 Hotel Ms./Ma'am " + Name + ", Where Your Comfort And Security Is Our Utmost Priority!");      
                    }
                    else if(Gender == 'M') 
                    {
                        System.out.println();
                        System.out.println("Welcome to the G4 Hotel Mr./Sir " + Name + ", Where Your Comfort And Security Is Our Utmost Priority!");      
                    }
                    else if(Gender == 'R') 
                    {
                        System.out.println();
                        System.out.println("Welcome to the G4 Hotel Mx. " + Name + ", where your comfort and security is our utmost priority!");      
                    }
                    else
                    {   
                        do
                        {
                            System.out.println("Please enter a valid code.");
                            System.out.println("Enter: ");
                            Gender = input.next().toUpperCase().charAt(0);                
                            
                            if(Gender == 'F') 
                            {
                                System.out.println();
                                System.out.println("Welcome to the G4 Hotel Ms./Ma'am " + Name + ", where your comfort and security is our utmost priority!");      
                                break;
                            }
                            else if(Gender == 'M') 
                            {
                                System.out.println();
                                System.out.println("Welcome to the G4 Hotel Mr./Sir " + Name + ", where your comfort and security is our utmost priority!");      
                                break;
                            }
                            else if(Gender == 'R') 
                            {
                                System.out.println();
                                System.out.println("Welcome to the G4 Hotel Mx. " + Name + ", where your comfort and security is our utmost priority!");      
                                break;
                            }
                        }while(Gender != 'F' || Gender != 'M' || Gender != 'R');
                    }
                
                    while(true) 
                    {
                        System.out.println();
                        mainMenu();
                        System.out.print("Please Choose A Room: ");
                        Room_Choice = input.next().toUpperCase().charAt(0);
                       
                        switch(Room_Choice) 
                        {
                            case 'A': 
                                System.out.println("Are you sure that you are choosing the Standard Room? Y/N");
                                Confirmation = input.next().toUpperCase().charAt(0);
                                
                                if(Confirmation == 'Y') 
                                {
                                    System.out.println();
                                    System.out.println("Standard Room Confirmed.");
                                    System.out.println();
                                    System.out.println("***********************************************************************");
                                    System.out.println("Take Note: ");
                                    System.out.println("        " + "The guest/s in the Standard Room must not exceed to Two (2)");
                                    System.out.println("***********************************************************************");
                                    System.out.println();
                                
                                    do
                                    {
                                        System.out.println("Enter the number of guests for this room.");
                                        System.out.print("Number of Guests: ");
                                        Number_Of_Guests = input.nextInt();
                                        
                                        if(Number_Of_Guests > 2) 
                                        {
                                            System.out.println("We are sorry to inform you but the Standard Room cannot contain more than Two (2) Guests.");
                                            System.out.println();
                                        }
                                        
                                        else if(Number_Of_Guests <= -1 || Number_Of_Guests == 0) 
                                        {
                                            System.out.println("Please Enter a Valid Number!");
                                            System.out.println();
                                        }
                                    
                                    }while(Number_Of_Guests > 2 || Number_Of_Guests <= -1 || Number_Of_Guests == 0);
                                    
                                    System.out.println();
                                    System.out.println("You have booked the Standard Room for " + Number_Of_Guests + ". Is this correct? Y/N");
                                    Confirmation = input.next().toUpperCase().charAt(0);
                                    
                                    if(Confirmation == 'Y') 
                                    {
                                        System.out.println();
                                        System.out.println();
                                        System.out.println();
                                        System.out.println("()()()()()()()()()()()()()()()()()()");
                                        System.out.println();
                                        System.out.println("        Room for " + Number_Of_Guests + " Confirmed.");
                                        System.out.println();
                                        System.out.println("()()()()()()()()()()()()()()()()()()");
                                        System.out.println();
                                        System.out.println();
                                        System.out.println();
                                        
                                        do
                                        {
                                            System.out.println();
                                            System.out.println("For how many nights are you staying?");
                                            System.out.print("Number of Nights: ");
                                            Number_Of_Nights = input.nextInt();
                                            
                                            if(Number_Of_Nights <= -1 || Number_Of_Nights == 0) 
                                            {
                                                System.out.println("Please Enter A Valid Number!");
                                                System.out.println();
                                            }
                                            
                                        }while(Number_Of_Nights <= -1 || Number_Of_Nights == 0);
                                        
                                        System.out.println();
                                        System.out.println("You entered " + Number_Of_Nights + '.' + " Is this correct? Y/N");
                                        Confirmation = input.next().toUpperCase().charAt(0);
                                        
                                        if(Confirmation == 'Y') 
                                        {
                                            System.out.println();
                                            System.out.println();
                                            System.out.println();
                                            System.out.println("()()()()()()()()()()()()()()()()()()()()()()()");
                                            System.out.println();
                                            System.out.println("     Standard Room For " + Number_Of_Nights + " Days Confirmed.");
                                            System.out.println();
                                            System.out.println("()()()()()()()()()()()()()()()()()()()()()()()");
                                            System.out.println();
                                            System.out.println();
                                            System.out.println();
                                            
                                            Total_Bill = standard_room_price * Number_Of_Guests * Number_Of_Nights;
                                            Total_Bill_VAT = Total_Bill * 0.12 + Total_Bill;
                                            VAT_Calculation_Standard = Total_Bill * 0.12;
                                            Guests_Receipt = standard_room_price * Number_Of_Guests;
                                            Nights_Receipt = Guests_Receipt * Number_Of_Nights;
    
                                            System.out.println("______________________________________________________________________");
                                            System.out.println();
                                            System.out.println("Below Are The Specific Values: ");
                                            System.out.println();
                                            System.out.println("Room Rate                                   : " +  "PHP " + df.format(standard_room_price));
                                            System.out.println();
                                            System.out.println("Amount Due For Each Person                  : " + "PHP " + df.format(standard_room_price));
                                            System.out.println();
                                            System.out.println("Amount Due For Each Night                   : " + "PHP " + df.format(standard_room_price));
                                            System.out.println();
                                            System.out.println("Value-Added Tax (VAT)                      : " + " 12% or PHP " + df.format(VAT_Calculation_Standard));
                                            System.out.println();
                                            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                            System.out.println();
                                            System.out.println("Computation Of Your Total Bill: ");
                                            System.out.println();
                                            System.out.println("Amount Due For Number Of Person (" +  Number_Of_Guests +")         : " + " PHP " + df.format(Guests_Receipt));
                                            System.out.println();
                                            System.out.println("                                                            x");
                                            System.out.println();
                                            System.out.println("Amount Due For The Nights Stayed (" + Number_Of_Nights + ")        : " + " PHP " + df.format(Nights_Receipt));
                                            System.out.println();
                                            System.out.println("                                                            +");
                                            System.out.println();
                                            System.out.println("Value-Added Tax (VAT)                       : " + "PHP " + df.format(VAT_Calculation_Standard));
                                            System.out.println();
                                            System.out.println("______________________________________________________________________");
                                            System.out.println();
                                            System.out.println("Total Amount Due                            : " + "PHP " +df.format(Total_Bill_VAT));                                        
                                            
                                            System.out.println();
                                            System.out.println();
                                            System.out.println("Would you like to create another transaction? Y/N");
                                            Confirmation = input.next().toUpperCase().charAt(0);
                                            
                                            if(Confirmation == 'Y') 
                                            {
                                                System.out.println();
                                                System.out.println();
                                                System.out.println("You have been returned to the Main Menu.");
                                                System.out.println();
                                                break;
                                            }
                                            else if(Confirmation == 'N') 
                                            {
                                                System.out.println("Thank you for your transaction! Take care!");
                                                return;
                                            }
                                            else 
                                            {
                                                do
                                                {
                                                    System.out.println();
                                                    System.out.println("Please Enter A Valid Code! ");
                                                    System.out.println("Enter: ");
                                                }while(Confirmation != 'Y' || Confirmation != 'N');
                                            }                                      
                                        }
                                                                            
                                        if(Confirmation == 'N') 
                                        {
                                            System.out.println();
                                            System.out.println("It seems that your process has not been confirmed.");
                                            System.out.println("You have been returned to the Main Menu.");
                                            break;
                                        }
                                    }     
                                    
                                    else if(Confirmation == 'N') 
                                    {
                                        System.out.println();
                                        System.out.println("It seems that the process has not been confirmed.");
                                        System.out.println("You have been returned to the Main Menu.");
                                        break;
                                    }
                                }
                                
                                else if(Confirmation == 'N') 
                                {
                                    System.out.println();
                                    System.out.println("Press [X] if you want to Exit the Program.");
                                    System.out.println("Press [M] if you want to return to the Main Menu.");
                                    Program = input.next().toUpperCase().charAt(0);
                                    
                                    if(Program == 'M') 
                                    {
                                        System.out.println("You have now returned to the Main Menu.");
                                        break;
                                    }
                                    else if(Program == 'X') 
                                    {
                                        System.out.println("Are you sure that you want to Exit the Program? Y/N");
                                        Confirmation = input.next().toUpperCase().charAt(0);
                                        if(Confirmation == 'Y') 
                                        {
                                            System.out.println("You have now exited the G4 Hotel Interface. Thank You & See You Next Time!");
                                            return;
                                        }
                                        else if(Confirmation == 'N') 
                                        {
                                            System.out.println("Since you did not confirm, you have been returned to the G4 Hotel's Main Menu.");
                                            break;
                                        }
                                        else
                                        {
                                            do
                                            {
                                                System.out.println("Please Enter A Valid Code!");
                                                System.out.print("Enter: ");
                                            }while(Confirmation != 'Y' || Confirmation != 'X');
                                        }
                                    }
                                }
                                
                            case 'B':
                                System.out.println("Are you sure that you are choosing the Deluxe Room? Y/N");
                                Confirmation = input.next().toUpperCase().charAt(0);
                                
                                if(Confirmation == 'Y') 
                                {
                                    System.out.println("Thank you for confirming.");
                                    System.out.println();
                                    System.out.println("********************************************************************************************************************************************************");
                                    System.out.println("Take Note: ");
                                    System.out.println("        " + "The Deluxe Room can only contain Two (2) People only but we are allowing to have an additional One (1) Person or Three (3) Person Max.");
                                    System.out.println("        " + "If you are to have Three (3) Guests in this room, there is an additional 10% for the Room Rate Per Person Per Night.");
                                    System.out.println("********************************************************************************************************************************************************");
                                    System.out.println();
                                
                                    do
                                    {
                                        System.out.println("Enter the number of guests for this room.");
                                        System.out.print("Number of Guests: ");
                                        Number_Of_Guests = input.nextInt();
                                        
                                        if(Number_Of_Guests > 3) 
                                        {
                                            System.out.println("We are sorry to inform you but the Deluxe Room cannot contain more than Three (3) Guests.");
                                            System.out.println();
                                        }
                                        
                                        else if(Number_Of_Guests <= -1 || Number_Of_Guests == 0) 
                                        {
                                            System.out.println("Please Enter a Valid Number!");
                                            System.out.println();
                                        }
                                    
                                    }while(Number_Of_Guests > 3 || Number_Of_Guests <= -1 || Number_Of_Guests == 0);
                                    
                                    System.out.println();
                                    System.out.println("You have successfully booked the Deluxe Room for " + Number_Of_Guests + '.');
                                    System.out.println("Is this correct? Y/N");
                                    Confirmation = input.next().toUpperCase().charAt(0);
                                    
                                    if(Confirmation == 'Y') 
                                    {
                                        System.out.println();
                                        System.out.println("()()()()()()()()()()()()()()()");
                                        System.out.println();
                                        System.out.println("     Room for " + Number_Of_Guests + " Confirmed.");
                                        System.out.println();
                                        System.out.println("()()()()()()()()()()()()()()()");
                                        
                                        do
                                        {
                                            System.out.println();
                                            System.out.println("For how many nights are you staying?");
                                            System.out.print("Number of Nights: ");
                                            Number_Of_Nights = input.nextInt();
                                            
                                            if(Number_Of_Nights <= -1 || Number_Of_Nights == 0) 
                                            {
                                                System.out.println("Please Enter A Valid Number!");
                                                System.out.println();
                                            }
                                            
                                        }while(Number_Of_Nights <= -1 || Number_Of_Nights == 0);
                                        
                                        System.out.println();
                                        System.out.println("You entered " + Number_Of_Nights + '.' + "Is this correct? Y/N");
                                        Confirmation = input.next().toUpperCase().charAt(0);
                                        
                                        if(Confirmation == 'Y') 
                                        {
                                            if(Number_Of_Guests == 3) 
                                            {
                                               
                                                Total_Bill = extra_Charge_Deluxe(Number_Of_Nights, Number_Of_Guests, deluxe_room_price);
                                                
                                                 additional_deluxe_charge = (deluxe_room_price * 0.10) + deluxe_room_price;
                                                Guests_Receipt = additional_deluxe_charge * Number_Of_Guests;
                                                Nights_Receipt = Guests_Receipt * Number_Of_Nights;
                                                         
                                                VAT_Calculation_Deluxe = Total_Bill * 0.12;
                                                Total_Bill_VAT = VAT_Calculation_Deluxe + Total_Bill;
                                                
                                                System.out.println();
                                                System.out.println("_______________________________________________________________________________________________________________");
                                                System.out.println("_______________________________________________________________________________________________________________");
                                                System.out.println();
                     
                                                System.out.println("Below are the Specific Values: ");
                                                System.out.println();
                                                System.out.println("Original Deluxe Room Price                                      :" + "  PHP " + df.format(deluxe_room_price));
                                                System.out.println();
                                                System.out.println("Deluxe Room Price W/ Additional 10% Charge                      : " + " PHP " + df.format(additional_deluxe_charge));
                                                System.out.println();
                                                System.out.println("Amount Due For Each Guests                                      : " + " PHP " + df.format(deluxe_room_price));
                                                System.out.println();
                                                System.out.println("Amount Due For Each Night                                       : " + " PHP " + df.format(deluxe_room_price));
                                                System.out.println();
                                                System.out.println("Total Amount Due For Each Night Stayed                          : " + " PHP " + df.format((additional_deluxe_charge * Number_Of_Nights)));
                                                System.out.println();
                                                System.out.println("Amount Due For the 12% VAT                                      : " + " PHP " + df.format(VAT_Calculation_Deluxe));
                                                System.out.println();
                                                
                                                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                                   
                                                System.out.println();
                                                System.out.println("Below Is The Calculation Process For Your Total Bill: ");
                                                System.out.println();
                                                System.out.println("Deluxe Room Charge With 10% Charge                              : " + "   PHP " + df.format(additional_deluxe_charge));
                                                System.out.println();
                                                System.out.println("                                                                                                    " + 'x');
                                                System.out.println();
                                                System.out.println("Due Of The Total Number Of Guests " + '(' + Number_Of_Guests + ')' +"                           :" + "    PHP " + df.format(additional_deluxe_charge) + " multiplied by " + Number_Of_Guests);
                                                System.out.println();
                                                System.out.println("                                                                :" + "    PHP " + df.format(additional_deluxe_charge * Number_Of_Guests));
                                                System.out.println();
                                                System.out.println("                                                                                                    " + 'x');
                                                System.out.println();
                                                System.out.println("Due Of The Total Number Of Nights " + '(' + Number_Of_Nights + ')' + "                           :"+"    PHP " +df.format(additional_deluxe_charge) + " multiplied by " + Number_Of_Nights);
                                                System.out.println();
                                                System.out.println("                                                                :"+"    PHP " + df.format(Nights_Receipt));
                                                System.out.println();
                                                System.out.println("                                                                                                    " + '+');
                                                System.out.println();
                                                System.out.println("12% Of The Total Bill                                           : " + "    PHP " +df.format(VAT_Calculation_Deluxe));
                                                System.out.println("_______________________________________________________________________________________________________________");
                                                System.out.println();
                                                System.out.println("Total Bill                                                      : "  + "   PHP " + df.format(Nights_Receipt) + " + PHP " + df.format(VAT_Calculation_Deluxe));
                                                System.out.println("                                                                :" + "    PHP " + df.format(Total_Bill_VAT));
                                                System.out.println("_______________________________________________________________________________________________________________");
                                                System.out.println("_______________________________________________________________________________________________________________");
                                            }
                                            
                                            else
                                            {
                                                Total_Bill = deluxe_room_price * Number_Of_Guests * Number_Of_Nights;
                                                Total_Bill_VAT = Total_Bill * 0.12 + Total_Bill;
                                                System.out.println("_____________________________________________");
                                                System.out.println();
                                                System.out.println("Total Bill                    : " + "PHP " +df.format(Total_Bill));
                                                System.out.println("Value-Added Tax (VAT)         : " + "12%");
                                                System.out.println();
                                                System.out.println("_____________________________________________");
                                                System.out.println("Total Bill: PHP " + df.format(Total_Bill_VAT));                                                                              
                                            }
      
                                            System.out.println();
                                            System.out.println();
                                            System.out.println("Would you like to create another transaction? Y/N");
                                            Confirmation = input.next().toUpperCase().charAt(0);
                                            
                                            if(Confirmation == 'Y') 
                                            {
                                                System.out.println("You have been returned to the Main Menu.");
                                                System.out.println();
                                                break;
                                            }
                                            else if(Confirmation == 'N') 
                                            {
                                                System.out.println("Thank you for your transaction. See you again!");
                                                return;
                                            }
                                            else 
                                            {
                                                do
                                                {
                                                    System.out.println();
                                                    System.out.println("Please Enter A Valid Code! ");
                                                    System.out.println("Enter: ");
                                                }while(Confirmation != 'Y' || Confirmation != 'N');
                                            }                                      
                                        }
                                                                            
                                        if(Confirmation == 'N') 
                                        {
                                            System.out.println();
                                            System.out.println("It seems that your process has not been confirmed.");
                                            System.out.println("You have been returned to the Main Menu.");
                                            break;
                                        }
                                    }     
                                    
                                    else if(Confirmation == 'N') 
                                    {
                                        System.out.println();
                                        System.out.println("It seems that the process has not been confirmed.");
                                        System.out.println("You have been returned to the Main Menu.");
                                        break;
                                    }
                                }
                                
                                else if(Confirmation == 'N') 
                                {
                                    System.out.println();
                                    System.out.println("Press [X] if you want to Exit the Program.");
                                    System.out.println("Press [M] if you want to return to the Main Menu.");
                                    Program = input.next().toUpperCase().charAt(0);
                                    
                                    if(Program == 'M') 
                                    {
                                        System.out.println("You have now returned to the Main Menu.");
                                        break;
                                    }
                                    else if(Program == 'X') 
                                    {
                                        System.out.println("Are you sure that you want to Exit the Program? Y/N");
                                        Confirmation = input.next().toUpperCase().charAt(0);
                                        if(Confirmation == 'Y') 
                                        {
                                            System.out.println("You have now exited the G4 Hotel Interface. Thank You & See You Next Time!");
                                            return;
                                        }
                                        else if(Confirmation == 'N') 
                                        {
                                            System.out.println("Since you did not confirm, you have been returned to the G4 Hotel's Main Menu.");
                                            break;
                                        }
                                        else
                                        {
                                            do
                                            {
                                                System.out.println("Please Enter A Valid Code!");
                                                System.out.print("Enter: ");
                                            }while(Confirmation != 'Y' || Confirmation != 'X');
                                        } 
                                    }
                                }
                                
                                case 'C':
                                    System.out.println("Are you sure that you are choosing the Suite Room? Y/N");
                                    Confirmation = input.next().toUpperCase().charAt(0);
    
                                    if(Confirmation == 'Y') 
                                    {
                                        System.out.println("Thank you for confirming.");
                                        System.out.println();
                                        System.out.println("********************************************************************************************************************************************************");
                                        System.out.println("Take Note: ");
                                        System.out.println("        " + "The Suite Room can only contain Two (4) People but we are allowing to have an additional Two (2) Person or Six (6) Person Max.");
                                        System.out.println("        " + "If you are to have Three (6) Guests in this room, there is an additional 10% for the Room Rate Per Person Per Night.");
                                        System.out.println("********************************************************************************************************************************************************");
                                        System.out.println();
    
                                        do
                                        {
                                            System.out.println("Enter the number of guests for this room.");
                                            System.out.print("Number of Guests: ");
                                            Number_Of_Guests = input.nextInt();
    
                                            if(Number_Of_Guests > 6) 
                                            {
                                                System.out.println("We are sorry to inform you but the Suite Room cannot contain more than Six (6) Guests.");
                                                System.out.println();
                                            }
    
                                            else if(Number_Of_Guests <= -1 || Number_Of_Guests == 0) 
                                            {
                                                System.out.println("Please Enter a Valid Number!");
                                                System.out.println();
                                            }
    
                                        }while(Number_Of_Guests > 6 || Number_Of_Guests <= -1 || Number_Of_Guests == 0);
    
                                        System.out.println();
                                        System.out.println("You have successfully booked the Suite Room for " + Number_Of_Guests + '.');
                                        System.out.println("Is this correct? Y/N");
                                        Confirmation = input.next().toUpperCase().charAt(0);
    
                                        if(Confirmation == 'Y') 
                                        {
                                            System.out.println();
                                            System.out.println("()()()()()()()()()()()()()()()");
                                            System.out.println();
                                            System.out.println("     Room for " + Number_Of_Guests + " Confirmed.");
                                            System.out.println();
                                            System.out.println("()()()()()()()()()()()()()()()");
    
                                            do
                                            {
                                                System.out.println();
                                                System.out.println("For how many nights are you staying?");
                                                System.out.print("Number of Nights: ");
                                                Number_Of_Nights = input.nextInt();
    
                                                if(Number_Of_Nights <= -1 || Number_Of_Nights == 0) 
                                                {
                                                    System.out.println("Please Enter A Valid Number!");
                                                    System.out.println();
                                                }
    
                                            }while(Number_Of_Nights <= -1 || Number_Of_Nights == 0);
    
                                            System.out.println();
                                            System.out.println("You entered " + Number_Of_Nights + '.' + "Is this correct? Y/N");
                                            Confirmation = input.next().toUpperCase().charAt(0);
    
                                            if(Confirmation == 'Y') 
                                            {
                                                
                                                System.out.println("()()()()()()()()()()()()()()()()()()()()()()");
                                                System.out.println();
                                                System.out.println("     Suite Room For " + Number_Of_Nights + " Days Confirmed.");
                                                System.out.println();
                                                System.out.println("()()()()()()()()()()()()()()()()()()()()()()");                                           
                                                
                                                if(Number_Of_Guests == 6) 
                                                {                                       
                                                    
                                                    additional_suite_charge = (suite_room_price * 0.10) + suite_room_price;
                                                     
                                                    Guests_Receipt = additional_suite_charge * Number_Of_Guests;
                                                     
                                                    Nights_Receipt = Guests_Receipt * Number_Of_Nights;
                                                             
                                                    Total_Bill = extra_Charge_Suite(Number_Of_Nights, Number_Of_Guests, suite_room_price);   
                                                    VAT_Calculation_Suite = Total_Bill * 0.12;
                                                    Total_Bill_VAT = VAT_Calculation_Suite + Total_Bill;
    
                                                    System.out.println();
                                                    System.out.println("_______________________________________________________________________________________________________________");
                                                    System.out.println("_______________________________________________________________________________________________________________");
                                                    System.out.println();
    
                                                    System.out.println("Below are the Specific Values: ");
                                                    System.out.println();
                                                    System.out.println("Original Suite Room Price                                       :" + "  PHP " + df.format(suite_room_price));
                                                    System.out.println();
                                                    System.out.println("Suite Room Price W/ Additional 10% Charge                       : " + " PHP " + df.format(additional_suite_charge));
                                                    System.out.println();
                                                    System.out.println("Amount Due For Each Guests                                      : " + " PHP " + df.format(additional_suite_charge));
                                                    System.out.println();
                                                    System.out.println("Amount Due For Each Night                                       : " + " PHP " + df.format(additional_suite_charge));
                                                    System.out.println();
                                                    System.out.println("Total Amount Due For Each Night Stayed                          : " + " PHP " + df.format((Nights_Receipt)));
                                                    System.out.println();
                                                    System.out.println("Amount Due For the 12% VAT                                      : " + " PHP " + df.format(VAT_Calculation_Suite));
                                                    System.out.println();
    
                                                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    
                                                    System.out.println();
                                                    System.out.println("Below Is The Calculation Process For Your Total Bill: ");
                                                    System.out.println();
                                                    System.out.println("Suite Room Price With 10% Charge                                : " + "   PHP " + df.format(additional_suite_charge));
                                                    System.out.println();
                                                    System.out.println("                                                                                                    " + 'x');
                                                    System.out.println();
                                                    System.out.println("Due Of The Total Number Of Guests " + '(' + Number_Of_Guests + ')' +"                           :" + "    PHP " + df.format(additional_suite_charge) + " multiplied by " + Number_Of_Guests);
                                                    System.out.println();
                                                    System.out.println("                                                                :" + "    PHP " + df.format(Guests_Receipt));
                                                    System.out.println();
                                                    System.out.println("                                                                                                    " + 'x');
                                                    System.out.println();
                                                    System.out.println("Due Of The Total Number Of Nights " + '(' + Number_Of_Nights + ')' + "                           :"+"    PHP " +df.format(Guests_Receipt) + " multiplied by " + Number_Of_Nights);
                                                    System.out.println();
                                                    System.out.println("                                                                :"+"    PHP " + df.format(Nights_Receipt));
                                                    System.out.println();
                                                    System.out.println("                                                                                                    " + '+');
                                                    System.out.println();
                                                    System.out.println("12% Of The Total Bill                                           : " + "    PHP " +df.format(VAT_Calculation_Suite));
                                                    System.out.println("_______________________________________________________________________________________________________________");
                                                    System.out.println();
                                                    System.out.println("Total Bill                                                      : "  + "   PHP " + df.format(Total_Bill) + " + PHP " + df.format(VAT_Calculation_Suite));
                                                    System.out.println("                                                                :" + "    PHP " + df.format(Total_Bill_VAT));
                                                    System.out.println("_______________________________________________________________________________________________________________");
                                                    System.out.println("_______________________________________________________________________________________________________________");
                                                }
    
                                                else
                                                {
                                                    Total_Bill = extra_Charge_Suite(Number_Of_Nights, Number_Of_Guests, suite_room_price);  
                                                    VAT_Calculation_Suite = Total_Bill * 0.12;
                                                    Total_Bill_VAT = Total_Bill * 0.12 + Total_Bill;
                                                    
                                                    Guests_Receipt = Total_Bill * Number_Of_Guests;
                                                    Nights_Receipt = Guests_Receipt * Number_Of_Nights;
                                                            
                                                    System.out.println();
                                                    System.out.println("___________________________________________________________________________");
                                                    System.out.println();
                                                    System.out.println("Below Are The Specific Values: ");
                                                    System.out.println();
                                                    System.out.println("Room Rate                                   : " +  "PHP " + df.format(suite_room_price));
                                                    System.out.println();
                                                    System.out.println("Amount Due For Each Person                  : " + "PHP " + df.format(suite_room_price));
                                                    System.out.println();
                                                    System.out.println("Amount Due For Each Night                   : " + "PHP " + df.format(suite_room_price));
                                                    System.out.println();
                                                    System.out.println("Value-Added Tax (VAT)                       : " + " 12% or PHP " + df.format(VAT_Calculation_Suite));
                                                    System.out.println();
                                                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                                    System.out.println();
                                                    System.out.println("Computation Of Your Total Bill: ");
                                                    System.out.println();
                                                    System.out.println("Amount Due For Number Of Person (" +  Number_Of_Guests +")         : " + " PHP " + df.format(Guests_Receipt));
                                                    System.out.println();
                                                    System.out.println("                                                            x");
                                                    System.out.println();
                                                    System.out.println("Amount Due For The Nights Stayed (" + Number_Of_Nights + ")        : " + " PHP " + df.format(Nights_Receipt));
                                                    System.out.println();
                                                    System.out.println("                                                            +");
                                                    System.out.println();
                                                    System.out.println("Value-Added Tax (VAT)                       : " + "PHP " + df.format(VAT_Calculation_Suite));
                                                    System.out.println();
                                                    System.out.println("_____________________________________________________________________________");
                                                    System.out.println();
                                                    System.out.println("Total Amount Due                            : " + "PHP " +df.format(Total_Bill_VAT));       
                                                }
    
                                                System.out.println();
                                                System.out.println();
                                                System.out.println("Would you like to create another transaction? Y/N");
                                                Confirmation = input.next().toUpperCase().charAt(0);
                                                
                                                if(Confirmation == 'Y') 
                                                {
                                                    System.out.println("You have been returned to the Main Menu.");
                                                    System.out.println();
                                                    break;
                                                }
                                                else if(Confirmation == 'N') 
                                                {
                                                    System.out.println("Thank you for your transaction. See you again!");
                                                    return;
                                                }
                                                else 
                                                {
                                                    do
                                                    {
                                                        System.out.println();
                                                        System.out.println("Please Enter A Valid Code! ");
                                                        System.out.println("Enter: ");
                                                    }while(Confirmation != 'Y' || Confirmation != 'N');
                                                }                                      
                                            }
    
                                            if(Confirmation == 'N') 
                                            {
                                                System.out.println();
                                                System.out.println("It seems that your process has not been confirmed.");
                                                System.out.println("You have been returned to the Main Menu.");
                                                break;
                                            }
                                        }     
    
                                        else if(Confirmation == 'N') 
                                        {
                                            System.out.println();
                                            System.out.println("It seems that the process has not been confirmed.");
                                            System.out.println("You have been returned to the Main Menu.");
                                            break;
                                        }
                                    }
    
                                    else if(Confirmation == 'N') 
                                    {
                                        System.out.println();
                                        System.out.println("Press [X] if you want to Exit the Program.");
                                        System.out.println("Press [M] if you want to return to the Main Menu.");
                                        Program = input.next().toUpperCase().charAt(0);
    
                                        if(Program == 'M') 
                                        {
                                            System.out.println("You have now returned to the Main Menu.");
                                            break;
                                        }
                                        else if(Program == 'X') 
                                        {
                                            System.out.println("Are you sure that you want to Exit the Program? Y/N");
                                            Confirmation = input.next().toUpperCase().charAt(0);
                                            if(Confirmation == 'Y') 
                                            {
                                                System.out.println("You have now exited the G4 Hotel Interface. Thank You & See You Next Time!");
                                                return;
                                            }
                                            else if(Confirmation == 'N') 
                                            {
                                                System.out.println("Since you did not confirm, you have been returned to the G4 Hotel's Main Menu.");
                                                break;
                                            }
                                            else
                                            {
                                                do
                                                {
                                                    System.out.println("Please Enter A Valid Code!");
                                                    System.out.print("Enter: ");
                                                }while(Confirmation != 'Y' || Confirmation != 'X');
                                            }
                                            
                                        }
                                            
                                    }
                                case 'X':
                                    System.out.println();
                                    System.out.println("Are you sure that you want to Exit the Program? Y/N");
                                    Confirmation = input.next().toUpperCase().charAt(0);
                                if(Confirmation == 'Y') 
                                {
                                  System.out.println("Thank you. Till we see you again at G4 Hotel, bye!");
                                   return;                              
                                }
                                else
                                {
                                    System.out.println();
                                    System.out.println();
                                    System.out.println("It seems that the process is not confirmed.");
                                    System.out.println("With that, you have been returned to the Main Menu.");
                                    System.out.println();
                                    break;
                                }

                    }
                }
            } 

        }
    }        
}
