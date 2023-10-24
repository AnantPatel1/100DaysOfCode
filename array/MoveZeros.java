public class MoveZeros {
  public static void main(String[] args){
    int nums []={0,1,0,3,12};
    int nonZeroIndex = 0;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] != 0) {
            int temp = nums[i];
            nums[i] = nums[nonZeroIndex];
            nums[nonZeroIndex] = temp;
            nonZeroIndex++;
        }
    }
      
       
        System.out.println("Array after moving zeros is :");
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
  }  
  static void swap(int arr[], int first, int last){
    int temp= arr[first];
    arr[first]=arr[last];
    arr[last]=temp;
}
}
