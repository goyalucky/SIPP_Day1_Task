import java.util.*;
public class Volume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int h = sc.nextInt();
        double vol = Math.PI * (r * r) * h;
        System.out.println("Volume of Cylinder is: " + vol);
    }
}
