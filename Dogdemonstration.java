public class Dogdemonstration{

  public static String name;
  public static int age;
  public static String owner;

  public Dog(String n, int a, String o){
    name = n;
    age = a;
    owner = o;
  }

  public static void bark(){
    System.out.println("GAGAGA!!");
  }

  public static String getName(){ //this is a getter; starts with "get"
    return name;
  }

  public static int getAge(){
    return age;
  }

  public static String getOwner(){
    return owner;
  }

  public static void setName(String n){ //this is a setter; to be able to change variables
    //setters always have input whereas getters usually don't
    name = m;
  }

  public static void setAge(int a){
    age = a;
  }

  public static void setOwner(String o){
    owner = o;
  }


}
