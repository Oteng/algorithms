
def insertion_sort(arr):
    for i in range(1, len(arr)):
        value = arr[i]
        j = i - 1
        while j >= 0 and arr[j] > value:
            arr[j + 1] = arr[j]
            j = j - 1
        arr[j + 1] = value
    return arr

def insertion_sort_dec(arr):
    for i in range(1, len(arr)):
        value = arr[i]
        j = i - 1
        while j >= 0 and arr[j] < value:
            arr[j+ 1] = arr[j]
            j = j - 1
        arr[j + 1] = value
    return arr

    
if __name__ == '__main__':

    print(insertion_sort([5,2,4,6,1,3]))
    print(insertion_sort_dec([5,2,4,6,1,3]))