import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
class RegistrationForm{
    RegistrationForm(){
    Frame f=new Frame("Registration Form");
    //labels
    Label l1=new Label("Name:");//textfeild
    Label l2=new Label("Branch:");//choice
    Label l3=new Label("Language:");//list
    Label l4=new Label("Address:");//textarea
    l1.setBounds(30,45,80,40);
    l2.setBounds(30,75,80,40);
    l3.setBounds(30,102,80,40);
    l4.setBounds(30,129,80,40);
    
    f.add(l1);
    f.add(l2);
    f.add(l3);
    f.add(l4);

//textfield
TextField tn=new TextField();
tn.setBounds(120, 45, 100, 25);
f.add(tn);

//choice
Choice bc=new Choice();
bc.add("CSE");
bc.add("CSM");
bc.add("CSD");
bc.add("IT");
bc.add("EEE");
bc.add("ECE");
bc.setBounds(120, 75, 100, 25);
f.add(bc);

//list
List ll=new List(4);
ll.add("c");
ll.add("c++");
ll.add("python");
ll.add("java");
ll.setBounds(120, 102, 100, 25);
f.add(ll);

//textarea
TextArea ta=new TextArea();
ta.setBounds(120, 129, 100, 50);
f.add(ta);

//button
Button cb=new Button("cancel");
cb.setBounds(75, 230, 100, 30);
f.add(cb);
Button cs=new Button("submit");
cs.setBounds(200, 230, 100, 30);
f.add(cs);

//checkbox
Checkbox c=new Checkbox("As per my knowlege",true);
c.setBounds(75, 200, 200, 25);
f.add(c);

    f.setSize(400,400);
    f.setLayout(null);
    f.setVisible(true);

    //closing window
    f.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent we){
            System.exit(0);
        }
    });
}
    public static void main(String[] args) {
        RegistrationForm obj=new RegistrationForm();
    }

  
}