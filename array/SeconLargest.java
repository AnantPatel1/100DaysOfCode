import java.io.*;

public class SeconLargest {
    static  int arr[];
    public static void main(String args[]) throws IOException{
        int n,i, res, largest;
BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the size of array");
n= Integer.parseInt(in.readLine());
arr = new int[n];
System.out.println("Enter the values of array");
for (i=0;i<n;i++)
{
    arr[i]=Integer.parseInt(in.readLine());
}
try{
    res=-1;
    largest=0;
    for (i=1;i<n;i++)
{
   if(arr[i]>arr[largest])
   {
    res=largest;
    largest=i;
   }
   if(arr[i]!=arr[largest]){
    if(res==-1 || arr[i]>res)
    res=i;
   }

}

    System.out.println("Secon Largest Element in array is : " + arr[res]);

}catch
(Exception e){
    System.out.println("Invalid");
}
    }
    
}
