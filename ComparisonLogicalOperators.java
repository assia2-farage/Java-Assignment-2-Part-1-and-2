public class ComparisonLogicalOperators {
    public static void main(String[] args) {
        
        //Part 2
        // Initialize variables
        int num1 = 4, num2 = 3, num3 = 12, num4 = 1;

        // Perform comparisons and logical operations
        boolean a = num1 > num2 || num3 < num4;  // true || false -> true
        boolean b = num1 < num2 && num3 > num4;  // false && true -> false
        boolean c = num1 == num2 || num3 >= num4; // false || true -> true
        boolean d = !(num1 < num3);  // !(true) -> false
        boolean e = num1 != num2 && num3 > num4; // true && true -> true
        boolean f = num1 <= num3 || num4 > num2; // true || false -> true

        // Output results
        System.out.println("4 > 3 || 12 < 1 is: " + a);
        System.out.println("4 < 3 && 12 > 1 is: " + b);
        System.out.println("4 == 3 || 12 >= 1 is: " + c);
        System.out.println("!(4 < 12) is: " + d);
        System.out.println("4 != 3 && 12 > 1 is: " + e);
        System.out.println("4 <= 12 || 1 > 3 is: " + f);
    }
}