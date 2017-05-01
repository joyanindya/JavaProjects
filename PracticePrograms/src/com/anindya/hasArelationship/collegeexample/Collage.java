package com.anindya.hasArelationship.collegeexample;

public class Collage {
	
	private Student[] student;

	public Student[] getStudent() {
		return student;
	}

	public void setStudent(Student[] student) {
		this.student = student;
	}
	
	public String findStudentName(String id){
		
		for(Student st:student){
			if(st.getId().equals(id))
				return st.getName();
			
			
		}
		return "Couln't find student";
	}
	
	public Student findStudent(String id){
		
		for(Student st:student){
			if(st.getId().equals(id))
				return st;
			
			
		}
		return null;
	}
	
	

}
