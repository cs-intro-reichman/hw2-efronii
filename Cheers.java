//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    // Replace this comment with your code
                String name1 = args[0];
                name1= name1.toUpperCase();
                String spel ="";
                int it = Integer.parseInt(args[1]);
                for (int i =0 ; i<name1.length();i++){
                         if(name1.charAt(i)=='A'||name1.charAt(i)=='E'||name1.charAt(i)=='F'||name1.charAt(i)=='H'||name1.charAt(i)=='I'||name1.charAt(i)=='L'||name1.charAt(i)=='M'||name1.charAt(i)=='N'||name1.charAt(i)=='O'||name1.charAt(i)=='R'||name1.charAt(i)=='S'||name1.charAt(i)=='X'){
                                spel="an";
                                }else{
                                        spel="a";
                                }
                        System.out.println("Give me "+spel+ " "+name1.charAt(i)+": "+ name1.charAt(i)+"!");
                }
                System.out.println("What does that spell?");
                for (int i =0 ; i<it;i++){
                        System.out.println(name1+" ! ! !");
                }


        }
}
