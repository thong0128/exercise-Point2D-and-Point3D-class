public class Test {
    public static void main(String[] args) {
        Point2D p1 = new Point2D(26.6f, 11.4f);
        System.out.println(p1.getXY()[1]);
        System.out.println(p1);
        Point3D p2 = new Point3D(324.7f, 3243.6f, 12.6f);
        System.out.println(p2.getXYZ()[1]);
        System.out.println(p2);
    }
}
