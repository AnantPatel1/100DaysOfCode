import java.util.Scanner;
public class SelectionSort {

    public static void main(String[] args) throws Exception {
        int arr[],n,i,j;
        System.out.println("Enter the length of the array: ");
        Scanner in = new Scanner(System.in);
n=in.nextInt();
arr= new int[n];
System.out.println("Enter the elements");
for( i=0;i<n;i++){
    arr[i]=in.nextInt();
}
for(i=0;i<n;i++){
int last= n-i-1;
int max= getMaxIndex(arr, 0, last);
Swap(arr,last,max);
}
System.out.println("Array after Sorting");
for (i = 0; i < n; i++) {
    System.out.print(arr[i] + " ");
}
    }
    static int getMaxIndex(int[] arr, int first, int last){
        int max = first;
        for (int i = first + 1; i <= last; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }
    static void Swap(int arr[], int firstid, int secondid){
        int temp= arr[firstid];
        arr[firstid]=arr[secondid];
        arr[secondid]=temp;
    } 

    
}
