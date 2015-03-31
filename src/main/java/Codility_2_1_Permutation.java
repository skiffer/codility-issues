/**
 * Created by yaroslav on 3/27/15.
 */
public class Codility_2_1_Permutation {
    private static int MAX_VALUE = 1000000000;
    private static int MIN_VALUE = 1;
    private static int MAX_LENGTH_ARRAY = 100000;

    
    public static void main(String[] args) {
        int[] sorted_sequence_true = {1,2,3,4};
        System.out.println(new Codility_2_1_Permutation().solution(sorted_sequence_true));
        
        int[] unsorted_sequence_true = {1,2,4,3,7,6,5};
        System.out.println(new Codility_2_1_Permutation().solution(unsorted_sequence_true));
        
        int[] messy_array_false = {5435, 234234, 43254352, 234324235, 525252342, 43252352, 423423, 423};
        System.out.println(new Codility_2_1_Permutation().solution(messy_array_false));
        
    }


    public int solution(int[] a) {
        if(a.length > MAX_LENGTH_ARRAY) {
            throw new RuntimeException("Incorrect an array length");
        }
        
        int sumValues = 0;
        int sumIndexes = 0;
        for(int i = 0; i < a.length; i++) {
            if (a[i] < MIN_VALUE && a[i] > MAX_VALUE) {
                throw new RuntimeException("Incorrect value");
            }
            
            sumValues += a[i];
            sumIndexes += (i + 1);
        }
        
        if(sumValues == sumIndexes) {
            return 1;
        }
        return 0;
    }
    
}
