package Contest.LeetCode.num335;

public class passPillow {
    public static int passThePillow(int n, int time) {
        int l=1,direction=1;
        while(time-->0){
            if (l==n || l==1){
                System.out.println("direction before " + direction);
                direction^=1;
                System.out.println("direction after " + direction);
            }
            if (direction>0){
                l--;
            }else{
                l++;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        int n = 4;
        int time = 5;
        
        // int n = 3;
        // int time = 2;

        System.out.println(passThePillow(4,5));
    }
}

