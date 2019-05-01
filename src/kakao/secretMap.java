package kakao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class secretMap {
    public static String[] toBinaryArr(String[] arr, String input, int cnt){
        for (int i=0; i<arr.length; i++){
            int arrValueCheck = Integer.parseInt(input.split(" ")[i]);

            if(arrValueCheck >= 0 && arrValueCheck < (int)Math.pow(2,cnt)){
                int ln = cnt - Integer.toBinaryString(arrValueCheck).length();
                arr[i] = Integer.toBinaryString(arrValueCheck);
                for (int j=0; j<ln; j++){
                    arr[i] = "0" + arr[i];
                }
            }else{
                System.out.println("input arr value error");
                break;
            }
        }
        return arr;
    }

    public static int[][] makeFlatArray(String[] arr, int cnt){
        int[][] result = new int[cnt][cnt];

        for (int i=0; i<cnt; i++){
            for(int j=0; j<cnt; j++){
                result[i][j] = Integer.parseInt(arr[i].split("")[j]);
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());
        String input1 = br.readLine();
        String input2 = br.readLine();

        String[] arr1 = new String[cnt];
        String[] arr2 = new String[cnt];

        arr1 = toBinaryArr(arr1, input1, cnt);
        arr2 = toBinaryArr(arr2, input2, cnt);

        int[][] result1 = makeFlatArray(arr1, cnt);
        int[][] result2 = makeFlatArray(arr2, cnt);
        String[] result = new String[cnt];

        for(int i=0; i<cnt; i++){
            for (int j=0; j<cnt; j++){
                if(j == 0) result[i] = "";
                if((result1[i][j]|result2[i][j]) == 0){
                    result[i] += " ";
                }else{
                    result[i] += "#";
                }
            }
            System.out.println(result[i]);
        }
    }
}
