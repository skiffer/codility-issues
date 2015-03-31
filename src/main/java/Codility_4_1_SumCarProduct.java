import java.util.Arrays;

/**
 * Created by yaroslav on 3/27/15.
 */
public class Codility_4_1_SumCarProduct {
    private static int MAX_LENGTH_ARRAY = 100000;
    private static int MIN_LENGTH_ARRAY = 3;
    private static int MAX_ELEM = 1000;
    private static int MIN_ELEM = -1000;


    
    public static void main(String[] args) {
        int[] sorted_sequence_true = {0,1,0,1,1};
        System.out.println(new Codility_4_1_SumCarProduct().solution(sorted_sequence_true));
        
    }


    public int solution(int a[]) {
        int sum = 0;
        if(a.length > MAX_LENGTH_ARRAY || a.length < MIN_LENGTH_ARRAY) {
            throw new RuntimeException("Incorrect an array length");
        }
        
        Arrays.sort(a);
        
        for(int i = a.length - MIN_LENGTH_ARRAY; i >= 0; i++) {
           
            if( (a[i] > 0) && (a[i-1] < 0) ) {
                
            }
            
        }

        
        return sum;
    }
    
}
