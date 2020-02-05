

import java.util.Comparator;

public class CarByCompany implements Comparator<Car> {
    
    @Override
    public int compare(Car o1, Car o2) {
	return o1.getCompany().compareTo(o2.getCompany());
    }
    
}
