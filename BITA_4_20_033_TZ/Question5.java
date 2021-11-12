import java.util.Scanner;
class Question5 {
    public static void main (String[] args){
        System.out.print("Insert number of eggs you have? ");
        Scanner input  = new Scanner(System.in);
        int eggs= input.nextInt();
        int Gross = eggs / 144;
        int Dozen = (eggs % 144)/ 12;
        int Remainings = eggs % 12;
        System.out.println("Gross =" +Gross+ " Dozzens ="+Dozen+" and " +Remainings+ " eggs." );
    }
}