import java.util.Arrays;

class ResistorColor {
    String st[] = new String[]{"black", "brown", "red", "orange", "yellow", "green", "blue","violet", "grey", "white"};
    
    int colorCode(String color) {
        return Arrays.asList(st).indexOf(color);
    }

    String[] colors() {
        return st;
        
    }
}



