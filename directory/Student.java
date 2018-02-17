public class Student{

  public static String name;
  public static int grade;
  public static String house;
  public static String subjects;
  public static String specie;

  public Student(String n, int g, String h, String s, String e){
    this.name = n;
    this.grade = g;
    this.house = h;
    this.subjects = s;
    this.specie = e;

  }

  public static void SayHi(){
    System.out.println("Hey, how's it going?");
  }

  public static String getName(){
    return name;
  }

  public static int getGrade(){
    return grade;
  }

  public static String getHouse(){
    return house;
  }

  public static String getSubjects(){
    return subjects;
  }

  public static String getSpecie(){
    return specie;
  }

  public static void setName(String n){
    name = n;
  }

  public static void setGrade(int g){
    grade = g;
  }

  public static void setHouse(String h){
    house = h;
  }

  public static void setSubjects(String s){
    subjects = s;
  }

  public static void setSpecie(String e){
    specie = e;
  }

}
