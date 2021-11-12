import java.util.InputMismatchException;
import java.util.Scanner; 
public class Question7{ 
    public static void main(String args[]){ 
        int x, y, z; 
        Scanner Input = new Scanner(System.in); 
        System.out.print("Fisrt number : "); 
        int a = Input.nextInt(); 
        System.out.print("second number : ");
        int b = Input.nextInt(); 
        x = a; 
        y = b; 
        while(y != 0) 
        { 
            z = y; 
            y = x%y; 
            x = z; 
        } 
        int HCF = x; 
        int LCM = (a*b)/HCF; 
        System.out.println("HCF of " + a + " and " + b+ " is = "  +HCF); 
        System.out.print("And LCM of " + a + " and " + b+ " is = " +HCF); 
    } 
} 