package studentWork;

public class Student {
	private String class_name;
	private int ID;
	private String name;
	private char sex;
	private int age;
	private String phone_number;
	
	public Student(String class_name,int ID,String name,char sex,int age,String phone_number){
		this.class_name = class_name;
		this.ID = ID;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.phone_number = phone_number;
	}
	public String getClass_name(){
		return class_name;
	}
	public int getID(){
		return ID;
	}
	public String getName(){
		return name;
	}
	public char getSex(){
		return sex;
	}
	public int getAge(){
		return age;
	}
	public String getPhone_number(){
		return phone_number;
	}
	public void display(){
		System.out.println("班级"+class_name+"\n"+"学号"+ID+"\n"+"姓名"+name+"\n"+"性别"+sex+"\n"+"年龄"+age+"\n"+"电话号码"+phone_number+"\n");
	}
}