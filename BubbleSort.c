#include<stdio.h>
#include<stdbool.h>

void bubble_sort(int arr[], int size) {
    // bubble sort
    for(int i = 0; i < size - 1; i++) {
        bool check = false;
        for(int j = 0; j < size - i - 1; j++) {
            if(arr[j] > arr[j+1]) {
                // swap
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                check = true;
            }
        }
        if(check == false) {
            break;
        }
    }
}

void printarr(int arr[], int size) {
    
    for(int i = 0; i < size; i++) {
        printf("%d ", arr[i]);
    }
}

int main() {
    int arr[] = {2, 4, 56, 5, 1, 4};
    int size = sizeof(arr) / sizeof(arr[0]);

    bubble_sort(arr, size);
    printarr(arr, size);
    return 0;
}