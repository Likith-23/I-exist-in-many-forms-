abstract class Shape{
    abstract void Area();
    abstract void ShowShape();
    public void msg(){
        System.out.println("This is an abstract class");
    }
}

class Cube extends Shape{
    public void Area(){
        System.out.println("6 * a^2 = "+ 6 * 6 * 6);
    }
    public void ShowShape(){
        System.out.println("This is a cube!");
    }
}

class Sphere extends Shape{
    public void Area(){
        System.out.println("4 * pi * r^2 = "+ 4 * 3.14 * 17);
    }
    public void ShowShape(){
        System.out.println("This is a sphere!");
    }
}

class Prism extends Shape{
    public void Area(){
        System.out.println("2 * b + ph = "+ 2*7 + 5*8);
    }
    public void ShowShape(){
        System.out.println("This is a prism!");
    }
}

class Cuboid extends Shape{
    public void Area(){
        System.out.println("2 * (lb + bh + lh) = "+ 2 * (7*2  + 2*4 + 4*7));
    }
    public void ShowShape(){
        System.out.println("This is a cuboid!");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Shape c = new Cube();
        Shape cu = new Cuboid();
        Shape p = new Prism();
        Shape sh = new Sphere();

        c.ShowShape();
        c.Area();
        cu.ShowShape();
        cu.Area();
        p.ShowShape();
        p.Area();
        sh.ShowShape();
        sh.Area();
    }
}
