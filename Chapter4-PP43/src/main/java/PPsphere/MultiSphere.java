package PPsphere;

public class MultiSphere {

    public static void main(String[] args) {
        Sphere s1 = new Sphere(4.75);
        Sphere s2 = new Sphere(9.25);
        Sphere s3 = new Sphere(11.13);
        
        System.out.println("Sphere 1's diamter = " + s1.getDiameter());
        System.out.println("Settings up Sphere 2's diameter");
        s2.setDiameter(17.19);
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }

}
