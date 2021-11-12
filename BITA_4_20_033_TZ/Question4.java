import java.util.Scanner;
class Question4{
        public static void main(String[] args) {
            
            Scanner input = new Scanner(System.in);
            
            System.out.println("What numbers of gallons of gas present in tank:");
            double tank = input.nextDouble();
            
            System.out.println("Number of miles per gallon: ");
            double fuel = input.nextDouble();
            
            System.out.println("Insert the price of gas per gallon: _");
            double price = input.nextDouble();
            
            double cost_of_250_miles = 250 / fuel * price;
            System.out.println("Cost of 250 miles:"+ cost_of_250_miles);
            double distance = fuel * tank;
            System.out.println("Distance covered: " +distance);
    }
}
