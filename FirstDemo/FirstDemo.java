import java.util.Scanner;

public class FirstDemo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Hello World");
        int presentCount = 5;
        System.out.println(presentCount);
        System.out.println("You got three more presents!");
        presentCount = presentCount + 3;
        System.out.println("You now have " + presentCount + " presents");
        String newPresent = scanner.nextLine();
        System.out.println(newPresent);
    }
}
