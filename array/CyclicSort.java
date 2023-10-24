import java.util.Scanner;
public class CyclicSort {
    public static void main(String[] args){
        int n, arr[],i;
        Scanner in  = new Scanner(System.in);
        System.out.println("Entet the length of array " );
        n=in.nextInt();
        System.out.println("Enter the value of array");
        arr= new int[n];
        for(i=0;i<n;i++){
            arr[i]= in.nextInt();
        }
i=0;
while(i<n){
    int correct = arr[i] - 1;
            if (arr[correct] != arr[i]) {
                swap(arr, i, correct);
            } else {
                i++;
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
