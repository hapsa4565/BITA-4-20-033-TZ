import java.util.Scanner;
class Question6 {
    public static void main(String[] args){
        System.out.print(" Level of performance between 0 and 100  ");
        Scanner input = new Scanner(System.in);
        int Perfomance = input.nextInt();
        System.out.print("Basic salary");
        double Salary = input.nextDouble();
        if (Perfomance >= 90){
        Salary += Salary * 3/100;     
        }
        System.out.println("The actual salary is "+Salary);
       
    }
}

    
