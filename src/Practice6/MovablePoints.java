package Practice6;

public class MovablePoints  implements Movable
{
    int flag=0;

    int x1;
    int y1;
    int x2;
    int y2;
    int x1_speed;
    int y1_speed;
    int x2_speed;
    int y2_speed;

    MovablePoints(int x1, int y1, int x2, int y2, int x1_speed, int y1_speed, int x2_speed, int y2_speed)
    {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x1_speed = x1_speed;
        this.y2_speed = y2_speed;
        this.x2_speed = x2_speed;
        this.y1_speed = y1_speed;
    }

    public int speed_check()
    {
        if((x1_speed == y1_speed) && (y2_speed == x2_speed))
        {
            flag = 0;
        }else {
            flag =1;
        }
        return flag;

    }

    @Override
    public void moveUp()
    {
        System.out.println("Coordinates: ("+ x1 +";"+(y1 + y1_speed)+") ("+ x2 +";"+(y2 + y2_speed)+")");
    }
    @Override
    public void moveDown()
    {
        System.out.println("Coordinates: ("+ x1 +";"+(y1 - y1_speed)+") ("+ x2 +";"+(y2 - y2_speed)+")");
    }
    @Override
    public void moveLeft()
    {
        System.out.println("Coordinates: "+(x1 - x1_speed)+";"+ y1 +") ("+(x2 - x2_speed)+";"+ y2 +")");
    }
    @Override
    public void moveRight()
    {
        System.out.println("Coordinates: ("+(x1 + x1_speed)+";"+ y1 +") ("+(x2 + x2_speed)+";"+ y2 +")");
    }
}