package looping;

public class demo4 {
	public static void main (String agrs[]) {
		int val=10;
		int i=1;
		while(i<=4) {
			for(int j=1;j<=i;j++) {
				System.out.print(val+" ");
				val--;
			}
			System.out.println();
			i++;
		}
			
	}

}
