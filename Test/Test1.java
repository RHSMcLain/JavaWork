import java.util.Scanner;

public class Test1{
    
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello World. Let's do some cooking");
        // System.out.println("What is your name?");
        // String name = scanner.nextLine();
        // System.out.println("Hello " + name);

        scanner.close();
        Toaster t = new Toaster(4);
        t.toast(t.sliceCapacity);
        t.setDarkness(114);
        t.toast( 20);
        
    }
}