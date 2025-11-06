// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // Replace this comment with your code
		//double num2 = Double.parseDouble(args[1]);
		//int numh = Integer.parseInt(args[0].charAt(0)+args[0].charAt(1));
		//int numm = Integer.parseInt(args[0].charAt(3)+args[0].charAt(4));
      	//int var1 = Integer.parseInt("" + args[0].charAt[0] + args[0].charAt(1));
		//String name1 = args[0];
		//System.out.println(name1.indexOf('@'));
		//int numh = Integer.parseInt(""+args[0].charAt(0)+args[0].charAt(1));
		//int numm = Integer.parseInt(""+args[0].charAt(3)+args[0].charAt(4));
		//int minutesToAdd = Integer.parseInt(args[1]);
		//System.out.println(numh + " "+ minutesToAdd +"  "+ numm);
		//System.out.println((numh + (minutesToAdd/60))%24 +":"+ (numm+ minutesToAdd%60)%60);
		int lim = Integer.parseInt(args[0]);
		double pi =0;
		boolean bool = true;
		for(int i=0;i<lim;i++){
			if(bool==true){
				pi += 1.0/(2*i+1);
			}else{
				pi -=1.0/(2*i+1);
			}
			bool = !bool;
		}
		//System.out.println(pi+pii);
		System.out.println("pi according to Java: "+Math.PI);
		System.out.println("pi, approximated:    " + (pi*4));
	}
}
