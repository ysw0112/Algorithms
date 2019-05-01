package kakao;

public class kakaoForeignKey {

    public static int solution(String[][] input){

        String temp = "";
        int cnt=0;


        for (int i=0; i<input[0].length; i++){
            for (int j=0; j<input[0].length; j++){
                String check = input[j][i];
                for (int k=j+1; k<input[0].length; k++){
                    if(check.equals(input[k][i])) break;
                }
            }
            cnt++;
        }

        return cnt;
    }

    public static void main(String[] args){
        String[][] input = {{"100","ryan","music","2"},
                            {"200","apeach","math","2"},
                            {"300", "tube", "computer", "3"},
                            {"400", "con", "computer", "4"},
                            {"500", "muzi", "music", "3"},
                            {"600", "apeach", "music", "2"}};
        solution(input);
    }
}
