package assignment_1;

public class Student {
	private static String name;
	private static int age;
	private int idNumber;
	private String DOB;
	
	public Student(String name, String DOB, int age, int idNumber){
		this.name = name;
		this.age = age;
		this.idNumber = idNumber;
		this.DOB = DOB;
	}
	
	
	public String getName(){
		return name;
	}
	public void setName(String Name){
		this.name=Name;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int Age){
		this.age=Age;
	}
	public static String getUsername(){
		return (name + age);
	}


	
	
}
