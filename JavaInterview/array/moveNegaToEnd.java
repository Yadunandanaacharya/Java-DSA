package array;

public class moveNegaToEnd {
    public static void main(String[] args) {
        int[] arr = new int[]{1, -1, 3, 2, -7, -5, 11, 6 };
        int[] temp = new int[arr.length];
        int idx = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= 0){
                temp[idx] = arr[i];
                idx++;
            }
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0){
                temp[idx] = arr[i];
                idx++;
            }
        }

        System.out.println();
        for(int i = 0; i < temp.length;i++){
            System.out.print(temp[i] + " ,");
        }
    }
}
