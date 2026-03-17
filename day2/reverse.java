import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int rev=0;
        while(x!=0){
            int mod=x%10;       
            rev=rev*10+mod;
            x/=10;
        }
        System.out.println(rev);
    }
    
}
