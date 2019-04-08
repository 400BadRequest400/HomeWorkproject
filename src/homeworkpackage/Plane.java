package homeworkpackage;

public class Plane {

	 int year;
	 String model = "Air Bus";
	 
	 String lengh = "200m";
	 static char h = 'w';
	 
	 
	public Plane() {
	

	}
	
	public Plane(int year) {
		this.year = year;
		System.out.println(year);

	}

	
	public Plane(String model) {
		this.model = model;
		System.out.println(model);
	
		
	}
}
