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
        int toastMade = t.toast( 20);
        System.out.println("We now have " + toastMade + " total slices of toast");
        
        Toaster reginald = new Toaster(2);
        reginald.setDarkness(3);
        int regToast = reginald.toast(1);
        System.out.println(regToast);
        int tToast = t.toast(1);
        System.out.println(tToast);
    }
}