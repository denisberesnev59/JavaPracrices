package Practice2;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        int count;
        double area;
        String name;

        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество собак: ");
        count = in.nextInt();

        Dogs dogs = new Dogs();
        dogs.add_to_arr(count);

        System.out.println("Введите название фигуры: ");
        name = in.next();
        System.out.println("Введите площадь фигуры: ");
        area = in.nextInt();
        Shape shape = new Shape(name, area);
        ShapeTest shapeTest = new ShapeTest();
        shapeTest.Output(shape.name, shape.area);
    }
}

class Shape{
    String name;
    double area;

    Shape(String name, double area){
        this.name = name;
        this.area = area;
    }
}

class ShapeTest{
    void Output(String name, double area){
        System.out.println("Name: "+name+", Area: "+area);
    }
}

class Dog{
    String name;
    String dog;
    int age;
    int human_age;

    Dog(String n, int a){
        name = n;
        age = a;
    }

    int Transfer(int a){
        human_age = 7*a;

        return human_age;
    }

    String ToString(String n, int a){
        dog= "Name: " + n +", Age: " + a +"\n";

        return dog;
    }
}

class Dogs{
    String name;
    int age;

    void add_to_arr(int count){
        Scanner in = new Scanner(System.in);

        Dog[] dog = new Dog[count];

        for(int i=0;  i<count; i++){
            System.out.println("dog" + (i+1));
            System.out.println("Name: ");
            name = in.next();
            System.out.println("Age: ");
            age = in.nextInt();
            dog[i]= new Dog(name,age);
            System.out.println("Human age: " +dog[i].Transfer(age));
            System.out.println(dog[i].ToString(dog[i].name,dog[i].age));
        }
    }
}