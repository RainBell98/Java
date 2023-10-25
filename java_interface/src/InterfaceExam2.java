interface Move{
    void moveForword();
    void moveBackword();

}
interface Power{
    void powerOn();
    void powerOff();
}

//인터페이스는 인터페이스를 상속 받을 수 있음
//다중 상속이 가능
interface Car extends Move,Power{
    void changeGear(int gear);

}

class Suv implements Car{

    @Override
    public void moveForword() {
        System.out.println("전진");
    }

    @Override
    public void moveBackword() {
        System.out.println("후진");
    }

    @Override
    public void powerOn() {
        System.out.println("시동 ON");
    }

    @Override
    public void powerOff() {
        System.out.println("시동 ON");
        
    }

    @Override
    public void changeGear(int gear) {
        System.out.println("기어 변경 : "+gear);
    }
}


public class InterfaceExam2 {
    public static void main(String[] args){
        Suv mySuv = new Suv();
        mySuv.powerOn();
        mySuv.changeGear(5);
        mySuv.moveForword();
        
    }

}
