import java.util.Scanner;

public class Triangle{

    public static void main(String[] args) {
        
        // Scanner inp = new Scanner(System.in);
        // System.out.println("Enter height of triangle here: ");

        // int num = inp.nextInt();
        System.out.println(createTriangle(8));
    }

    // creating an aligned triangle
    public static String createTriangle(int num) {

        StringBuilder triangle = new StringBuilder();
        for (int i = 1; i <= num; i++) {
            String line = stringMultiply(" ", num-i) + stringMultiply("*", i)+"\n";
            triangle.append(line);
          }
        return triangle.toString();
    }

    // string multiplication    
    public static String stringMultiply(String s, int n) {
        StringBuilder stringBuilder = new StringBuilder(); 
            for (int i =0; i<n; i++) {
                stringBuilder.append(s);
            }
        return stringBuilder.toString();
    }
}