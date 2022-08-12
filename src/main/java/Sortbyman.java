
import java.util.Comparator;

public class Sortbyman implements Comparator <Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return o1.getManufacturer().compareTo(o2.getManufacturer());
    }
  

    }

    

