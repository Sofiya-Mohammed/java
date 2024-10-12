package looping;

public class demo7 {
	public static void main(String args[]) {
		int i=1;
		while(i<=5) {
			for( int j= 1;j<i;j++) {
				System.out.print("*" +" ");
			}
			for(int a=i;a<=5;a++) {
			System.out.print(1);
			}
			System.out.println();
			i++;
		}
	}

}
