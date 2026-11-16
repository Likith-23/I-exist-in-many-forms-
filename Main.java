class Hillstations{
    void location(){
        System.out.println("Located in: ");
    }
    void famousfor(){
        System.out.println("Famous for: ");
    }
}

class Manali extends Hillstations{
    void location(){
        System.out.println("Manali is located in UP");
    }
    void famousfor(){
        System.out.println("It is famous for its temples");
    }
}

class Mussoori extends Hillstations{
    void location(){
        System.out.println("Manali is located in Uttrakand");
    }
    void famousfor(){
        System.out.println("It is famous for its educational institutes");
    }
}

class Gulmer extends Hillstations{
    void location(){
        System.out.println("Manali is located in J&K");
    }
    void famousfor(){
        System.out.println("It is famous for skiing");
    }
}

public class Main {
    public static void main(String[] args) {
        Hillstations h = new Hillstations();
        Hillstations m = new Manali();
        Hillstations mu = new Mussoori();
        Hillstations g = new Gulmer();

        h.location();
        h.famousfor();
        
        m.location();
        m.famousfor();

        mu.location();
        mu.famousfor();

        g.location();
        g.famousfor();
    }
}
