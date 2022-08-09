/*
* How can we print this pattern ? This is called Invert half pyramid roated by 180 deg
* 
*           *
*          **
*         ***
*        ****
*       ***** 
*/

public class InvertHalfPyramic180 {
    public static void main(String[] args) {
        int n = 4;
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
