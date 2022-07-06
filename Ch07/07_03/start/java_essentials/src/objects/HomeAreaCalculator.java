package objects;

/*
 * Write a class that creates instances of the `Rectangle` class to find the
 * total area of two rooms in a house.
 */
public class HomeAreaCalculator {

    public static void main(String[] args){
        Rectangle room1 = new Rectangle();
        room1.setWidth(5);
        room1.setLength(6);
        double areaRoom1 = room1.calculateArea();
        double perimeterRoom1 = room1.calculatePerimeter();
        System.out.println("Area of rectangle is " + areaRoom1);
        System.out.println("Perimeter of rectangle is " + perimeterRoom1);

        Rectangle room2 = new Rectangle(10, 30);
        double areaRoom2 = room2.calculateArea();
        double perimeterRoom2 = room2.calculatePerimeter();
        System.out.println("Area of room 2: " + areaRoom2);
        System.out.println("Perimeter of room 2: " + perimeterRoom2);

    }
}

