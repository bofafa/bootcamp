import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExciser {
  public static void main(String[] args) {

    /// 1.
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    // Output: [100, 64, 36, 16 ,4]
    List<Integer> evennumbers = numbers.stream()
        .filter(e -> e % 2 == 0)//
        .map(e -> e * e)
        .sorted((a, b) -> b.compareTo(a))
        .collect(Collectors.toList()); // .collect is return type

    System.out.println(evennumbers); // [100, 64, 36, 16, 4]

    /// 2.
    List<String> names = Arrays.asList("Alice", "Alex", "Bob", "David", "Annie");
    List<String> namelist = names.stream()
        .filter(n -> n.startsWith("A"))
        .collect(Collectors.toList());

    System.out.println(namelist); // Alice, Alex, Annie]

    /// 3.
    List<Integer> numbers3 = Arrays.asList(10, 20, 5, 30, 15);
    int maxNumber = numbers3.stream().max((a, b) -> a.compareTo(b)).get();
    System.out.println("The maximum number is: " + maxNumber); // The maximum number is: 30

    int minNumber = numbers3.stream().min((a, b) -> a.compareTo(b)).get();
    System.out.println("The min number is: " + minNumber); // The min number is: 5

    /// 4.
    List<String> words = Arrays.asList("apple", "banana", "pear");
    List<Integer> words4 = words.stream()
        .map(n -> n.length())
        .collect(Collectors.toList());

    System.out.println(words4); // [5, 6, 4]

    /// 5. //count must use Long for Type
    List<String> words5 = Arrays.asList("hi", "hello", "world", "java", "stream");
    Long words6 = words.stream() // count need to use long
        .filter(n -> n.length() > 3)
        .count();

    System.out.println("total strings longer than 3 index: " + words6); // total strings longer than 3 index: 3

    /// 6.
    List<Integer> numbers6 = Arrays.asList(5, 10, 15, 20, 10, 5);
    Set<Integer> largerthan10 = numbers6.stream()
        .filter(n -> n > 10)
        .collect(Collectors.toSet());

    System.out.println(largerthan10); // [20, 15]

    /// 7.
    List<Student> student = Arrays.asList(new Student("Alice", 85), new Student("Bob", 75));
    Map<String, Integer> studentscore = student.stream()//
        .collect(Collectors.toMap(e -> e.getName(), e -> e.getSore()));

    System.out.println(studentscore); // {Bob=75, Alice=85}

    /// 8.
    List<Employee> employee = Arrays.asList(new Employee("John", 65000),
        new Employee("jean", 55000), new Employee("Doe", 40000));
    List<String> employeelessthan50000 = employee.stream()
        .filter(e -> e.getSalary() > 50000)
        .map(e -> e.getName())
        .collect(Collectors.toList()); // [John, jean]

    System.out.println(employeelessthan50000);

    /// 9.
    List<Person1> person = Arrays.asList(new Person1(30, "Alex"),
        new Person1(25, "bob"), new Person1(30, "Chalie"));
    Map<Integer, List<String>> personMap = person.stream()
        .collect(Collectors.groupingBy(e -> e.getAge(), //
            Collectors.mapping(e -> e.getName(), Collectors.toList())));

    System.out.println(personMap);//{25=[bob], 30=[Alex, Chalie]}

    /// 10.
    List<Person1> person2 = Arrays.asList(new Person1("Alice", "Female"),
        new Person1("Bob", "Male"), new Person1("Charlie", "Male"));

    Map<Boolean, List<String>> personMap2 = person2.stream()
        // .filter(e->e.getGender().equals("Male")) // if only male group sys out
        .collect(Collectors.groupingBy(e -> e.getGender().equals("Male"),
            Collectors.mapping(e -> e.getName(), Collectors.toList())));

    System.out.println(personMap2); //{false=[Alice], true=[Bob, Charlie]}

    /// 11
    List<Integer> numbers11 = Arrays.asList(5, 15, 20, 7, 30);
    Integer sumnumber11 = numbers11.stream()
        .filter(e -> e > 10)
        .map(e -> e * 2)                                        // use map to calculate
        .collect(Collectors.summingInt(e->Integer.valueOf(e))); // sum total //130

    System.out.println(sumnumber11);


    ///12
    List<String> name = Arrays.asList("Alice", "Bob", "Charlie");
    int defultAge = 30;

    List<Person> name11 = name.stream()  // steam new person Class
    .map(e -> new Person(defultAge,e)) // new person  in person class , make sure the constutor is right 
    .collect(Collectors.toList());

    System.out.println(name11); //[Person (name=Alice, age=30), Person (name=Bob, age=30), Person (name=Charlie, age=30)]


    ///13
    List<String> words13 = Arrays.asList("hello", "world", "java");
    
    Deque<String> wordup = words13.stream()
    .map(String::toUpperCase)
    .collect(Collectors.toCollection(LinkedList::new));

    System.out.println(wordup);

    



  }
}