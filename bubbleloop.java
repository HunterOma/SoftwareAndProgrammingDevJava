//Hunter O'Malley, hunter.o'malley@malad.us

//for CTE software development 1

//instructor Mr Gross

class BubbleSort {

     public static int[] swapTwoArrayElements(int[] arrayToSwap, int lowerIndex){

     int temp;

     temp=arrayToSwap[lowerIndex];

     arrayToSwap[lowerIndex]=arrayToSwap[lowerIndex+1];

     arrayToSwap[lowerIndex+1]=temp;

        return arrayToSwap;
}
    public static void main(String[] args){
        int[] arrayToSort={1,3,4,5,1,23,57,126,4,543,345,23,12,45,67,97};// this creates the array.

        int n = arrayToSort.length;

        for (int temp = 0; temp < n; ++temp){
        System.out.print(arrayToSort[temp] + " ");
        }
        System.out.println();
         for(int i=0; i < n; i++){
                 for(int x=1; x < (n-i); x++){
                          if(arrayToSort[x-1] > arrayToSort[x]){
                                 arrayToSort=swapTwoArrayElements(arrayToSort, x-1);
                         }
                 }
             }
        for (int temp = 0; temp < n; ++temp){
            System.out.print(arrayToSort[temp] + " ");
            System.out.println();
     }





    }
}
