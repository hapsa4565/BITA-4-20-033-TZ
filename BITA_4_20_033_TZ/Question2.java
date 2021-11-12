import java.util.Scanner;
class Question2{
    public static void main(String[] args) {
        System.out.println("Please answer the following");

        String Name, City, College, Proffession, Animal, Pet;

        System.out.println("What is your Name? ");
        Scanner input = new Scanner(System.in);
        Name = input.nextLine();

        System.out.println("How old are you?  ");
        int Age = input.nextInt();

        System.out.println("What city do you live in? ");
        input.nextLine();
        City = input.nextLine();

        System.out.println("What is  your colledge ? ");
        College = input.nextLine();
        
        System.out.println("What is your proffession?  ");
        Proffession = input.nextLine();

        System.out.println("What type of animal do your have?  ");
        Animal = input.nextLine();

        System.out.println("What is the name of your "+Animal+ "? _ ");
        Pet = input.nextLine();

        System.out.print("There once was a person named " +Name+ " who lived in "+City+ ". At the age of "+Age+", "+ Name + " went to college at " + College+". ");
        System.out.print(Name+" graduated and went to work as "+Proffession+ ". Then, " +Name+ " adopted a/an "+Animal+ " named " +Pet  );
        System.out.print(". Then, " +Name+ " adopted a/an "+Animal+ " named " +Pet+ ". They both lived happily ever after!");
    }
}