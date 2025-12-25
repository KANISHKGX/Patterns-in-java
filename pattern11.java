import java.util.*;
public class pattern11 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print((j+i+1)%2+" ");
            }
            System.out.println();
        }
    }
}
/*
Output:
5
1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1
 */