package homeworkpackage;

public class Execution {
	
	public static void main(String [] args) {
				// class name + refVar = new Constructure ();
		Plane refVar1 = new Plane();
		//refVar1.model = "Boeing";
		System.out.println(refVar1.model);
			
		Plane refVar2 = new Plane(13);		
		Plane refVar3 = new Plane("pilot");
		
		System.out.println(refVar1.lengh);		
		System.out.println(Plane.h);
		
		//Method non static void
	    Method method = new Method();
		method.getdestination();
		//Method static void
		Method.passengername();
		
		//Method non static return 
		//Method method1 = new Method();
		int newvalue = method.addition(9, 6);		
		System.out.println(newvalue);
		
		int newvalue2 = method.addition1(11, 12);
		System.out.println(newvalue2);
		
		
		
		
		
	}

}
