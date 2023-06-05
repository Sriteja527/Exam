import java.util.*;
public class Exam{
    Scanner sc = new Scanner(System.in);
    void input(){
        System.out.println("enter the size of the array:");
        int n = sc.nextInt();
        System.out.println("enter the array numbers:");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt(); //0,1,0,3,12
        }
        for(int i=0;i<n;i++){
            for(int j=i+1; j<n;j++){
                if(arr[i] == 0){
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i] > arr[j] && arr[i] != 0 && arr[j] != 0){
                   int swap = arr[i];
                   arr[i] = arr[j];
                   arr[j] = swap;
                }
            }
        }
        System.out.println("The  result is:");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }

    }
    public static void main(String... args){
        Array7 a = new Array7();
        a.input();
    }
}