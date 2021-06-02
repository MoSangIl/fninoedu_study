package stu.block.msi.dto;

import java.sql.Timestamp;

public class EmployeeDTO {
	private int employee_id;
	private String first_name;
	private Timestamp hire_date;
	
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public Timestamp getHire_date() {
		return hire_date;
	}
	public void setHire_date(Timestamp hire_date) {
		this.hire_date = hire_date;
	}
	@Override
	public String toString() {
		return "EmployeeDTO [employee_id=" + employee_id + ", first_name=" + first_name + ", hire_date=" + hire_date
				+ "]";
	}
	
	
}
