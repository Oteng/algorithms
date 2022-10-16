function insertion_sort(arr){
    for(let i = 1; i < arr.length; i++){
        let value = arr[i];
        let j = i - 1;
        while(i >= 0 && arr[j] > value){
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        arr[j+1] = value;
    }
    return arr;
}

//test 
console.log(insertion_sort([5,2,4,6,1,3]));