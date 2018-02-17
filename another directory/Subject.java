public class Subject{

  public String subjectz;
  public int size;
  public String professor;
  public boolean avaliability;

  public Subject(String z, int s, String p, boolean v){
    this.subjectz = z;
    this.size = s;
    this.professor = p;
    this.avaliability = v;
  }

  public String getSubjectz(){
    return subjectz;
  }

  public int getSize(){
    return size;
  }

  public String getProfessor(){
    return professor;
  }

  public boolean getAvaliability(){
    return avaliability;
  }


  public void setSubjectz(String z){
    subjectz = z;
  }

  public void setSize(int s){
    size = s;
  }

  public void setProfessor(String p){
    professor = p;
  }

  public void setAvaliability(boolean v){
    avaliability = v;
  }

}
