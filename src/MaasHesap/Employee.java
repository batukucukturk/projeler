package MaasHesap;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }

    double tax() {
        if (this.salary > 1000) {
            return (this.salary * 0.03);
        }
        return 0;
    }

    double bonus() {

        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        }
        return 0;
    }

    double raiseSalary() {
        if (2021 - this.hireYear < 10) {
            return (this.salary * 0.05);
        }
        if (2021 - this.hireYear > 9 && 2021 - this.salary < 20) {
            return (this.salary * 0.1);
        }
        if (2021 - this.hireYear > 19) {
            return (this.salary * 0.15);
        }
        return 0;
    }

    void toStringg() {

        System.out.println("Adı :" + this.name);
        System.out.println("Maaşı :" + this.salary);
        System.out.println("Çalışma Saati :" + this.workHours);
        System.out.println("Başangıç Yılı :" + this.hireYear);
        System.out.println("Vergi:" + this.tax());
        System.out.println("Bonus:" + this.bonus());
        System.out.println("Maaş Artışı :" + this.raiseSalary());
        System.out.println("Vergi ve Bonuslar ile Birlikte Net Maaş :" + (this.salary + this.bonus() - this.tax()));
        System.out.println("Yeni Maaş :" + (this.salary + this.raiseSalary()));


    }
}
