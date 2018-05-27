/*
Write a program to print the sum of the elements of the array with the given below condition. If the array has 6 and 7 in succeeding orders, ignore 6 and 7 and the numbers between them for the calculation of sum.
Eg1) Array Elements - 10,3,6,1,2,7,9
O/P: 22   
[i.e 10+3+9]
Eg2) Array Elements - 7,1,2,3,6
O/P:19
Eg3) Array Elements - 1,6,4,7,9
O/P:10
*/

class Prog9 {
	int linSrch(int arr[], int key) {
		int index = -1;
		for (int i = 0;i < arr.length;i++) {
			if (key == arr[i]) {
				index = i;
				break;
			}
		}
		return index;
	}

    public static void main(String[] args) {
        int arr[] = {1,6,4,7,9};
        Prog9 obj = new Prog9();
        int index1 =  obj.linSrch(arr,6), index2 = obj.linSrch(arr, 7);
        if (index1 < index2) {
        	for (int i = index1;i <= index2;i++) arr[i] = 0;
        }
    	int sum = 0;
    	for (int i:arr) sum += i;
    	System.out.println(sum);
    }
}