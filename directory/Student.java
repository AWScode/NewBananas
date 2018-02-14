public class Student{

  public static String name;
  public static int grade;
  public static String tie color;
  public static String classes;
  public static String nationality;
  public static boolean dormstudent;

  public Student(String n, int g, String t, String c, String lity, boolean d){
    name = n;
    grade = g;
    tie color = t;
    classes = c;
    nationality = lity;
    dormstudent = d;

  }

  public static void SayHi(){
    System.out.println("Hey, how's it going?")
  }

  public static String getName(){
    return name;
  }

  public static int getGrade(){
    return grade;
  }

  public static String getTieColor(){
    return tie color;
  }

  public static String getClasses(){
    return classes;
  }

  public static String getNationality(){
    return nationality;
  }

  public static void setName(String n){
    name = n;
  }

  public static void setGrade(int g){
    grade = g;
  }

  public static void setTieColor(String t){
    tie color = t;
  }

  public static void setClasses(String c){
    classes = c;
  }

  public static void setNationality(String lity){
    nationality = lity;
  }

}
