import java.util.Scanner;
public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum = 0;
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        int expectedSum = (n + 1) * (n + 2) / 2;
        int missing = expectedSum - sum;
        System.out.println("Missing number is: " + missing);
        sc.close();
    }
}
