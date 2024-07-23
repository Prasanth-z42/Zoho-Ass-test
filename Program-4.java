/**
 * Write a java program to sort the given numbers N[] in such a way that difference between number and its nearest prime number is minimum. if two numbers share same difference between its corresponding nearest prime number, then the smallest among them is given precedence.
 *
 * Input  - 10 12 13 23 35
 * Output - 13 23 10 12 35
*/ 
import java.util.*;
class Main{
    public static boolean isPrime(int n){
        for(int i = 2; i<=n/2; i++){
            if(n%i == 0)
                return false;
        }
        return true;
    }
    public static int[] primeNumbers(){
        int []prime = new int[26];
        int k = 0;
        for(int i = 2; i<100; i++){
            if(isPrime(i))
                prime[k++] = i;
        }
        return prime;
    }
    public static int[] sort(int []arr, int []prime){
        int []diff = new int[arr.length];
        for(int i = 0; i<arr.length; i++){
            int min = Integer.MAX_VALUE;
            int j = 0;
            while(j<prime.length){
                int near = Math.abs(arr[i] - prime[j]);
                if(min > near)
                    min = near;
                j++;
            }
            diff[i] = min;
        }
        //sort
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(diff[i] > diff[j]){
                    int temp = diff[i];   int t = arr[i];
                    diff[i] = diff[j];    arr[i] = arr[j];
                    diff[j] = temp;       arr[j] = t;
                }
            }
        }
        return arr;
    }
    public static void main(String []args){
        int []arr = {10,12,13,23,35};
        int []prime = primeNumbers();
        //System.out.println(Arrays.toString(arr));
        //System.out.println(Arrays.toString(prime));
        arr = sort(arr,prime);
        for(int i = 0; i<arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}