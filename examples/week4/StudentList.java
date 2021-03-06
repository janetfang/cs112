/**
	A class to hold information about a list of
	Students.
**/

import java.util.ArrayList;

public class StudentList {

	//data member: list to hold Student objects
	private ArrayList<Student> list;

	//constructor
	public StudentList() {
		this.list = new ArrayList<Student>();		
	}	

	//method to add a student to the list
	public void addStudent(Student stuToAdd) {
		this.list.add(stuToAdd);
	}

	//method to return a String representation of entire list
	public String toString() {
		String resultString = "";

		for(Student stu: this.list) {
			resultString = resultString + stu.toString() + "\n";	
		}
		return resultString;
	}

	//method to calculate average score across all students
	public double calculateAverage() {

			double total = 0;
			//for each student
			for (Student student: this.students){
				//add score to total
				total = total + student.getScore();
			}

			//result = total/number of students
			double result = total/this.students.size();
			//return result
			return result;

		//method implementation replaced by algorithm

		//declare variable to hold total

		//for each Student in list
		// add student score to total

		//divide total by number of students
		
		//return result
		return 0; //modify to implement correct logic
	}

}
