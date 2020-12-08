package cn.lee.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Student {
	private int id;
	  private String name;
	  private int age;
	  private String sex;
	  
	   public Student(){}
	   public Student(int id,String name,int age,String sex){
	     this.id = id;
	     this.name = name;
	     this.age = age;
	     this.sex = sex;
	}
	public void setId(int id){
	   this.id = id;
	}
	public int getId(){
	   return id;
	}
	public void setName(String name){
	    this.name = name;
	}
	public String getName(){
	    return name;
	}
	public void setAge(int age){
	    this.age = age;
	}
	public int getAge(){
	    return age;
	}
	public void setSex(String sex){
	    this.sex = sex;
	}
	public String getSex(){
	    return sex;
	}
	public boolean equals(Student s){
	    if(this.id==s.getId()){
	   return true;
	}
	return false;
	}
	public String toString(){
	  return this.id+","+this.name+","+this.age+","+this.sex;
	}
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException{
	   Scanner input = new Scanner(System.in);
	   String name = input.nextLine();
	   Class c = Class.forName(name);
	   Student s = (Student)c.newInstance();
	   Constructor<?> constructor = c.getConstructor(int.class,String.class,int.class,String.class);
	   Student s1 = (Student)constructor.newInstance(02,"lcm",21,"ÄÐ");
	   System.out.println(s1);
	   Method arr[] = c.getMethods();
	   for(int i=0;i<arr.length-1;i++){
		   if(arr[i].getName().startsWith("get")){
			   System.out.println(arr[i].getName()+":"+arr[i].invoke(s1));
		   }
	   }
	}

}
