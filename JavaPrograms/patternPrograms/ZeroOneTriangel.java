/*
 * How can we print this pattern? This is called 0-1 triangle pattern
 *      1
 *      0 1
 *      1 0 1 
 *      0 1 0 1
 *      1 0 1 0 1
 */

public class ZeroOneTriangel{
   
public static void main(String[] args) {
    int n = 5;
    //outer loop 
    for(int i=1;i<=n;i++) {
        //inner loop
        for(int j=1;j<=i;j++) {
            int sun = i+j;
            if(sun %2 ==0){
               System.out.print("1" + " ");
            }else{
                System.out.print("0" + " ");
            }

           
        }
        System.out.println();
    }
}
} 