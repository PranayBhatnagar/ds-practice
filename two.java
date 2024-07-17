public class two {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int temp = arr[0];
        int largest = 0;
        for(int i=0;i<5;i++){
            if(arr[i]>temp){
                largest = arr[i];
            }
        }
        System.out.println("Largest number is: " + largest);
    }
    
}
