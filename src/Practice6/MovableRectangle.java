package Practice6;

public class MovableRectangle extends Rectangle implements Movable{
    int x, y;
    int x_speed, y_speed;

    MovableRectangle(int x, int y, int x_speed, int y_speed){
        this.x = x;
        this.y = y;
        this.x_speed = x_speed;
        this.y_speed = y_speed;
    }

    @Override
    public void moveUp() {
        System.out.println("Coordinates: ("+ x +"; "+(y + y_speed)+")");
    }

    @Override
    public void moveDown() {
        System.out.println("Coordinates: ("+ x +"; "+(y - y_speed)+")");
    }

    @Override
    public void moveLeft() {
        System.out.println("Coordinates: ("+ (x - x_speed) +"; "+ y +")");
    }

    @Override
    public void moveRight() {
        System.out.println("Coordinates: ("+ (x + x_speed) +"; "+ y +")");
    }
}
