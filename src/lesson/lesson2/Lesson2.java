package lesson.lesson2;

public class Lesson2 {

	public static void main(String[] args) {
		
		Human human = new Human();
		
		System.out.println(Human.male);
		System.out.println(Human.female);
		System.out.println(human.getName("gmale"));
		System.out.println(human.getName("female"));
		
		Animal animal =  new Animal();
		
		Animal.print();
		System.out.println(animal.elephant);
		System.out.println(animal.cat);
		
	}
	
}
