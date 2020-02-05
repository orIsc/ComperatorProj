import java.util.Comparator;

public class StudentById implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
	return (int) (o1.getId() - o2.getId());
    }

}
