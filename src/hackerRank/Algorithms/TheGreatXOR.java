package hackerRank.Algorithms;

public class TheGreatXOR {

    public static void main(String[] args) {
//        long input = 10;
//        int count = 0;
//        for (long i=0; i<10; i++){
//            long xor = i ^ input;
//            if(xor > input) count++;
//        }
//        System.out.println(count);

        long x = 10;
        // your code goes here
        long b = 1;
        long total = 0;
        while(b < x) {
            if((b & x) == 0) {
                total += b;
            }
            b = b * 2;
        }
        System.out.println(total);
    }
}
