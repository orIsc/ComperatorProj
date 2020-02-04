
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Service <T> {
    
    private List<T> list;
    private Comparator<T> comparator;
    
    public Service(List<T> list, Comparator<T> comparator) {
	this.list = list;
	this.comparator = comparator;
    }
    
    public void sortService() {
	Collections.sort(list, comparator);
    }
    
}
