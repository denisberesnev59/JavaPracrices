package Practice6;

public class Rectangle {
    String name;
    String colour;

    int side_a;
    int side_b;

    Rectangle(int a, int b){
        this.side_a = a;
        this.side_b = b;
    }

    public void setSide_a(int side_a) {
        this.side_a = side_a;
    }
    public int getSide_a() {
        return side_a;
    }

    public void setSide_b(int side_b) {
        this.side_b = side_b;
    }
    public int getSide_b() {
        return side_b;
    }
}
