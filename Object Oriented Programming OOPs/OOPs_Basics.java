// Classes names starts with 'CAPITAL' Letters.
// Functions names starts with 'small' Letters.
public class OOPs_Basics {
    public static void main(String[] args) {
        Pens p1 = new Pens(); // Created a Pens OBJECT called p1.
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(3);
        System.out.println(p1.tip);

        // We can change property of the object again and again.
        p1.setColor("Red");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);

        // Other way to change properties.
        p1.color = "Yellow";
        System.out.println(p1.color);
        p1.tip = 7;
        System.out.println(p1.tip);
    }
}


// All Objects = forms in HEAP



// Examples of the Classes having Properties (Attributes) and Functions (Behaviours).
/* 1. */ // Blueprint of Pen. (Not actual pen.)
class Pens {
    String color; // Property1 (Attribute)
    int tip; // Property2 (Attribute)

    void setColor(String newColor) { // Function1 (Behaviour)
        color = newColor;
    }
    void setTip (int newTips) { // Function2 (Behaviour)
        tip = newTips;
    }
}

/* 2. */ // Blueprint of Student's info. (Not actual Student's info.)
class Students {
    String name; // Property1 (Attribute)
    int age; // Property2 (Attribute)
    float percentage; // cgpa  // Property3 (Attribute)

    void avgPercentage(int maths, int phy, int chem) { // Function1 (Behaviour)
        int Average = (maths + phy + chem) / 3;
    }
}






// We can create multiple classes in a Java file.
// Examples: 
class Basic {
    // Define all [Properties (Attributes) + Functions (Behaviours)]
}
class Objects {
    // Define all [Properties (Attributes) + Functions (Behaviours)]
}
class Class {
    // Define all [Properties (Attributes) + Functions (Behaviours)]
}





