import javax.swing.*;

class Box<T extends Number>{
    private T item;
    public void setItem(T item){
        this.item = item;
    }
    public T getItem(){
        return item;
    }
}

interface Movable{
    void move();
}
class Car implements Movable{

    @Override
    public void move() {
        System.out.println("자동차 출발");
    }
}
//제네릭 클래스
class Container<T extends Movable> {
    private T item;
    public Container(T item){
        this.item = item;
    }
    public void makeItMove(){
        item.move();
    }
}
public class GenericExam2 {
    public static void main(String[] args) {
//        Box<String > stringBox = new Box<>();
//        stringBox.setItem("Hello World");
//        System.out.println(stringBox.getItem());
        Box<Double> doubleBox = new Box<>();
        doubleBox.setItem(0.02);

        Container<Car> container = new Container<>(new Car());

    }
}
