import java.util.*;

public class Directory{

  public static void main(String[] args) {
    System.out.println("Welcome to the Private Institution of Sprezzatura");
    System.out.println("This is the student information center.");

    Student luca = new Student("Luca", 9, "Lion", "Transfiguration, ElvishLanguages, WorldHistory, MagicalCreatures", "Human");
    Student polaris = new Student("Polaris", 11, "Eagle", "WorldHistory, DarkArts, Transfiguration, Herbology", "Elf");
    Student newt = new Student("Newt", 10, "Hummingbird", "Flying, Potions, MagicalCreatures, WorlHistory", "Halfbreed");
    Student sage = new Student("Sage", 12, "Lion", "Transfiguration, Flying, Charms, WorldHistory", "Wolverine");
    Student christopher = new Student("Christopher", 9, "Wolf", "Herbology, Charms, Potions, MagicalCreatures", "Demon");

    ArrayList<Student> listOfStudents = new ArrayList<Student>();
    listOfStudents.add(luca);
    listOfStudents.add(polaris);
    listOfStudents.add(newt);
    listOfStudents.add(sage);
    listOfStudents.add(christopher);

    System.out.println("Here is a list of our currently enrolled students:");

    for (int i = 0; i < listOfStudents.size(); i++) { //print out objects in the arraylist, which are the students.
      System.out.println(listOfStudents.get(i).getName());
    }

    System.out.println("Now, which of these students do you want to know more about?");
    Scanner Input = new Scanner(System.in);
    String decision = Input.next();

    Boolean found = false;
    Student theStudent = new Student("Test", 0, "Test00", "Test000", "TestO");
    for (int i = 0; i < listOfStudents.size(); i++) {
     if (decision.equals(listOfStudents.get(i).getName())) {
       System.out.println("Which aspect of " + decision + "would you like to know more about?");
       System.out.println("Grade, designated house, subjects or specie?");
       found = true;
       theStudent = listOfStudents.get(i);
       break;
     }
   }

   if (!found) {
     System.out.println("This student is not enrolled in Sprezzatura.");
   }
   else {
     Scanner an = new Scanner(System.in);
     String answer =  an.next();
     if (answer.equals("Grade")) {
       System.out.println(theStudent.getName() + "is in grade" + theStudent.getGrade());
     }
     if (answer.equals("designated house")) {
       System.out.println(theStudent.getName() + "is in the" + theStudent.getHouse() + "house");
     }
     if (answer.equals("subjects")) {
       System.out.println(theStudent.getName() + "are currently studying" + theStudent.getSubjects());
     }
     if (answer.equals("specie")) {
       System.out.println(theStudent.getName() + "is a" + theStudent.getSpecie());
     }
    else System.out.println("This is not an aspect that I have information on.");

   }

   Subjects Transfiguration = new Subjects("Transfiguration", 20, "Mr. Harrington", true);
   Subjects WorldHistory = new Subjects("WorldHistory", 35, "Mr. Yue", true);
   Subjects Herbology = new Subjects("Herbology", 18, "Ms. William", false);
   Subjects MagicalCreatures = new Subjects("MagicalCreatures", 25, "Ms. Huffles", false);
   Subjects Flying = new Subjects("Flying", 15, "Mr. Dutch", false);
   Subjects Charms = new Subjects("Charms", 30, "Mr. Winfield", true);
   Subjects Potions = new Subjects("Potions", 20, "Mrs. Garfield", true);
   Subjects ElvishLanguages = new Subjects("ElvishLanguages", 17, "Mr. Moonshine", false);
   Subjects DarkArts = new Subjects("DarkArts", 25, "Mr. Sanpe", true);

   ArrayList<Subjects> listOfSubjects = new ArrayList<Subjects>();
    listOfSubjects.add(Transfiguration);
    listOfSubjects.add(WorldHistory);
    listOfSubjects.add(Herbology);
    listOfSubjects.add(MagicalCreatures);
    listOfSubjects.add(Flying);
    listOfSubjects.add(Charms);
    listOfSubjects.add(Potions);
    listOfSubjects.add(ElvishLanguages);
    listOfSubjects.add(DarkArts);

    System.out.println("Here are the list of subjects that are taught at Sprezzatura:");
    for (int i = 0; i < listOfSubjects.size(); i++) {
        System.out.println(listOfSubjects.get(i).getSubjectss());
      }

        System.out.println("Which one do you want to know more about?");
        Scanner an3 = new Scanner(System.in);
        String answer3 =  an3.next();

        Boolean found2 = false;
        Subjects theSubject = new Subjects("Test", 0, "TestO", true);
        for (int i = 0; i < listOfSubjects.size(); i++) {
        if (answer3.equals(listOfSubjects.get(i).getSubjectss())) {
          System.out.println("Which aspect of " + answer3 + "would you like to know more about?");
          System.out.println("Size, professor or current avaliability?");
          found = true;
          theSubject = listOfSubjects.get(i);
          break;
        }
      }

      if (!found) {
        System.out.println("This subject is not taught at Sprezzatura.");
      }

      else {
          Scanner an4 = new Scanner(System.in);
          String answer4 =  an4.next();
          if (answer4.equals("Size")){
            System.out.println("The size of" + theSubject.getSubjectss() + "is" + theSubject.getSizes());
          }
          if (answer4.equals("professor")){
            System.out.println("The professor of" + theSubject.getSubjectss() + "is" + theSubject.getProfessor());
          }
          if (answer4.equals("current avaliability")){
            System.out.println("Is" + theSubject.getSubjectss() + "currently avaliable?" + "\n" + theSubject.getAvaliability());
          }
        else System.out.println("This is not an aspect that I have information on.");

      }




  }
}
