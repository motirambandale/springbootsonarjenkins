package com.mit.springbootsonarjenkins.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Employee implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5981346042761246857L;
	private Integer empId;
	private String empName;
	private Integer empSalary;
}
