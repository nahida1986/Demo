package java2019;

public class TriangleShape {

	public static void main(String[] args) {
		
		int space = 4;
		int odd = 1;
		for(int a=1; a<=5;a++) {
			for (int b =1; b<=space; b++) {
				System.out.print("  "); }
				
				for (int k =1; k<=odd; k++ ) {
				System.out.print(" * ");
			}
			System.out.println();
			odd = odd +1;
			space = space-1;
		}
		

	
	}
	
}
	
	


