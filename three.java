public class three {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        int[] arr2 = new int[5];
        System.out.print("The original array is: ");
        for(int i=0;i<5;i++){
            System.out.print(arr[i]);
        }
        System.out.print("\nThe array after reversal is: ");
        for(int i=0;i<5;i++){
            arr2[i] = arr[4-i];
            System.out.print(arr2[i]);
        }
        System.out.println("");
    }
}
