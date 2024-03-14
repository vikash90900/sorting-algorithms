/* Bubble Sort - Largest Element is set in the last and rest is checked for whole array excluding 
                 last element because it is already sorted and so on.*/

// Time Complexity = O{n^2} - Worst case When array is in descending order
                // = O{n} - Best case When array is in increasing order
public class BubbleSort {

    public static void bubble_sort(int array[]) {
        //bubble sort
        for(int i = 0; i < array.length-1; i++){
            boolean check = false;
            for(int j = 0; j < array.length - i - 1; j++){
                
                if(array[j] > array[j+1]){
                    //swap
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    check = true;
                }
            }
            if(check == false) {
                return;
            }
        }
    }
    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int array[] = {7, 1, 2, 4, 3, 99, 22, 77};

        bubble_sort(array);
        printArr(array);
    }
}
