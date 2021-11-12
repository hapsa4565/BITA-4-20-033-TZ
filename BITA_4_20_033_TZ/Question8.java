import java.util.Scanner;
class Question8{
    public static void main(String[] args){
        System.out.print("The number of minutes: ");
        Scanner input = new Scanner(System.in);
        int min  = input.nextInt();
        int Yrs = min / 525600;
        int Day = (min % 525600)/1440;
        System.out.println(min+" is approximately to " +Yrs+ " years and "+Day+" days.");       
    }
}