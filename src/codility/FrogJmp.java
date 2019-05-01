package codility;

public class FrogJmp {
    public static int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        if(X > Y){
            return 0;
        }
        int cnt = ((Y - X) / D) + 1;
        return cnt;
    }

    public static int solution2(int X, int Y, int D) {
        // write your code in Java SE 8
        System.out.println((Y - X) / D);
        return (int)Math.ceil((double)(Y - X) / (double)D);
    }

    public static void main(String[] args){
//        System.out.println(solution(10,85,30));
        System.out.println(solution2(10,101,30));
    }
}
