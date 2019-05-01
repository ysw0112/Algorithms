package baekjun.ninth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beakjoon2751 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        int[] heap = new int[count];


        for(int i=0; i<count; i++) {
            heap[i] = Integer.parseInt(br.readLine());
        }

        for(int i = 1; i < heap.length; i++){
            int c = i;
            do {
                int root = (c-1)/2;
                if(heap[root] < heap[c]){
                    int temp = heap[root];
                    heap[root] = heap[c];
                    heap[c] = temp;
                }
                c = root;
            } while ( c != 0);
        }

        for(int i = heap.length - 1; i>=0; i--){
            int temp = heap[i];
            heap[i] = heap[0];
            heap[0] = temp;

            int root = 0;
            int c = 1;
            do{
                c = 2 * root + 1;
                if(c < i - 1 && heap[c] < heap[c+1]){
                    c++;
                }
                if(c < i && heap[root] < heap[c]){
                    int temp2 = heap[root];
                    heap[root] = heap[c];
                    heap[c] = temp2;
                }
                root = c;
            }while(c < i);
        }

        for(int i=0; i<heap.length; i++){
            System.out.println(heap[i]);
        }
    }
}
