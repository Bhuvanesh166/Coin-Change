import java.util.*;
class Coin{
    public static void coinChange(int []arr,int a){
        Arrays.sort(arr);
        int sum=0,c=0;

        for(int i= arr.length-1;i>=0;i--){
            while(sum+arr[i]<=a){
                sum+=arr[i];
                c++;
            }
        }
        //System.out.println(sum);
        if(sum==a){
            System.out.println(c);
        }
        else if(sum<a) {
            System.out.println(-1);
        }
        else {
            System.out.println(0);
        }
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n= scanner.nextInt();

        int arr[]=new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]=scanner.nextInt();
        }
        int  a= scanner.nextInt();
        coinChange(arr,a);
    }
}