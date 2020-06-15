package furb.code;

import java.util.*;

public class Ex01Person 
{
	public int age;
	public char gender;
	public boolean hasExperience;
	
	public Ex01Person(int _age, char _gender, boolean _hasExperience)
	{
		age = _age;
		gender = Character.toUpperCase(_gender);
		hasExperience = _hasExperience;
	}
	
	public static List<Ex01Person> getFemale(List<Ex01Person> total)
	{
		//Separar Female do resto
		List<Ex01Person> buffer = new ArrayList<Ex01Person>();
		
		for (Ex01Person p : total)
		{
			if (p.gender == "F".toCharArray()[0])
			{
				buffer.add(p);
			}
		}
		return buffer;
	}
	
	public static List<Ex01Person> getExperiencedFemaleUnder35(List<Ex01Person> femaleTotal)
	{
		List<Ex01Person> buffer = new ArrayList<Ex01Person>();
		
		for (Ex01Person p : femaleTotal)
		{
			if (p.age < 35 && p.hasExperience)
			{
				buffer.add(p);
			}
		}
		return buffer;
	}
	
	public static List<Ex01Person> getMale(List<Ex01Person> total)
	{
		//Separar Male do resto
		List<Ex01Person> buffer = new ArrayList<Ex01Person>();
		
		for (Ex01Person p : total)
		{
			if (p.gender == "M".toCharArray()[0])
			{
				buffer.add(p);
			}
		}
		return buffer;
	}
	
	public static List<Ex01Person> getExperiencedMale(List<Ex01Person> maleTotal)
	{
		List<Ex01Person> buffer = new ArrayList<Ex01Person>();
		
		for (Ex01Person p : maleTotal)
		{
			if (p.hasExperience)
			{
				buffer.add(p);
			}
		}
		return buffer;
	}
	
	public static List<Ex01Person> getMaleOver45 (List<Ex01Person> maleTotal)
	{
		List<Ex01Person> buffer = new ArrayList<Ex01Person>();
		
		for (Ex01Person p : maleTotal)
		{
			if (p.age > 45)
			{
				buffer.add(p);
			}
		}
		return buffer;
	}

}
