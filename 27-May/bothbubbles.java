import java.util.Arrays;

public class bothbubbles {
    void bubbleAscend(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    void bubbleDescend(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
     int[] arr = new int[]{9,6,8,7,1,5,4,2,3};
     bothbubbles worker =new bothbubbles();
     worker.bubbleAscend(arr);
     worker.bubbleDescend(arr);

    }
}
