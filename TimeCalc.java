public class TimeCalc {
    public static void main(String[] args) {
        // Replace this comment with your code
        int numh = Integer.parseInt(""+args[0].charAt(0)+args[0].charAt(1));
		int numm = Integer.parseInt(""+args[0].charAt(3)+args[0].charAt(4));
		int minutesToAdd = Integer.parseInt(args[1]);
		//System.out.println(numh + " "+ minutesToAdd +"  "+ numm);
        int newh = (numh + ((minutesToAdd+numm)/60))%24;
        int newm = (numm+ minutesToAdd)%60;
        if(newh<10 ){
                    System.out.print("0"+newh+":");
                    if(newm<10){
                        System.out.print("0"+newm);
                    }else{
                        System.out.print(newm);
                    }
        }else{
            if(newm<10){
                    System.out.print(newh+":0"+newm);
            }else{
                System.out.println(newh+":"+newm);
            }
        }
    }
}
