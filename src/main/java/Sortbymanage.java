
import java.util.Comparator;


public class Sortbymanage implements Comparator <Car> {

    @Override
    public int compare(Car o1, Car o2) {
        if (o1.getManufacturer().compareTo(o2.getManufacturer()) == 0) {
            if(o1.getAge() < o2.getAge()) return -1;
            else if (o1.getAge() == o2.getAge()) return 0;
            else return 1;
        }
        else return o1.getManufacturer().compareTo(o2.getManufacturer());
        }
    }
    

