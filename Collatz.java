// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    // Replace this comment with your code
		int num = Integer.parseInt(args[0]);
		int t = 1;
		while(num!=1){
			System.out.print(num+" ");
			t++;
			if(num%2==0){
				num=num/2;
			}else{
				num=num*3+1;
			}
			
		}
		System.out.print("("+t+")");

	}
}
