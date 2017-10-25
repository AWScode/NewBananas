import java.util.*;

public class ShoppingSpree {

  int budget;
  String name;
  ArrayList<String> bags;

  public ShoppingSpree(int money) {
    budget = money;
    bags = new ArrayList<String>();
    name = "Julia :D";
  }

  public int getMoney() {
    return budget;
  }

  public void getBags() {
    System.out.print("Currently in your bag: ");
    for (int i = 0; i < bags.size(); i++) {
      System.out.print(bags.get(i) + ",");
    }
    System.out.println(" whoops that's all you got.");
  }

  public void Mcdonalds() {
    bags.add("Mcdonalds");
    budget = budget - 20;
  }

  public void Abercrombie(){
    System.out.println("What kind?");
    Scanner choice = new Scanner(system.in);
    String kind = choice.nextline();

    if (kind.equals("sweatshirt")) {
        bags.add("sweatshirt");
        budget = budget - 50;
    }
    else if (kind.equals("shorts")) {
      bags.add("shorts");
      budget = budget - 35;
    }
    else if (kind.equals("t-shirt")) {
      bags.add("t-shirt");
      budget = budget - 40;
    }
  }

  public void Dogs(){
    System.out.println("What dog?");
    Scanner choice = new Scanner(system.in);
    String dogkind = choice.nextline();

    if (dogkind.equals("corgi")) {
        bags.add("corgi");
        budget = budget - 100;
    }
    else if (dogkind.equals("golden retriever")) {
      bags.add("golden retriever");
      budget = budget - 150;
    }
  }


}
