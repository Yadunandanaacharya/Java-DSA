package InterviewCSharpJava;

public class minMax {
    public static void main(String[] args) {
        int[]  arr = new int[]{3, 2, 1, 56, 10000, 167};
        int[] out = minMax(arr);
        System.out.println();
        System.out.println(out[0] + " " + out[1]);
    }

    public static Pair<Long,Long> minMax(int[] input){
        int[] outPut = new int[2];
        int min = input[0];
        int max = input[0];
        for(int i = 0; i < input.length; i++){
            max= Math.max(max, input[i]);
            min= Math.min(min, input[i]);
        }

        outPut[0] = min;
        outPut[1] = max;
        return outPut;
    }
}
