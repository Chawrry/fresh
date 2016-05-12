package homeWork.hw1;

public class Hw1 {
	
	private static String[] name = new String[2];
	
	private static String[] expression = {};
	
	public static void happy_birthday(){
		
		for (int i=0;i<name.length;i++){

			
			
		}
		
	}
	
	public static String getName (int i){
		
		String[] name ={"三劍","yabi"};
		
		return name[i];
	};
	
	public static String getDate (int i){
		
		String[] date = {"5/13","5/7"};
		
		return date[i];
	}
	
	public static void congradulations(String str1,String str2){
		
		System.out.println(str1 + "生日是 : " + str2 );
		
	}
	
	public static void main(String[] args) {
		
		happy_birthday();

	}

}
