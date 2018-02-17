import java.util.*;

public class directory{

  public static void main(String[] args) {
    System.out.println("\n ------------------ \n Welcome to the Private Institution of Sprezzatura \n ------------------ \n"); //system print out the welcome sign
    System.out.println("This is the student information center.");

    Student Luca = new Student("Luca", 9, "Lion", "Transfiguration, ElvishLanguages, WorldHistory, MagicalCreatures", "Human"); //Create all students; import all student information into directory
    Student Polaris = new Student("Polaris", 11, "Eagle", "WorldHistory, DarkArts, Transfiguration, Herbology", "Elf");
    Student Newt = new Student("Newt", 12, "Hummingbird", "Flying, Potions, MagicalCreatures, WorlHistory", "Halfbreed");
    Student Sage = new Student("Sage", 10, "Lion", "Transfiguration, Flying, Charms, WorldHistory", "Demon");
    Student Chris = new Student("Chris", 9, "Wolf", "Herbology, Charms, Potions, MagicalCreatures", "Wolverine");
    Subject Transfiguration = new Subject("Transfiguration", 20, "Mr. Harrington", true);
    Subject ElvishLanguages = new Subject("ElvishLanguages", 10, "Mr. Yue", false);
    Subject WorldHistory = new Subject("WorldHistory", 30, "Ms. William", true);
    Subject MagicalCreatures = new Subject("MagicalCreatures", 23, "Ms. Huffles", true);
    Subject Potions = new Subject("Potions", 15, "Mr. Dutch", true);
    Subject Charms = new Subject("Charms", 18, "Mr. Winfield", true);
    Subject Flying = new Subject("Flying", 20, "Mrs. Garfield", false);
    Subject DarkArts = new Subject("DarkArts", 35, "Mr. Moonshine", false);
    Subject Herbology = new Subject("Herbology", 25, "Mr. Snape", false);

    System.out.println("Here is a list of our currently enrolled students:");

    ArrayList<Student> listOfStudents = new ArrayList<Student>(); //arraylist for all students
    listOfStudents.add(Luca);
    listOfStudents.add(Polaris);
    listOfStudents.add(Newt);
    listOfStudents.add(Sage);
    listOfStudents.add(Chris);

    for (int i = 0; i < listOfStudents.size(); i++) { //print out all terms in the arraylist, in this case all the students
      System.out.println(listOfStudents.get(i).getName());
    }

    System.out.println("Now, which of these students do you want to know more about?");
    Scanner an = new Scanner(System.in);//scan user's input
    String answer = an.next();

    Boolean found = false;
    Student theStudent = new Student("Test", 0, "Testt", "Testtt", "Testttt");//create a "fake" student to test the input
    for (int i = 0; i < listOfStudents.size(); i++) {//go through the list to see if the input is valid
      if (answer.equals(listOfStudents.get(i).getName())) {
        System.out.println("Which aspect of " + answer + " would you like to know more about?");
        System.out.println("Name, grade, house, subjects or specie?");
        found = true;
        theStudent = listOfStudents.get(i);
        break;
      }
    }

    if (!found) {//if the input doesn't match any of the name
      System.out.println("This student is not enrolled in Sprezzatura.");
    }
    else {
      Scanner an2 = new Scanner(System.in);
      String answer2 =  an2.next();
      if (answer2.equals("name") ||answer2.equals("Name")) {
        System.out.println(theStudent.getName() + " \'s name is " + theStudent.getName());
      }
      else if (answer2.equals("grade")) {
        System.out.println(theStudent.getName() + " is in " + theStudent.getGrade() + "th grade");
      }
      else if (answer2.equals("house")) {
        System.out.println(theStudent.getName() + " is in the " + theStudent.getHouse() + " house");
      }
      else if (answer2.equals("subjects")) {
        System.out.println(theStudent.getName() + " is currently studying " + theStudent.getClass());
      }

      else if (answer2.equals("specie")) {
          System.out.println(theStudent.getName() + " is a " + theStudent.getSpecie());
      }
      else System.out.println("This is not an aspect that I have information on."); //if the user asked about an aspect that is not listed
    }

    ArrayList<Subject> listOfSubjects = new ArrayList<Subject>();
    listOfSubjects.add(Transfiguration);
    listOfSubjects.add(WorldHistory);
    listOfSubjects.add(Flying);
    listOfSubjects.add(Potions);
    listOfSubjects.add(Herbology);
    listOfSubjects.add(MagicalCreatures);
    listOfSubjects.add(Charms);
    listOfSubjects.add(DarkArts);
    listOfSubjects.add(ElvishLanguages);


    System.out.println("Now, are you interested in gaining more information on these subjects?(yes or no)");
    Scanner an3 = new Scanner(System.in);
    String answer3 = an3.next();
    if (answer3.equals("yes")){
      System.out.println("Which one do you want to know more about?");
      for (int i = 0; i < listOfSubjects.size(); i++) {
        System.out.println(listOfSubjects.get(i).getSubjectz());
      }

      Scanner an4 = new Scanner(System.in);
      String answer4 = an4.next();

      Boolean found2 = false;
      Subject theSubject = new Subject("Test", 0, "Testt", true);
      for (int i = 0; i < listOfSubjects.size(); i++) {
        if (answer4.equals(listOfSubjects.get(i).getSubjectz())) {
          theSubject = listOfSubjects.get(i);
          System.out.println("Which aspect of " + answer4 + " would you like to know more about?");
          System.out.println("Size, professor or avaliability?");
          found2 = true;
          theSubject = listOfSubjects.get(i);
          break;
        }
      }

      if (!found2) {
        System.out.println("This subject is not taught at Sprezzatura.");
      }
      else {
        Scanner an5 = new Scanner(System.in);
        String answer5 = an5.next();
        if (answer5.equals("Size")||answer5.equals("size")) {
          System.out.println("The size of " + theSubject.getSubjectz() + " is" + theSubject.getSize());
        }
        else if (answer5.equals("professor")) {
          System.out.println("The professor of " + theSubject.getSubjectz() + " is" + theSubject.getProfessor());
        }
        else if (answer5.equals("avaliability")) {
          System.out.println("Is " + theSubject.getSubjectz() + " currently avaliable?" + "\n" + theSubject.getAvaliability());
        }
        else System.out.println("This is not an aspect that I have information on.");

      }

      System.out.println("Thank you for visiting Sprezzatura. Hope you found all the information that you needed");





  }

}
}
