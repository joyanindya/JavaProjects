package com.anindya.constructors.model;

public class EmployeeConstructors {
	
	 private int empolyeeId;
	 private String employeeName;
	 
	 public int getEmpolyeeId() {
			return empolyeeId;
		}
		public void setEmpolyeeId(int empolyeeId) {
			this.empolyeeId = empolyeeId;
		}
		public String getEmployeeName() {
			return employeeName;
		}
		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}
		
		public EmployeeConstructors(){
			empolyeeId = 529231;
			employeeName = "Anindya Das";
			System.out.println("The Default Constructor is Invoked");
		}
		public EmployeeConstructors(int empolyeeId,String employeeName){
			this.empolyeeId = empolyeeId;
			this.employeeName = employeeName;
		}
		
		public EmployeeConstructors(int empolyeeId){
			this.empolyeeId = empolyeeId;
		}
		public EmployeeConstructors(String employeeName){
			this.employeeName = employeeName;
		}
		
		public void showDetails(){
			System.out.println("ID "+ empolyeeId);
			System.out.println("Name "+ employeeName);
		}
		
		
		
		
	 
	 

}
