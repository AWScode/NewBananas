public class Subjects{

  public static String subjectss;
  public static int sizes;
  public static String professor;
  public static Boolean avaliability;

  public Subjects(String k, int z, String p, Boolean v){
    this.subjectss = k;
    this.sizes = z;
    this.professor = p;
    this.avaliability = v;

  }

  public static void SayHi(){
    System.out.println("Hey, how's it going?");
  }

  public static String getSubjectss(){
    return subjectss;
  }

  public static int getSizes(){
    return sizes;
  }

  public static String getProfessor(){
    return professor;
  }

  public static Boolean getAvaliability(){
    return avaliability;
  }

  public static void setSubjectss(String k){
    subjectss = k;
  }

  public static void setSizes(int z){
    sizes = z;
  }

  public static void setProfessor(String p){
    professor = p;
  }

  public static void setAvaliability(Boolean v){
    avaliability = v;
  }

}
