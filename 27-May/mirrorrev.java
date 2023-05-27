public class mirrorrev {
    void mirrorReverse(int[] arr){
        int size=arr.length;
        
        for (int i = 0; i < size; i++) {
            if (i == size - 1) {
                System.out.println("It is a mirror");
                return;
            }
            if (arr[i] == arr[size - i - 1]) {
                continue;
            } else {
                System.out.println("Not a mirror");
                return;
            }
           
        }
        
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,2,1};
        mirrorrev worker =new mirrorrev();
        worker.mirrorReverse(arr);
    }
}
