interface IEmployee{
    public void salary();
    public void calc();

}


interface IManager{
  public void salary();
  public void calc();
  public String getDepartment();
}

interface IDeveloper{
  public void show();
  public void displayDeveloperInfo();
}

interface IHR{
  public void showHrInfo();
}
class Employee implements IEmployee , IDeveloper ,IHR{
  private int salary;
  private int id;
  private String name;

  Employee(int id , int salary , String name){
    this.salary = salary;
    this.id = id;
    this.name = name;

  }

  @Override
  public void salary() {
    System.out.println("THis is Salary Method");
  }

  @Override
  public void calc() {
   System.out.println("This is Calc Method");
  }

  public int getId(){
    return this.id;
  }

  public int getSalary(){
    return this.salary;
  }

  public String getName(){
    return this.name;
  }

  public void setId(int id){
    this.id = id;
  }
  public void setSalary(int salary){
    this.salary = salary;
  }
  public void setName(String name){
    this.name = name;
  }

  @Override
  public void show() {
    System.out.println("This is the Show Method inside Employee");
  }

  @Override
  public void displayDeveloperInfo() {
    System.out.println("This is Display Inside the Employee");
  }

  @Override
  public void showHrInfo() {
    System.out.println("THis is Hrs Info");
  }



}

class Developer{
  String programmingLanguage;
  IDeveloper employee;

  Developer(IDeveloper employee){
    this.employee = employee;
  }

   void printInfo(){
    this.employee.displayDeveloperInfo();;
  
   }


  

}


class Manager extends Employee implements IManager{
  String department;

  Manager(int id , int salary  ,String name , String department){
    super(id, salary, name);
    this.department = department;
  }

  @Override
  public String getDepartment() {
    System.out.println("This is Get Department Method in the Manager Class");
    return this.department;
  }
}


class HR{
  IHR employee;
  HR(IHR employee){
    this.employee = employee;
  }

  public void showHrInformation(){
    this.employee.showHrInfo();
  }
}

public class Interface {
   
public static void main(String[] args) {
  int d = 500;
  // Manager m = new Manager(1, 10000, "Yash", "Development");
  Employee e = new Employee(1, d, "Yash");
  Developer dev = new Developer(e);
  dev.printInfo();
  HR h = new HR(e);
  h.showHrInformation();
  


}
} 