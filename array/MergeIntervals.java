public class MergeIntervals{
    public static void main(String[] args){
       int intervals [][]={{1,3},{2,6},{8,10},{15,18}};
    //    for(int i=0;i<intervals.length;i++){
    //     for(int j=0;j<intervals[i].length;j++){
    //         if()
    //     }
    //    }
    merge(intervals, 0, 1);
    for(int i=0;i<intervals.length;i++){
        for(int j=0;j<intervals[i].length;j++){
           System.out.print(intervals[i][j] +" ");
       }
       System.out.println();
       }
    
    }
    static void merge(int arr[][], int start, int end){
      arr[start][arr[start].length-1]=arr[end][arr[end].length-1] ;
    }
}