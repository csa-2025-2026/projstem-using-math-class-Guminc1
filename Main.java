import java.util.Scanner;    // optional to use user input
 
public class Main
{
    public static void main(String[] args)
    {
        int TakeInNum;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter A Positive Int");
        TakeInNum = scan.nextInt();
        printRandom3(TakeInNum);

       System.out.println("Enter In x1 x2 y1 y2 To Find The Slope");
       System.out.println(calcSlope(scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt()));

        System.out.println("Enter In 2 Numbers To Find The Distance");
        System.out.println(roundedDist(scan.nextInt(),scan.nextInt()));

    }
    
    public static void printRandom3(int num)
    {
        System.out.println("Random Numbers");
        System.out.println((int)((Math.random()*num)+2));
        System.out.println((int)((Math.random()*num)+2));
        System.out.println((int)((Math.random()*num)+2));
    }
    
    public static double calcSlope(double x1, double x2, double y1, double y2)
    {
        double slope;
        slope = (y2-y1)/(x2-x1);
        System.out.print("Slope Is ");
        return slope;
    }
    
    public static int roundedDist(double a, double b)
    {
        double dist = Math.abs(a-b);
        int round = (int) (dist + 0.5);
         System.out.print("Distance Is ");
        return round;
    }
}
