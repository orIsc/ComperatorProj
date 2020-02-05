

public class Car{
    
    private String company;
    private String model;
    private int year;
    
    public Car(String company, String model, int year) {
	super();
	this.company = company;
	this.model = model;
	this.year = year;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
	return "Car [company=" + company + ", model=" + model + ", Year=" + year + "]";
    }
    
    public boolean isEqual(Car car) {
	 if(this.getCompany().equals(car.getCompany()) && this.getModel().equals(car.getModel()) 
 		&& Integer.toString(this.getYear()).equals(Integer.toString(car.getYear()))) {
 		return true;
 	}
	return false;
    }

}
