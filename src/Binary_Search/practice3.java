package Binary_Search;

public class practice3 {
    public static void main(String[] args) {
        int n = 2147395600;
        int ans = findSqaureRoot(n);
        int result = floorSqrt(2147395600);
        System.out.println(result);
        System.out.println(ans);


    }
    static int findSqaureRoot(int n) {
        int i = 2;
        while (i * i <= n) {
            i++;

        }
        return i-1;
    }

    static int floorSqrt(int n) {
        // code here
        int i = 2;
        while ((i * i) <= n) {
            if (n % i != 0){
                i++;
            }
            else {
                return i;
            }

        }
        return i-1;
    }
}
