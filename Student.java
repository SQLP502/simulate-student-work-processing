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
		System.out.println("�༶"+class_name+"\n"+"ѧ��"+ID+"\n"+"����"+name+"\n"+"�Ա�"+sex+"\n"+"����"+age+"\n"+"�绰����"+phone_number+"\n");
	}
}