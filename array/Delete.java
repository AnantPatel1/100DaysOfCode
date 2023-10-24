import java.io.*;
import java.util.Arrays;
public class Delete {
  static  int arr[];
    public static void main(String args[]) throws IOException{
        int n,i,x,j;
BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the size of array");
n= Integer.parseInt(in.readLine());
arr = new int[n];
System.out.println("Enter the values of array");
for (i=0;i<n;i++)
{
    arr[i]=Integer.parseInt(in.readLine());
}
System.out.println("Enter the element to be deleted");
x=Integer.parseInt(in.readLine());

try{
    for (i=0;i<n;i++)
{
    if(arr[i]==x)
    break;
}
if(i==n)
System.out.println("Element not found");
else{
    for(j=i;j<n-1;j++)
    {
        arr[j]=arr[j+1];
    }
    arr[n-1]=Integer.MIN_VALUE;
    System.out.println("After Deleting Element Array is : " + Arrays.toString(arr));
}

}catch
(Exception e){
    System.out.println("Invalid");
}
    }
}
