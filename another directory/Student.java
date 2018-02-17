public class Student{

  public String name;
  public int grade;
  public String house;
  public String classes;
  public String specie;

  public Student(String n, int g, String h, String k, String e){
    this.name = n;
    this.grade = g;
    this.house = h;
    this.classes = k;
    this.specie = e;

  }

  public String getName(){
    return name;
  }

  public int getGrade(){
    return grade;
  }

  public String getHouse(){
    return house;
  }

  public String getClasses(){
    return classes;
  }

  public String getSpecie(){
    return specie;
  }


  public void setName(String n){
    name = n;
  }

  public void setGrade(int g){
    grade = g;
  }

  public void setHouse(String h){
    house = h;
  }

  public void setClasses(String k){
    classes = k;
  }

  public void setSpecie(String e){
    specie = e;
  }


}
