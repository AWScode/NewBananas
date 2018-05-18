import java.awt.event.*;
import java.awt.*;

public class Restaurant extends Frame{

  //create all the components
  private TextField tf;
  private Button b;
  private Button b2;
  private Frame f2;
  private Label menu;
  private Label price;
  private TextArea name;
  private Label namee;
  private Choice num;
  private Label numm;
  private Choice food;
  private Choice amo;
  private Label foodd;
  private Label amoo;
  private Choice met;
  private Label mett;
  private Button b3;
  private TextField tf2;
  private TextField tf3;
  private TextArea tip;
  private Label tipp;
  private Button fin;
  private Label tot;
  private TextField tott;


  public Restaurant() {

//set mainframe
    setSize(500,400);
    setLayout(null);
    setVisible(true);
    setBackground(new Color(40,50,80));

    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent windowEvent){
        System.exit(0);
      }
    });

    tf = new TextField("Hola! Bienvenido a Hulianos! R U READY TO EAT?!");
    tf.setBounds(60, 60, 400, 60);
    add(tf);

    b = new Button("Ready!");
    b.setBounds(70, 350, 100, 30);
    add(b);
    b.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e2){
        f2.setVisible(true); {
        }
      }
    });
    b.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
        tf3.setText("Welcome " + name.getText() + " ! Party of " + num.getSelectedItem());
      }
    });

    b2 = new Button("No thanks");
    b2.setBounds(250, 350, 100, 30);
    add(b2);
    b2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e2){
        setVisible(false); {
        }
      }
    });

    f2 = new Frame();
    f2.setSize(700,700);
    f2.setLayout(null);
    f2.setVisible(false);
    f2.setBackground(new Color(30,60,80));
    f2.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent windowEvent){
        System.exit(0);
      }
    });

    menu = new Label("Best Menu In the World");
    menu.setBounds(40, 30, 200, 30);
    f2.add(menu);

    price = new Label("Everything for just 8 dollars!");
    price.setBounds(40, 50, 200, 30);
    f2.add(price);

    name = new TextArea("");
    name.setBounds(80, 200, 100, 40);
    add(name);

    namee = new Label("your name:");
    namee.setBounds(10, 200, 100, 50);
    add(namee);

    num = new Choice();
    num.setBounds(100, 240, 60, 50);
    num.add("--");
    num.add("1");
    num.add("2");
    num.add("3");
    num.add("4");
    num.add("5");
    add(num);

    numm = new Label("# of people:");
    numm.setBounds(10, 240, 120, 50);
    add(numm);

    food = new Choice();
    food.setBounds(125, 350, 100, 50);
    food.add("1(spaghetti)");
    food.add("2(salad)");
    food.add("3(pizza)");
    food.add("4(soup)");
    f2.add(food);

    amo = new Choice();
    amo.setBounds(120, 400, 60, 50);
    amo.add("1");
    amo.add("2");
    amo.add("3");
    amo.add("4");
    amo.add("5");
    f2.add(amo);

    foodd = new Label("what do you want?");
    foodd.setBounds(15, 350, 125, 40);
    f2.add(foodd);

    amoo = new Label("# of orders?");
    amoo.setBounds(30, 400, 100, 40);
    f2.add(amoo);

    met = new Choice();
    met.setBounds(120, 450, 100, 50);
    met.add("credit");
    met.add("debit");
    met.add("cash");
    f2.add(met);

    mett = new Label("payment method:");
    mett.setBounds(15, 450, 125, 40);
    f2.add(mett);

    tf2 = new TextField("");
    tf2.setBounds(120, 500, 350, 40);
    f2.add(tf2);


    b3 = new Button("yep!");
    b3.setBounds(30, 500, 60, 40);
    f2.add(b3);
    b3.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ev){
        tf2.setText(amo.getSelectedItem() + " order of " + food.getSelectedItem() + ", paying with " + met.getSelectedItem() + "!");
      }
    });

    tf3 = new TextField("");
    tf3.setBounds(300, 50, 200, 40);
    f2.add(tf3);

    tip = new TextArea("");
    tip.setBounds(350, 120, 100, 40);
    f2.add(tip);

    tipp = new Label("tips?($)");
    tipp.setBounds(300, 120, 80, 30);
    f2.add(tipp);

    fin = new Button("ok!");
    fin.setBounds(500, 120, 50, 30);
    f2.add(fin);
    fin.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ev){
        tf2.setText("Your total would be (" + amo.getSelectedItem() + "* 8 + " + tip.getText() + ") dollars!");
      }
    });

  }//close Restaurant

  public void addList() {
    List l = new List(4);
    l.setBounds(50, 100, 200, 220);
    l.add("1. Spaghetti");
    l.add("2. Fresh Tomato salad");
    l.add("3. Pizza");
    l.add("4. Tomato soup");
    f2.add(l);
  }

  public static void main(String[] args) {
    Restaurant m = new Restaurant();
    m.addList();
  }//close main
}//close whole thing
