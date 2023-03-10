public class MaasHesaplayici {
    public static void main(String[] args) {
        Employee e1 = new Employee("Kemal",2000,45,1985);
        e1.toPrint();
    }
}

class Employee{
    String name;
    int salary,workHours,hireYear;
    int a,b,c;
    Employee(String name,int salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    void tax(){
        if (this.salary < 1000){
            System.out.println("Vergi Uygulanmıyacaktır.");
        }else if(this.salary >= 1000){
            System.out.println("Vergi : " + (this.salary * 3) / 100);
        }
    }

    void bonus(){
        if (this.workHours >= 40){
            System.out.println("Bonus : " + (this.workHours - 40) *  30);
        }else if (this.workHours < 40){
            System.out.println("Ek Ücret Alamıyorsunuz");
        }
    }

    void raiseSalary(){
        int employeeYear = 2021 - hireYear;
        if (employeeYear < 10){
            System.out.println("Maaş Artışı : " + this.salary*0.05);
        }else if (employeeYear < 20 && employeeYear > 9){
            System.out.println("Maaş Artışı : " + this.salary*0.10);
        }else if (employeeYear > 19){
            System.out.println("Maaş Artışı : " + this.salary*0.15);
    }
  }

  void toPrint(){
      System.out.println("Adı : " + this.name);
      System.out.println("Maaşı : " + this.salary);
      System.out.println("Çalışma Saati : " + this.workHours);
      System.out.println("Başlangıç Yılı : " + this.hireYear);
      this.tax();
      this.bonus();
      this.raiseSalary();
      int bonus = (this.workHours - 40) * 30;
      int tax = (this.salary * 3) / 100;
      System.out.println("Vergi ve Bonuslar ile Birlikte Maaş : " + (this.salary - tax + bonus));
      totalSalary();

  }

  void totalSalary(){


      int employeeYear = 2021 - hireYear;
      if (employeeYear < 10){
          a = (int) (this.salary*0.05);
      }else if (employeeYear < 20 && employeeYear > 9){
          a = (int) (this.salary*0.10);
      }else if (employeeYear > 19){
          a = (int) (this.salary*0.15);
      }


      System.out.println("Toplam Maaş : " + (a + this.salary));

  }
}
