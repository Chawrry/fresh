package lesson.lesson2;

public class Human {

	public static String male = "三劍";
	
	public static String female = "yabi";
	
	public String getName(String str){
		if (str.equals("male"))
			return male;
		else if (str.equals("female"))
			return female;
		
		return "賣亂";
	}
	
}
