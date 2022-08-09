/*
 * How can we print the pattern this is called solid pattern
 * 
 *    *******
 *    *******
 *    *******
 *    *******
 * 
 */


import java.util.Scanner;

public class SolodPattern{
    public static void main(String[] args) {
    

        Scanner input = new Scanner(System.in);
          System.out.print("Pleas inter your row : ");
        int  n = input.nextInt();
          System.out.print("Pleas inter your column : ");
        int  m = input.nextInt();

        for (int i=1; i<=n; i++) {
            for(int j=1; j<=m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
} 