package code_LeetCode.code_2023_03_14.Code;

class Solution1 {
    public int minArray(int[] numbers) {
        int index = 0;
        for(int i =0; i< numbers.length - 1;i++) {
            if(numbers[i] <= numbers[i+1]) {
                index++;
            } else {
                break;
            }
        }
        if(index == numbers.length-1) {
            return numbers[0];
        }
        reverse(numbers,index);
        return numbers[0];
    }

    public void reverse(int[] numbers,int index) {
        for(int i = 0 ; i < index+1 ;i++) {
             int temp = numbers[0];
            for(int j = 1;j < numbers.length;j++) {
                int t = numbers[j-1];
                numbers[j-1] = numbers[j];
            }
            numbers[numbers.length-1] = temp;
        }
    }
}