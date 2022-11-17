package Oops;

public class StaticMember2 extends StaticMembers {

	int z;

	static public void display() {
		System.out.println("Static Member2...... display method");
	}

	public static void main(String[] args) {
		
		StaticMember2 obj = new StaticMember2();
		System.out.println(obj.z);
		obj.display();
		System.out.println();
		

	}
}