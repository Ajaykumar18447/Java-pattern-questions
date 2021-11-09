package pattern_question;



public class Butterfly {
    public static void main(String[] args) {
        int n=4;

          // upper half

        for(int i=1; i<=n; i++){
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }

            //spaces
            int spaces = 2*(n-i);
            for(int j=1; j<=spaces;j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }


            System.out.println();
        }

               // lowerhalf 
        for(int i=n; i>=1; i--){
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }

            //spaces
            int spaces = 2*(n-i);
            for(int j=1; j<=spaces;j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }


            System.out.println();
        }
    }
    
}
