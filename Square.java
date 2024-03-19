package Inheritence;

public class Square extends Shapes{

    public Square(int side) {
        super(side);
    }
    @Override
    public double getArea(){
        return length*length;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("I am a square also");
    }
}
