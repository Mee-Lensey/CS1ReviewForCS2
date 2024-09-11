// CoffeeDrink object class

class CoffeeDrink {

    int numberOfCups;
    String flavor;
    boolean hasWhippedCream;

    // Constructor for CoffeeDrink class
       public CoffeeDrink(int pnumberOfCups, String pflavor, boolean phasWhippedCream  ) {

        numberOfCups= pnumberOfCups ;
        flavor= pflavor;
        hasWhippedCream= true;
        // java defaults to the variable with the smallest scope
        hasWhippedCream=phasWhippedCream;

        // TODO
        // Edit this constructor to accept three parameters,
        // one for each CoffeeDrink variable.
        // Assign those parameter values to the class-wide variables.
    }

    // Method to print information about the CoffeeDrink
    public void printInfo() {
        // TODO

        System.out.print("You Ordered " + numberOfCups + " of " + flavor + " coffee ");

        if(hasWhippedCream){
            System.out.println("with Whipped Cream");

        }else{
            System.out.println(" without with cream.");

        }

    }
}
