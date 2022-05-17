import java.io.IOException;
import java.util.Scanner;

class Main {
  
  public static void main(String[] args) {
    try {
      Scanner scan = new Scanner(System.in);
      System.out.println("Wpisz 1 aby dodać nowego studenta");
      System.out.println("Wpisz 2 aby wypisać listę studentów");
        int liczba = scan.nextInt();

      switch(liczba)
      {
        case 1:
          
          break;
        case 2:
          
          break;
        default:
    
      
      Service1 s = new Service1();
      s.addStudent(new Student("Krzysztof", 20));
      s.addStudent(new Student("Janusz", 40));

      var students = s.getStudents();
      for(Student current : students) {
        System.out.println(current.ToString());
      }}
    } catch (IOException e) {

    }
  }
}