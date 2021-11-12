import java.util.Scanner;
class Question3 {
    public static void main(String[] args) {
        System.out.print("number of participants: ");
        Scanner input = new Scanner(System.in);
        int participants = input.nextInt();
        int Revenue = 2500 * participants;
        System.out.println("The Revenue earned is:" +Revenue );
    }
}