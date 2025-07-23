package com.aurionpro.model;

public class Employee {
	int id;
	public String name;
	public String department;
	public Double salary;
	
  public Employee(int id,String name,String department,Double salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.department=department;
	}
  public static String lowSalary(Employee[] emp) {           //emp is a var for array of object, Employee[]
      double min = emp[0].salary;
      String minName = emp[0].name;
     
      for (int i=0; i<emp.length; i++) {
          if (emp[i].salary < min) {
              min = emp[i].salary;
              minName = emp[i].name;
          }
      }
      return minName;
  }
 
  //emp dept
  public static void dept(Employee[] emp, String department) {
      for (int i=0; i<emp.length; i++) {
          if (emp[i].department.equalsIgnoreCase(department)) {
              System.out.println(emp[i].name);
          }
      }
  }
 
  //total expense
  public static double salExpense(Employee[] emp) {
      double total = 0;
      for (int i=0; i<emp.length; i++) {
          total +=emp[i].salary;
      }
      return total;
  }

}   
