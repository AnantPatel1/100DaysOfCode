import java.util.Scanner;
public class InsertionSort {
    public static void main(String[] args){
        int n, arr[],i,j;
        Scanner in  = new Scanner(System.in);
        System.out.println("Entet the length of array " );
        n=in.nextInt();
        System.out.println("Enter the value of array");
        arr= new int[n];
        for(i=0;i<n;i++){
            arr[i]= in.nextInt();
        }
for(i=0;i<n-1;i++){
    for(j=i+1;j>0;j--){
        if(arr[j]<arr[j-1])
        swap(arr, j, j-1);
        else break;
    }
}
System.out.println("Array after Sorting");
for (i = 0; i < n; i++) {
    System.out.print(arr[i] + " ");
}
    }
    static void swap(int arr[], int first, int last) {
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }
}
