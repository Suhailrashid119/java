 public class EmployeeTest
 {
   public static void main(String args[]) {
      Employee []staff = new Employee[3];

      staff[0] = new Employee("Fouzia", 200.3);
      staff[1] = new Employee("Faizan", 202.3);
      staff[2] = new Employee("Fahad", 201.3);

      for(Employee e: staff){
         System.out.println("Name  " + e.getName() +"  Salary  " + e.getSalary() + "\n");
      }
  }
   
}