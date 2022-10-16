#include <stdio.h>

int insertion_sort(int *arr, int length){
    for(int i = 1; i < length; i++){
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    return 0;
}

int main(int arg, char** argv){

    int unsorted_arr[] = {5,2,4,6,1,3};
    int arr_length = sizeof(unsorted_arr) / sizeof(int);

    printf("Length of array = %d \n", arr_length);

    insertion_sort(&unsorted_arr, arr_length);

    for(int i=0; i < arr_length; i++) {
            printf("%d, ", unsorted_arr[i]);
        }
    return 0;
}

