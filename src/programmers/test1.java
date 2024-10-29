package programmers;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class test1 {


    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd");

    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = "01/01 4 50000,01/11 6 3555,02/01 0 -23555,02/25 5 5000,03/25 0 -15000,06/09 8 43951,12/30 9 99999".replaceAll("/","-").split(",");
        test1 test1 = new test1();
        test1.solution(input);
    }

    private void solution(String[] input) {
        for (int i = 0; i < input.length; i++) {
            String[] splitInput = input[i].split(" ");

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date parse = null;
            try {
                parse = dateFormat.parse(splitInput[0]);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            System.out.println(parse);
            int rate = Integer.parseInt(splitInput[1]);
            int amount = Integer.parseInt(splitInput[2]);

        }

    }

//    class Breakdown {
//
//        public LocalDateTime getTransactionDate() {
//            return TransactionDate;
//        }
//
//        public int getRate() {
//            return rate;
//        }
//
//        public int getAmount() {
//            return amount;
//        }
//
//        LocalDateTime TransactionDate;
//        int rate;
//        int amount;
//
//        public Breakdown(LocalDateTime transactionDate, int rate, int amount) {
//            TransactionDate = transactionDate;
//            this.rate = rate;
//            this.amount = amount;
//        }
//    }
}
//01/01 4 50000,01/11 6 3555,02/01 0 -23555,02/25 5 5000,03/25 0 -15000,06/09 8 43951,12/30 9 99999