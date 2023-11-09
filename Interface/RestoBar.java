package MultilevelInheritance.Interface;
// Defined an interface for a RestoBar
interface RestoBar {
    void price();
    int monacoprice = 9000;
    int Camelliaprice= 10500;   
    static int affordablePrice(int price, int slices) {
        return price * slices;
    }
}

class A implements RestoBar {
    public void price() {
        System.out.println("Monaco cafe pizza");
    }
}

class B extends A {
    public void Monacopizza() {
        System.out.println("The pizza affordable slice price at Monaco");
    }
}

class C implements RestoBar {
    public void price() {
        System.out.println("Camellia pizza");
    }
}

class D extends C {
    public void Camelliapizza() {
        System.out.println("The pizza affordable slice price at Camellia");
    }
}

class TestInheritance2 {
    public static void main(String args[]) {
        
        // Create instances of RestoBar classes
        RestoBar menu = new A();
        RestoBar menu2 = new C();

        menu.price();
        // we create an instance of class B to access Monacopizza() method
        B menuB = new B();
        menuB.Monacopizza();
        System.out.println("Monaco's pizza price: " + RestoBar.monacoprice);
        System.out.println("Affordable Price for 2 Slices: " + RestoBar.affordablePrice(RestoBar.monacoprice, 2));

        System.out.println("****************************");

        menu2.price();
        // we create an instance of class C to access Camelliapizza() method
        C menuC = new C();

        System.out.println("Camellia's pizza price: " + RestoBar.Camelliaprice);
        System.out.println("Affordable Price for 2 Slices: " + RestoBar.affordablePrice(RestoBar.Camelliaprice, 2));

    }
}
