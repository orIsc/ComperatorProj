
import java.util.ArrayList;
import java.util.List;

public class Driver {

    public static void main(String[] args) {
	Student s1 = new Student("bbb", 20, 123);
	Student s2 = new Student("fff", 34, 456);
	Student s3 = new Student("mmm", 13, 234);
	
	List<Student> listS = new ArrayList<>();
	listS.add(s1);
	listS.add(s2);
	listS.add(s3);
	
	Car c1 = new Car("Volvo","s60", 2009);
	Car c2 = new Car("Mercedes","e63", 2017);
	Car c3 = new Car("Jeep","rubicon", 2020);
	
	List<Car> listC = new ArrayList<>();
	listC.add(c1);
	listC.add(c2);
	listC.add(c3);
	
	Service service = new Service(listS, new StudentByAge());
	for(Student s : listS) 
	    System.out.print(s +"\t");
	System.out.println();
	service = new Service(listS, new StudentByName());
	for(Student s : listS) 
	    System.out.print(s +"\t");
	System.out.println();
	service = new Service(listS, new StudentById());
	for(Student s : listS) 
	    System.out.print(s +"\t");
	System.out.println();
	
	service = new Service(listC, new CarByName());
	for(Car c : listC) 
	    System.out.print(c +"\t");
	System.out.println();
	service = new Service(listC, new CarByYear());
	for(Car c : listC) 
	    System.out.print(c +"\t");
	System.out.println();
    }

}
