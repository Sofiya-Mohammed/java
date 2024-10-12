package looping;

public class demo5 {
	public static void main(String args[]) {
		int i=1;
		while(i<=5) {
			for(int j=i;j<5;j++) {
				System.out.print("*");
			}
			System.out.print(1);
			System.out.println();
			i++;
		}
	}

}
