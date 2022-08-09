/*
 * How can we print this pattern? This is called invert half pyramid.
 *      *****
 *      ****
 *      ***
 *      **
 *      *
 */

public class InvertHalfPyramid {
    public static void main(String[] args) {
        int n = 5;

        for(int i=n; i>=1;i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
