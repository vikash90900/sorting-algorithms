function bubbleSort(arr) {
    for (let i = 0; i < arr.length - 1; i++) {
        
        let flag = false;
        
        for (let j = 0; j < arr.length - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
        
                [arr[j], arr[j + 1]] = [arr[j + 1], arr[j]];
                flag = true;
            }
        }
        if (!flag) {
            return;
        }
    }
}

let array = [3, 2, 4, 5, 3, 9, 78, 4, 23];
bubbleSort(array);
console.log(array.join(" "))