import java.util.Arrays;

class Solution {

    public static void main(String[] args) {

        int A[] = {1, 3, 6, 4, 1, 2};
        int B[] = {1, 2, 3, 4, 5, 6};

        System.out.println(solution(A));
        System.out.println(solution(B));

    }

    public static int solution(int[] A) {
        int arrayLength = A.length;
        int min = 1;

        Arrays.sort(A);

        if (A[arrayLength - 1] > 0)
            for (int i = 0; i < arrayLength; i++) {
                if (A[i] > 0) {
                    if (A[i] == min) min = min + 1;
                    if (A[i] > min) break;
                }
            }
        return min;
    }

}
