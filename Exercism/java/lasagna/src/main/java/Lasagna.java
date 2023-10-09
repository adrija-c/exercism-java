public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public static int expectedMinutesInOven() {
        return 40;
    }
    
    // TODO: define the 'remainingMinutesInOven()' method
    public static int remainingMinutesInOven(int remainingTime) {
        return 40 - remainingTime;    
    }
    
    // TODO: define the 'preparationTimeInMinutes()' method
    public static int preparationTimeInMinutes(int layers) {
        return 2*layers;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public static int totalTimeInMinutes( int layers, int remainingTime) {
        int result = 2*layers + remainingTime;
        return result;
    }    
    
}
