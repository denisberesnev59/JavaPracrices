package Practice6;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int flag;

        String name;
        String colour;

        int x=0, y=0;
        int x_speed=0, y_speed=0;

        int x1;
        int y1;
        int x2;
        int y2;
        int x1_speed;
        int y1_speed;
        int x2_speed;
        int y2_speed;

        System.out.println("MovableRectangle: 1\nMovablePoints: 2\n");
        flag = in.nextInt();

        System.out.println("Name: ");
        name = in.next();
        System.out.println("Colour: ");
        colour = in.next();

        switch (flag){
            case 1:
                System.out.println("x: ");
                x=in.nextInt();
                System.out.println("y: ");
                y=in.nextInt();
                System.out.println("x_speed: ");
                x_speed=in.nextInt();
                System.out.println("y_speed: ");
                y_speed=in.nextInt();

                MovableRectangle movableRectangle = new MovableRectangle(x, y, x_speed, y_speed);
                movableRectangle.moveRight();
                movableRectangle.moveDown();

                break;

            case 2:
                System.out.println("x1: ");
                x1=in.nextInt();
                System.out.println("y1: ");
                y1=in.nextInt();
                System.out.println("x2: ");
                x2=in.nextInt();
                System.out.println("y2: ");
                y2=in.nextInt();
                System.out.println("x1_speed: ");
                x1_speed=in.nextInt();
                System.out.println("y1_speed: ");
                y1_speed=in.nextInt();
                System.out.println("x2_speed: ");
                x2_speed=in.nextInt();
                System.out.println("y2_speed: ");
                y2_speed=in.nextInt();

                MovablePoints movablePoints = new MovablePoints(x1,y1,x2,y2,x1_speed,y1_speed,x2_speed,y2_speed);
                if(movablePoints.speed_check()==0){
                    movablePoints.moveLeft();
                    movablePoints.moveUp();
                    movablePoints.moveUp();
                }else{
                    System.out.println("Error");
                }

                break;
        }
    }
}
