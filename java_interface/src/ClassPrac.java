abstract class Vehicle{
    private String name;
    private int maxSpeed;

    abstract void move();

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

interface Flyables {
    void fly();
}

class Cars extends Vehicle {
    public Cars(String name,int maxSpeed){

        setName(name);
        setMaxSpeed(maxSpeed);
    }
    @Override
    void move() {
        System.out.println(getName()+" 최고속도 : "+getMaxSpeed());
        System.out.println("도로를 따라 이동 중 ");
    }
}

class Airplanes extends Vehicle implements Flyables {
    public Airplanes(String name,int maxSpeed){
        setName(name);
        setMaxSpeed(maxSpeed);
    }
    @Override
    public void fly() {

        System.out.println("고도 10,000피트에서 비행 중 ");
    }

    @Override
    void move() {
        System.out.println(getName()+"속도는 :"+getMaxSpeed());
        System.out.println("하늘을 날아가는 중 ");
    }
}



public class ClassPrac {
    public static void main(String[] args) {
        Vehicle[] ve = { new Cars("SUV",200),new Airplanes("Boeing",1000)};
        for (Vehicle v: ve){
            v.move();
            if(v instanceof Flyables){
                ((Flyables) v).fly();
            }
        }

    }
}
