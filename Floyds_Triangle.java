package pattern_question;

import java.util.Scanner;

public class Floyds_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number u want to print in pattern :");

        
        int n=sc.nextInt();
        int number=1;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(number + " ");
                number++;

            }
            System.out.println();
        }
    }
    
}
