package lesson.lesson1;

public class Lesson1 {

	public static void main(String[] args) {
		
		print_void();
		
		print_void_string("�}��");
		
		int a = getInt();
		
		System.out.println("a���ȬO : " + a);
		
		int b = getInt_and_return(a);
		
		System.out.println("b���ȬO : " + b);

	}

	public static void print_void(){
		System.out.println("�o�Ӥ�k�S���^�ǭ�");
	}
	
	public static void print_void_string(String str){
		System.out.println("�o�Ӥ�k�S���^�ǭȡA�����ǤJ�ȡG"+str);
	}
	
	public static int getInt (){
		return 1;
	}
	
	public static int getInt_and_return (int integer){
		return 1+integer;
	}
	
	public static void print (String str,int integer,String value){
		if (integer > 0)
			System.out.println(str + " : " + integer);
		else if (null != value)
			System.out.println(str + " : " + value);
	}
}
