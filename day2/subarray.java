import java.util.Scanner;
public class subarray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums= new int[n];
        for(int i=0;i<n;i++){
            nums[i]= sc.nextInt();
        }
        int max=nums[0];
        int current=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]>current+nums[i]){
                current=nums[i];
            } else{
                current= current+nums[i];
            }
            if(current>max){
                max=current; 
            }
        }
        System.out.println(max);
    }
}
