import java.util.*;
public class pattern12 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            if(i!=n){
                for(int k=1;k<=2*(n-i);k++){
                    System.out.print("  ");
                }
            }
                
            for(int t=i;t>=1;t--){
                System.out.print(t+" ");
            }
            System.out.println();
        }

    }
}
/*
Output:
9
1                                 1 
1 2                             2 1
1 2 3                         3 2 1
1 2 3 4                     4 3 2 1
1 2 3 4 5                 5 4 3 2 1
1 2 3 4 5 6             6 5 4 3 2 1
1 2 3 4 5 6 7         7 6 5 4 3 2 1 
1 2 3 4 5 6 7 8     8 7 6 5 4 3 2 1
1 2 3 4 5 6 7 8 9 9 8 7 6 5 4 3 2 1
 */