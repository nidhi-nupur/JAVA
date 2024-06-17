public class GettersAndSetters {
    public static void main(String[] args) {
        Pens p1 = new Pens();
        // NOT for Private Accesses. 
        // p1.color = "Red";
        // System.out.println(p1.color);
        // p1.tip = 4;
        // System.out.println(p1.tip);

        // For Private Accesses.
        p1.setColor("Blue"); // Setters
        System.out.println(p1.getColor()); // Getters
        p1.setTip(5); // Setters
        System.out.println(p1.getTip()); // Getters
        p1.setColor("Yellow"); // Setters
        System.out.println(p1.getColor()); // Getters
    }
} 

class Pens {
    private String color; // Unaccessible
    private int tip; // Unaccessible

    // Getters
    String getColor() {
        return this.color;
    }
    int getTip() {
        return this.tip;
    }
    



    // Setters
    void setColor(String newColor) {
        this.color = newColor;
    }
    void setTip(int newTip) {
        this.tip = newTip;
    }
}