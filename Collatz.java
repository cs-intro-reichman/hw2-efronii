// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    // Replace this comment with your code
		int it = Integer.parseInt(args[0]);
		String m = args[1];
		for(int i =1; i<=it;i++){
			int t = 0;
			int num = i; 
			if(i==1&&num==1){
				t++;
				System.out.print(num+" ");
				num=num*3+1;
			}
			while(num!=1){
				System.out.print(num+" ");
				t++;
				if(num%2==0){
					num=num/2;
				}else{
					num=num*3+1;
				}
			
		}
		
		System.out.print("1 ("+(t+1)+")");
		System.out.println();

		}
		

	}
}
