public class Hello_World_Spardha-hash {

	public static void main(String[] args) {
		System.out.println("Hello World!");

		Student obj = new Student();
		obj.show();
		obj.display();
		System.out.println("Name of the student is " + obj.name);
		System.out.println("Age of the student is " + obj.age);
		System.out.println("Student lives in " + obj.city);
		System.out.println("Marks of the student is " + obj.marks);

	}

}


//Real World Inheritance Example

//Base or Parent Class
class Person{
	String name = "Spardha";
	int age = 21;
	String city = "Bareilly";
	public void show(){
		System.out.println("Student class inheriting this class");
	}
}
class Student extends Person{
	int marks = 86;
	public void display(){
		System.out.println("Student is also a person");
	}
}