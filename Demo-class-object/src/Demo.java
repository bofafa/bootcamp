import ClassWork1.Dress;

public class Demo {
  public static void main(String[] args) {

  
  
    //menmory
    int x =3;
    
    // arr -> object ref -> object aeddress 
    // int arrar object (length=2)
    int[] arr = new int[2];

    // c -> objeft ref -> cat object address
    // cat object in heap memory
    Cat cat = new Cat (); //
    //cat.name // not OK, because "name" is private
    // if need to get the cat name, need got to Cat and set public
    System.out.println(cat.getName());

    // if attribute is private, then you cannot read the attribute directly by object ref'
    // or example, cat.name and cat. color

    Cat cat2 = new Cat();//
    String name = "peter";
    cat2.setName(name);
    System.out.println("name:" + cat2.getName()    );

    String color = "BLACK";
    System.out.println("color:" + cat2.getColor());

    Integer age = 10;
    System.out.println("age" + cat2.getAge());

    Staff staff = new Staff(); // Staff() <----- constructor
    staff.setHeight(1.75); //175cm
    staff.setWeight(73.25);
    //getBMI() - > class encapsulates complicated behavior
    System.out.println(staff.getBMI());

    Staff staff2 = new Staff ("Jenny", "Chan", 1.65,60.2);
    System.out.println(staff2.getBMI());

    

    
   }
}
