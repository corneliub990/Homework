import java.util.Scanner;

public class Homework {

    public static void main(String[] args) {
        RectangleAndHexagon();
        DistanceBetweenTwoPoints();
        ReverseString();
        OddNumbers();
        ConvertStringLowerCase();
        Palindrom();

    }

    public static void RectangleAndHexagon() {


        double width = 3.5;
        double height = 3.2;
        double s = 4; // length of a hexagonal side

        double rectanglePerimeter = 2 * (height + width);

        double rectangleArea = width * height;

        double hexagonPerimeter = s * 6; // assuming it's a regular hexagon

        double hexagonArea = ((3 * Math.sqrt(3) * (s * s)) / 2);

        System.out.printf("Rectangle Perimeter is 2*(%.1f + %.1f) = %.2f \n", height, width, rectanglePerimeter);

        System.out.printf("Rectangle Area is %.1f * %.1f = %.2f \n", width, height, rectangleArea);

        System.out.printf("Hexagon Perimeter is 2*(%.1f + %.1f) = %.2f \n", s, hexagonPerimeter);

        System.out.printf("Hexagon Area is 2*(%.1f + %.1f) = %.2f \n", s, hexagonArea);


    }


    public static double DistanceBetweenTwoPoints() {

        Scanner input = new Scanner(System.in);
        System.out.print("Input the latitude of coordinate 1: ");
        double lat1 = input.nextDouble();
        System.out.print("Input the longitude of coordinate 1: ");
        double lon1 = input.nextDouble();
        System.out.print("Input the latitude of coordinate 2: ");
        double lat2 = input.nextDouble();
        System.out.print("Input the longitude of coordinate 2: ");
        double lon2 = input.nextDouble();

        lat1 = Math.toRadians(lat1);
        lon1 = Math.toRadians(lon1);
        lat2 = Math.toRadians(lat2);
        lon2 = Math.toRadians(lon2);

        double earthRadius = 6371.01; //Kilometers

        return earthRadius * Math.acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2));

        System.out.print("The distance between those points is: " + DistanceBetweenTwoPoints(lat1, lat2, lon1, lon2) + " km\n");
    }


    public static void ReverseString() {
        System.out.println("Enter string to reverse:");

        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        String reverse = "";


        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        System.out.println("Reversed string is:");
        System.out.println(reverse);
    }

    public static void OddNumbers() {
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println("These are the following odd numbers from 1 to 99:" + i);
            }


        }
    }

    public static void ConvertStringLowerCase () {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a String: ");
        String line = in.nextLine();
        line = line.toLowerCase();
        System.out.println(line);
    }

    public static void Palindrom() {
        int result;
        int sum = 0;
        int temp;
        int n = 123454321;
        temp = n;

        while (n > 0) {
            result = n % 10;
            sum = (sum * 10) + result;
            n = n / 10;

        }

        if (temp == sum)
            System.out.println("palindrom number");
        else
            System.out.println("not palindrom");
    }
}

