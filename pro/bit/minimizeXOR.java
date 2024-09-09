package pro.bit;

public class minimizeXOR {
    public static void main(String[] args) {
        System.out.println(minimizeXor(1, 12));
        // System.out.println(minimizeXor(3, 5));
        //12= 1100
        //1=  0001
    }

    public static int minimizeXor(int num1, int num2) {
        int bitCount = Integer.bitCount(num2);
        bitCount -= Integer.bitCount(num1);

        int cur = 1;
        while (bitCount != 0) {
            int resultAND = num1 & cur;
            System.out.println("num1 & cur is " + resultAND);
            if (bitCount < 0 && (num1 & cur) != 0) { // if num2 have less bitCount && current binary is 1
                int resultXor1 = num1 ^= cur; // xor: num1 XOR cur
                System.out.println("num1 XOR cur is " + resultXor1);
                num1 ^= cur; // remove binary //xor: num1 XOR cur
                bitCount++;
            } else if (bitCount > 0 && (num1 & cur) == 0) { // if num2 have bigger bitCount && current binary is 0
                int resultOR1 = num1 ^= cur; // xor: num1 XOR cur
                System.out.println("num1 XOR cur is " + resultOR1);
                num1 |= cur; // add binary
                bitCount--;
            }

            int resultLEFTSHIFT1 = cur <<= 1; // xor: num1 XOR cur
            System.out.println("CUR LEFTSHIFT 1 is " + resultLEFTSHIFT1);
        }

        System.out.println("Final ans num1 " + num1);
        return num1;
    }
}
