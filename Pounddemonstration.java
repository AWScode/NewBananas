public class Pounddemonstration{

  public static void main(String[] args) {
    System.out.println("Heyy welcome to the POUND!");
    System.out.println("Here are some cool dogs you can bring home!");

    Dog fido = new Dog("Fido", 5, "Mr. Burns");

    Dog sup = new Dog("Sup", 11, "Mr. Considine");

    Dog cat = new Dog("Actually a periodic table", 20, "Mr. Sidman");

    System.out.println("Here's one now:");

    sup.bark();
    String newName = sup.getName();

  }
}
