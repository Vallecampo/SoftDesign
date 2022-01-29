// The Driver Class: TestCircle

public class TestCircle {

    public static void main(String[] args) {
    // Create a circle with radius 1
    Circle circle1 = new Circle();
    System.out.println("The area of the circle of radius circle1 "
    + circle1.getRadius() + " is " + circle1.getArea()+ "\nnumber of circles are "+ Circle.getNumberOfCircles());
    System.out.println("\n reference to the location of circle1 \n"+ circle1+" "+ circle1.toString());
    
    // Create a circle with radius 25
    Circle circle2 = new Circle(25);
    System.out.println("The area of the circle of radius circle2 "
    + circle2.getRadius() + " is " + circle2.getArea()+"\n reference to the location of circle2 \n"+ circle2);
    
    // Create a circle with radius 125
    Circle circle3 = new Circle(125);
    System.out.println("The area of the circle of radius circle3 "
    + circle3.getRadius() + " is " + circle3.getArea());
    
    // Modify circle radius
    circle2.setRadius (100); // or circle2.setRadius(100)
    System.out.println("The area of the circle of radius circle2 "
    + circle2.getRadius() + " is " + circle2.getArea());
    
    circle3.setRadius(200);
    System.out.println("The area of the circle of radius circle3 "
    + circle3.getRadius() + " is " + circle3.getArea()+ "\nnumber of circles are "+ Circle.getNumberOfCircles());
    
    circle1 = circle2;
    System.out.println("\n reference to the location of circle1 \n"+ circle1);
    System.out.println("\n reference to the location of circle2 \n"+ circle2);

    //Adding Comments to dev banch
    }
    }