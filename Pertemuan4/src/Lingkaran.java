
public class Lingkaran extends BangunDatar {
    private double radius;
    private static double PI = 3.14;

    public Lingkaran() {
        setJumSisi(0);
        setWarna("Merah");
        setBorder("Bold");
        this.radius = 0;
    }

    public Lingkaran(double radius, int sisi, String warna, String border) {
        super(sisi, warna, border);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getLuasLingkaran() {
        return PI * (radius * radius);
    }

    public double getKelilingLingkaran() {
        return 2 * PI * radius;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Radius = " + getRadius());
        System.out.println("Diameter = " + getDiameter());
        System.out.println("Luas = " + getLuasLingkaran());
        System.out.println("Keliling = " + getKelilingLingkaran());
    }
}
