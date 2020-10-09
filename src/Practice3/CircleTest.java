package Practice3;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int area;
        int radius;

        System.out.println("Введите площадь круга: ");
        area = in.nextInt();
        System.out.println("Введите радиус круга: ");
        radius = in.nextInt();
        Circle circle = new Circle(area, radius);
        circle.Info();

    }
}

class Circle{

    private int area;
    private int radius;
    Circle(int area, int radius){
        this.area = area;
        this.radius = radius;
    }
    void Info(){
        System.out.println(area +", " + radius);
    }
    public int getArea(){
        return area;
    }
    public void setArea(int area){
        this.area = area;
    }
    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }

}