#include <stdio.h>

int main(int arg, char** argv){

    int unsorted_arr[] = {5,2,4,6,1,3};
    int arr_length = sizeof(unsorted_arr) / sizeof(int);

    printf("Length of array = %d \n", arr_length);

    for(int i = 1; i < arr_length; i++){
        int key = unsorted_arr[i];
        int j = i - 1;
        while(j >= 0 && unsorted_arr[j] > key){
            unsorted_arr[j + 1] = unsorted_arr[j];
            j = j - 1;
        }
        unsorted_arr[j + 1] = key;
    }

    for(int i=0; i < arr_length; i++) {
        printf("%d, ", unsorted_arr[i]);
    }
    return 0;
}

