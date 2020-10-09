package Practice3;

public class Human {
    int weight;
    int age;
    String name;

    public Human(){
    }

    void Head(String eyes, String hair){
        Head head = new Head(eyes, hair);
    }
    void Leg(int length){
        Leg leg = new Leg(length);
    }
    void Hand(int fingers){
        Hand hand = new Hand(fingers);
        hand.weight = 10;
    }

    void Info(String name, int age){
        System.out.println(name+ ", " + age);
    }

    public static void main(String[] args) {
        Human person1 = new Human();
        person1.name = "Иван";
        person1.age = 34;
        person1.Info(person1.name, person1.age);
        person1.Head("зеленые", "светлые");
        person1.Leg(84);
        person1.Hand(10);
    }
}

class Head extends Human{
    private String hair;
    private String eyes;

    Head(String eyes, String hair){
        this.eyes = eyes;
        this.hair = hair;
    }

    public String getHair(){
        return hair;
    }
    public void setHair(String Hair){
        this.hair = hair;
    }
    public String getEyes(){
        return eyes;
    }
    public void setEyes(String eyes){
        this.eyes = eyes;
    }


}

class Leg extends Human{
    int length;

    Leg(int length){
        this.length = length;
    }

    public int getLength(){
        return length;
    }
    public void setLength(int length){
        this.length = length;
    }

}

class Hand extends Human{
    int fingers;

    Hand(int fingers){
        this.fingers = fingers;
    }

    public int getFingers(){
        return fingers;
    }
    public void setFingers(int fingers){
        this.fingers = fingers;
    }

}