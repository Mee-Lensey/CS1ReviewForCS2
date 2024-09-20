import javax.print.DocFlavor;
import java.util.Scanner;

/**
 * CS2 Review Assignment!
 * Do NOT use ChatGPT or any other generative AI to assist you with this assignment
 * You may reference your own past work and the internet (not including AI)
 */

public class JavaBeansAndBytes {

    // Variables for the CoffeeShop
    String name;
    boolean isOpen;
    int yearFounded;


    public static void main(String[] args) {
        // Create a new CoffeeShop instance to run everything.
        JavaBeansAndBytes cafe = new JavaBeansAndBytes();
    }

    // Constructor for CoffeeShop
    public JavaBeansAndBytes() {
        name = "Java Beans & Bytes: The Code Café";
        isOpen = true;
        yearFounded = 1995;

        System.out.println("Welcome to " + name + "!");
        if (isOpen) {
            System.out.println("We are open!");
        } else {
            System.out.println("We are closed :(");
        }
        System.out.println("We were founded in " + yearFounded + ".");


        // TODO
        // Update the year founded and print the new yearFounded in a sentence
        yearFounded = 2008;
        System.out.println("We were actually founded in " + yearFounded + ":)");

        // Calling methods
        randomDiscount();
        // TODO
        // Add parameter to specialOfTheDay (drink of your choice)
        specialOfTheDay("iced Strawberry matcha latte");
        countCups();
        baristasChoice();

        // TODO
        // Create two CoffeeDrink objects
        CoffeeDrink drink1 = new CoffeeDrink(7,"vanilla", true);
        CoffeeDrink drink2 = new CoffeeDrink(20,"mocha", false);
        CoffeeDrink drink3 = new CoffeeDrink(10, "cappuccino", true);
        CoffeeDrink drink4=new CoffeeDrink(49);

                // TODO
        // Print out the order details
        drink1.printInfo();
        drink2.printInfo();
       // System.out.println(drink2.flavor);
        //drink2.flavor = " caramel";
        System.out.println("drink 2 flavor is " + drink2.getFlavor() );
        drink2.setFlavor("caramel");
        System.out.println("drink 2 flavor is " + drink2.getFlavor() );
        drink3.printInfo();
        drink4.printInfo();


        // customDrink();
        returnTypes(5 ); // call returnTypes
        System.out.println("***+" + returnTypes(5));

        System.out.println(returnString());
        System.out.println(returnDistance(2, 1, 3, 4));
    } //end of constuctor
    public double returnDistance(int x1, int y1, int x2, int y2 ){
        double distance = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2) );
        return distance;


    }

    public String returnString() {
        String name = "Gary";
        return name;
    }


    // public_type of variable we return_ nameOfMethod()
    public int returnTypes(int a){ // returnTypes signature
        System.out.println("returnTypes method");
        System.out.println(a);
        return a;

    }

    public void customDrink(){
        //scanner for user input
        Scanner scanner= new Scanner (System.in);

        System.out.println(" How many cups do you want?");
        int nCups = scanner.nextInt();
        System.out.println(nCups);
    }




    // Method to generate a random discount
    public void randomDiscount() {
        // TODO
        // Make this method generate a random integer discount (0-30%)
        // and print the result.
        int discount= (int)(Math.random()* 31);
        System.out.println("your random discount is " + discount + "%");
        //while loop for getting the best discount
        while (discount<30) {
            discount= (int)(Math.random()* 31);
            System.out.println("your random discount is " + discount + "%");

        }
    }

    // Method with a parameter for the special of the day
    public void specialOfTheDay(String paramSpecial) {
        // TODO
        // Make this method accept a parameter representing the day’s special.
        // Print the day's special.
        System.out.println("Todays special will be " + paramSpecial);
    }

    // Method to show loops
    public void countCups() {
        System.out.println("Counting cups sold today:");

        // TODO
        // Write three different for loops that print the indicated numbers:

        // Print 1 to 5

        for ( int x=0; x<6; x=x+1) {
            System.out.print(x+ ", \n ");
        }
        int n =1;
        while (n < 6) {
            System.out.println(n);
            n++;
        }



        // Print 2, 5, 8, 11

        int y =2;
        while (y < 13) {
            System.out.println(y);
            y=y+3;
        }

        for ( int x=2; x<12; x=x+3) {
            System.out.print(x+ " , \n ");
        }


        // Print 8 to 0

        int m =8;

        while (m > -1) {
            System.out.println("*"+m);
            m=m-1;

        }
        for ( int x=8; x>-1; x=x-1) {
            System.out.print(x+ ", \n");
        }

        int p = 0;
                while (true) {
                    System.out.println(p);
                    if (p>99){
                        break; // ends the loop and the code continues after the loop
                    }
                    if( p % 5 == 0) { // print the multiples of 5

                    }
                    System.out.println(p);
                    p ++;
                }
    }


    // Method to recommend a coffee based on a random number
    public void baristasChoice() {
        // TODO


         double r=  (Math.random());

         if( r<0.25) {
             System.out.println(" latte ");
         }
         if  (r< .5 ) {
             System.out.println(" cappuccino");
         }
        if  (r< .75 ) {
            System.out.println(" cold whole milk");
        }
        if  (r< 1 ) {
            System.out.println("cold water");
        }



        // Make this method generate a random decimal between 0 and 1
        // and print one of four drink recommendations based on its value.
    }
}

