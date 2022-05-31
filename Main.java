import java.io.IOException;
import java.util.Scanner;

class Main 
{
  public static Scanner scan = new Scanner(System.in);
  public static void main(String[]args)
  {
    while(true)
    {
    int tryb =0;
      tryb=menu();

      switch(tryb) 
      {
        case 1:
          {
            W1();
          break;
          }
         
        case 2:
          {
            W2();
            break;
          }
        case 0:
          {
            return;
          }
     
      }
      
      }

    }
  public static int menu()
  {
    int liczba =0;
    System.out.println();
     System.out.println("Wpisz 1 aby dodać nowego studenta");
      System.out.println("Wpisz 2 aby wypisać listę studentów");
    liczba =scan.nextInt();
return liczba;
  }
  public static void W1()
  {
    try
      {
        Service1 s = new Service1();
        String imie;
        int wiek;
        String data;
        scan.nextLine();
        System.out.println("Podaj imie:");
        imie =scan.nextLine();
        System.out.println("Podaj wiek:");
        wiek =scan.nextInt();System.out.println("Podaj datę urodzenia:");
        data =scan.nextLine();
        data =scan.nextLine();
        
        
        s.addStudent(new Student(imie,wiek,data));
        System.out.println("Dodano studenta");
        
      }
    catch(IOException e)
      {
        
      }
  }
  public static void W2()
  {
    try
      {
        System.out.println("Lista studentów:");
        Service1 s = new Service1();
         var students = s.getStudents();                    for (Student current : students) {            
           System.out.println(current.ToString());             }}
    catch(IOException e)
      {
        
      }
  }
}