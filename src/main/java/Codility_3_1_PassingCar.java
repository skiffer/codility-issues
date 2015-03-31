/**
 * Created by yaroslav on 3/27/15.
 */
public class Codility_3_1_PassingCar {
    private static int MAX_LENGTH_ARRAY = 100000;
    private static int MIN_LENGTH_ARRAY = 100000;
    private static int MAX_PASSING = 1000000000;

    
    public static void main(String[] args) {
        int[] sorted_sequence_true = {0,1,0,1,1};
        System.out.println(new Codility_3_1_PassingCar().solution(sorted_sequence_true));
        
    }


    public int solution(int a[]) {
        
        if(a.length > MAX_LENGTH_ARRAY) {
            throw new RuntimeException("Incorrect an array length");
        }
        int countZeros = 0;
        int sumPassing = 0;
        for(int i = 0; i < a.length; i++) {
            
            if(a[i] < 0 || a[i] > 1) {
                return -1;
            }
            
            if(a[i] == 0) {
                countZeros++;
            } 
            
            if(a[i] == 1) {
                sumPassing += countZeros;
            }
            
            if(sumPassing > MAX_PASSING) {
                return -1;
            }
        }
        
        return sumPassing;
    }
    
}
