public class Toaster {
    int sliceCapacity;
    int darknessSetting = 5;
    static int totalToast = 0;

    //constructor method
    
    Toaster(int slots){
        sliceCapacity = slots;

    }
    public void setDarkness(int darkness){
        //setting methods let us control the values
        if (darkness < 0){
            darkness = 0;
        }
        else if(darkness > 10){
            darkness = 10;
        }
        darknessSetting = darkness;

    }
    public int toast(int slices){
        //not greater than slice capacity
        
        if (slices > sliceCapacity){
            int leftovers = 0;
            leftovers = slices - sliceCapacity;
            slices = sliceCapacity;
            System.out.println("You left a stack of bread on the counter " + leftovers + " high");
        }
        //not less than 1
        totalToast = totalToast + slices;
        System.out.println("You made " + slices + " toast @ darkness " + darknessSetting);
        return totalToast;
    }
    //Properties: 
        // number of slots
        // darkness setting
        
    //Methods: 
    //  toast (make the toast)
    // setDarkness
}
