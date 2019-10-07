package java2019;

import java.util.ArrayList;

public class ArrayList_practic {

	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<String>();
		
		name.add("nimi");
		name.add("Nahida");
		name.add("pall");
		name.add("Bubu");
		name.add("jiji");
		
		//use java 8 with  for each loop & lambda expression
		
		name.forEach(Frind -> {
			System.out.println(Frind);
		});
		
	System.out.println("******************************");
       //Using for loop with order/index:
		for(int i =0; i<name.size();i++) {
			System.out.println(name.get(i));
		}
		
		

	}

}
