// Selection Sort - Selct the first Unsorted elememt of array and compare it with Small element than that and swapped to first position and so on.
// Time complexity - O{n^2}

public class SelectionSort {
    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int array[] = {7, 1, 2, 4, 3, 99, 22, 77};

        //Selection sort
        for(int i = 0; i < array.length-1; i++){
            int smallest = i;
            for(int current = i+1; current < array.length; current++){
                if(array[smallest] > array[current]){
                    smallest = current;
                }
            }
            int temp = array[smallest];
            array[smallest] = array[i];
            array[i] = temp;

        }

        printArr(array);
    }
}
