package homeworkpackage;

public class Method {
	
	// once you create a static method you can call it 
	//by using directly the class name 

	// method structure:
	//class specifier + method type + method name +method parameter + {}open,close method body
	
	//Non static method - Void 
	public void getdestination() {
		System.out.println("my destination is China");
		
	}
	//static method - Void
	public static void passengername () {
		System.out.println("passenger name is Edward");
	
	}
	
	//non static method - return type
	public int addition(int front, int rear) {
	    int total = front+rear;	
	return total;
	}
		
	
	//static method - return type
	public int addition1(int front, int rear) {
	    int total = front*rear;	
	return total;
	}
}
