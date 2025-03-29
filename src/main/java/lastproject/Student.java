package lastproject;

import javax.servlet.http.HttpServlet;

public class Student extends HttpServlet {
int roll;
String name;
public Student(int roll, String name) {
	super();
	this.roll = roll;
	this.name = name;
}
public int getRoll() {
	return roll;
}
public void setRoll(int roll) {
	this.roll = roll;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Student [roll=" + roll + ", name=" + name + "]";
}

}
