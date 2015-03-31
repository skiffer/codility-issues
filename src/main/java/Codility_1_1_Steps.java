/**
 * Created by yaroslav on 3/27/15.
 */
public class Codility_1_1_Steps {
    private static int MAX_VALUE = 1000000000;
    private static int MIN_VALUE = 1;
    
    public static void main(String[] args) {
        System.out.println(new Codility_1_1_Steps().solution(10, 85, 30));
        System.out.println(new Codility_1_1_Steps().solution(0, 85, 30));
        System.out.println(new Codility_1_1_Steps().solution(10, 0, 30));
        System.out.println(new Codility_1_1_Steps().solution(10, 85, 0));
        System.out.println(new Codility_1_1_Steps().solution(10, 85, 1000000001));
        System.out.println(new Codility_1_1_Steps().solution(10, 850000, 30));
        
        
    }


    public int solution(int X, int Y, int D) {
        if (X >= MIN_VALUE && Y >= MIN_VALUE && X >= MIN_VALUE) {
            if (X <= MAX_VALUE && Y <= MAX_VALUE && D <= MAX_VALUE) {
                return (int) Math.ceil(Math.abs(X - Y) / (double) D);
            }
        }
        throw new RuntimeException("Incorrect params");
    }
    
}
