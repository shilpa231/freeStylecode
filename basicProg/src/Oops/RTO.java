package Oops;

public class RTO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle v1=new Vehicle(1110,"Honda","Kudave");
		v1.insurance();
		System.out.println(v1.vName);
		System.out.println(v1.getVno());
		
		v1.setVno(2550);
		System.out.println(v1.getVno());
		
	}

}
