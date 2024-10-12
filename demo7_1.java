package looping;

public class demo7_1 {
	public static void main(String args[]) {
		int i=1;
		while(i<=5) {
			for( int j= 1;j<i;j++)//j=1 //i=2 //2
				{
				System.out.print("*" +" ");
			}
			for(int a=1;a<=6-i;a++)//i=1 //2
				{
			System.out.print(1);
			}
			System.out.println();
			i++;
		}
	}
}
