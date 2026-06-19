public class questionThree {
   public static void rightRotate(int[] arr, int n) {
       int length = arr.length;
       n = n % length; 
       int[] temp = new int[n];
       for (int i = 0; i < n; i++) {
           temp[i] = arr[length - n + i];
       }
       for (int i = length - 1; i >= n; i--) {
           arr[i] = arr[i - n];
       }
       for (int i = 0; i < n; i++) {
           arr[i] = temp[i];
       }
   }
   public static void main(String[] args) {
       int[] array = {1, 2, 3, 4, 5};
       int rotations = 2;
       System.out.println("Original Array:");
       for (int num : array) {
           System.out.print(num + " ");
       }
       rightRotate(array, rotations);
       System.out.println("\nArray after " + rotations + " right rotations:");
       for (int num : array) {
           System.out.print(num + " ");
       }
   }
}