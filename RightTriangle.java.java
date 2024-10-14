/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class RightTriangle {
    public static boolean isRightTriangle(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return false;
        }
        int x = Math.min(a, Math.min(b, c));
        int z = Math.max(a, Math.max(b, c));
        int y = a + b + c - x - z; // Middle value

        return (x * x + y * y) == (z * z);
    }

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java RightTriangle <side1> <side2> <side3>");
            return;
        }

        try {
            int side1 = Integer.parseInt(args[0]);
            int side2 = Integer.parseInt(args[1]);
            int side3 = Integer.parseInt(args[2]);

            if (isRightTriangle(side1, side2, side3)) {
                System.out.println("true");
            }
            else {
                System.out.println("false");
            }
        }
        catch (NumberFormatException e) {
            System.out.println("All inputs must be integers.");
        }
    }
}

