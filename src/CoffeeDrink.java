// CoffeeDrink object class

class CoffeeDrink {

    int numberOfCups;
   private String flavor;
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
        public CoffeeDrink() {
           numberOfCups= 1;
           flavor= " mocha";
           hasWhippedCream= false;
        } // default coffee order

        public CoffeeDrink(int pnumberOfCups) {
           numberOfCups = pnumberOfCups;

           flavor = "mocha";
           hasWhippedCream= false;
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

    //"getter" method for flavor variable
    public String  getFlavor(){
           return flavor;

    }
    //"setter" method for flavor variable

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
}
