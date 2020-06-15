package furb.code;

import java.util.*;

public class Ex04Employee {
	public int id;
	public char category;
	public double salary;
	public Ex04Employee(int _id, char _category, double _salary)
	{
		id = _id;
		category = Character.toUpperCase(_category);
		salary = _salary;
	}
	
	public static double getSalaryRaise(List <Ex04Employee> total)
	{
		double raisedSalary = 0;
		for (Ex04Employee e : total)
		{	
			if (e.category == "A".toCharArray()[0] || e.category == "C".toCharArray()[0])
			{
				raisedSalary = (e.salary * 1.02);
			}
			else if (e.category == "B".toCharArray()[0] || e.category == "D".toCharArray()[0] || e.category == "E".toCharArray()[0])
			{
				raisedSalary = (e.salary * 1.03);
			}
			else if (e.category == "F".toCharArray()[0] || e.category == "G".toCharArray()[0])
			{
				raisedSalary = (e.salary * 1.05);
			}
			else
			{
				raisedSalary = e.salary;
			}
		}
		return raisedSalary;
	}
}
