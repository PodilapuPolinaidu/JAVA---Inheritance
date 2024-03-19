package Inheritence;

import Branching.SwitchStatement;

public class Driver {
    public static void main(String[] args) {
    //    Car c = new Car();

     //   c.setColor("blue");
     //   SUV s1 = new SUV();
     //   s1.setName("my car");
        Square s1 = new Square(4 );
        System.out.println(s1.getArea());
        s1.display();
    }
}
