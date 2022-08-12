
import java.util.ArrayList;
import java.util.Collections;
public class TestCar {
    public static void main(String[] args) {
       
        Car Benz = new Car("Benz", 10);
        Car Benz2 = new Car ("Benz",4);
        Car Isuzu = new Car ("Isuzu",8);
        Car Honda = new Car ("Honda ",11);
        Car Mitsubishi = new Car ("Mitsubishi",13);
        Car Nissan = new Car ("Nissan",12);
        Car Mazda  = new Car ("Mazda",9);
        Car Ford = new Car ("Ford ",6);
        Car MG  = new Car ("MG",17);
        Car Suzuki = new Car ("Suzuki",15);
     
//        TreeSet<Car> cr = new TreeSet<>();
//        cr.add(Benz);
//        cr.add(Benz2);
//        cr.add(Isuzu);
//        cr.add(Honda);
//        cr.add(Mitsubishi);
//        cr.add(Nissan);
//        cr.add(Mazda);
//        cr.add(Ford);
//        cr.add(MG);
//        cr.add(Suzuki);
//cr.forEach(f -> System.out.println(f));
ArrayList<Car> cr = new ArrayList<>(); 
        cr.add(Benz);
        cr.add(Benz2);
        cr.add(Isuzu);
        cr.add(Honda);
        cr.add(Mitsubishi);
        cr.add(Nissan);
        cr.add(Mazda);
        cr.add(Ford);
        cr.add(MG);
        cr.add(Suzuki);
        Collections.sort(cr, new Sortbymanage());
cr.forEach(f -> System.out.println(f));
    }
}
