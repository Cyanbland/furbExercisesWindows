package furb.code;

import java.util.*;

public class Ex03Driver {
	public int birthYear;
	public char gender;
	public int age;
	
	public Ex03Driver(int _birthYear, char _gender)
	{
		birthYear = _birthYear;
		gender = Character.toUpperCase(_gender);
		age = 2020 - birthYear;
	}
	
	public static List<Ex03Driver> getFemales(List<Ex03Driver> total)
	{
		List<Ex03Driver> buffer = new ArrayList<Ex03Driver>();
		
		for (Ex03Driver d : total)
		{
			if(d.gender == "F".toCharArray()[0])
			{
				buffer.add(d);
			}
		}
		return buffer;
	}
	
	public static List<Ex03Driver> getUnder21(List<Ex03Driver> total)
	{
		List<Ex03Driver> buffer = new ArrayList<Ex03Driver>();
		
		for (Ex03Driver d : total)
		{
			if(d.age < 21)
			{
				buffer.add(d);
			}
		}
		return buffer;
	}
	
	public static List<Ex03Driver> getOver60(List<Ex03Driver> total)
	{
		List<Ex03Driver> buffer = new ArrayList<Ex03Driver>();
		
		for (Ex03Driver d : total)
		{
			if(d.age > 60)
			{
				buffer.add(d);
			}
		}
		return buffer;
	}
	
	public static List<Ex03Driver> get(List<Ex03Driver> total)
	{
		List<Ex03Driver> buffer = new ArrayList<Ex03Driver>();
		
		for (Ex03Driver d : total)
		{
			if(d.age < 21)
			{
				buffer.add(d);
			}
		}
		return buffer;
	}
	
}
