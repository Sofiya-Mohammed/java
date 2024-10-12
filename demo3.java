package looping;

public class demo3 {
	public static void main(String args[ ]) {
		int i=1;
	while(i<=5) {
		for(int j=1;j<=i;j++) {
			System.out.print(i);
		}
		System.out.println();
		i++;
	}
	}
}