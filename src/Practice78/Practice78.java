package Practice78;

import java.util.*;


public class Practice78 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random r = new Random();

        int count_of_managers;
        int count_of_TopManagers;
        int count_of_operators;

        String[] names = new String[]{"Vernon", "Michael", "Matthew", "Piers", "Joseph"};
        String[] surnames = new String[]{"Lester", "Bryan", "Clark", "Stewart", "Collins"};

        Company company = new Company();

        System.out.println("Сколько менеджеров нанять: ");
        count_of_managers = in.nextInt();

        System.out.println("Сколько топ менеджеров нанять: ");
        count_of_TopManagers = in.nextInt();

        System.out.println("Сколько операторов нанять: ");
        count_of_operators = in.nextInt();


        for (int i = 0; i < count_of_operators; i++){
            Operator operator = new Operator(names[r.nextInt(5)],surnames[r.nextInt(5)]);
            company.hire(operator);
        }

        for (int i = 0; i < count_of_managers; i++){
            Manager manager = new Manager(names[r.nextInt(5)],surnames[r.nextInt(5)]);
            company.hire(manager);
        }

        ArrayList<Employee> topManagerList = new ArrayList<Employee>();
        for (int i = 0; i < count_of_TopManagers; i++){
           TopManager topManager = new TopManager(names[r.nextInt(5)], surnames[r.nextInt(5)]);
           company.hire(topManager);
        }
        company.hireAll(topManagerList);

        List<Employee> topSalary=company.getTopSalaryStaff(10);
        for(Employee obj: topSalary)
        {
            System.out.printf("%d Руб.\n",(int)obj.calcSalary());
        }

        List<Employee> lowerSalary=company.getLowestSalaryStaff(30);
        for(Employee obj: lowerSalary)
        {
            System.out.printf("%d Руб.\n",(int)obj.calcSalary());
        }
    }
}

class Employee {

    Random r = new Random();

    String name;
    String surname;
    String position;
    double baseSalary;
    double salary;
    EmployeePosition employeePosition;

    public double calcSalary()
    {
        return  employeePosition.calcSalary();
    }
}

interface EmployeePosition{
    String getJobTitle();
    double calcSalary();
}

class Manager extends Employee implements EmployeePosition{

    Manager(String name, String surname){
        this.name = name;
        this.surname = surname;
        this.baseSalary =  r.nextInt(10_000)+40_000;
    }

    @Override
    public String getJobTitle() {
        return "manager";
    }

    @Override
    public double calcSalary() {
        double salary;
        salary = baseSalary + 0.05*(r.nextInt(25000)+115000);

        return salary;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", position='" + getJobTitle() + '\'' +
                ", salary=" + calcSalary() +
                '}';
    }
}

class TopManager extends Employee implements EmployeePosition{

    public TopManager(String name,String surname){
        this.name=name;
        this.surname=surname;
        this.position="TopManager";
        this.baseSalary =  r.nextInt(20000)+150000;
    }

    @Override
    public String getJobTitle() {
        return "top manager";
    }

    @Override
    public double calcSalary() {
        Company income = new Company();
        if(income.getIncome()>10000000){
            salary = baseSalary + 1.5*baseSalary;
        }else salary = baseSalary;

        return salary;
    }

    @Override
    public String toString() {
        return "TopManager{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", position='" + getJobTitle() + '\'' +
                ", salary=" + calcSalary() +
                '}';
    }
}

class Operator extends Employee implements EmployeePosition{

    public Operator(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.salary =  r.nextInt(5_000)+25_000;
    }

    @Override
    public String getJobTitle() {
        return "operator";
    }

    @Override
    public double calcSalary() {
        salary = baseSalary;

        return salary;
    }

    @Override
    public String toString() {
        return "Operator{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", position='" + getJobTitle() + '\'' +
                ", salary=" + calcSalary() +
                '}';
    }
}

class Company {

    Random r = new Random();

    ArrayList<Employee> employees = new ArrayList<>();

    void hire(Employee object) {
        employees.add(object);
    }

    void hireAll(ArrayList<Employee> objects) {
        employees.addAll(objects);
    }

    void fire(Employee employee) {
        employees.remove(employee);
    }

    double getIncome() {
        double income;
        income = r.nextInt(4000000) + 8000000;

        return income;
    }





    public List<Employee> getTopSalaryStaff(int count) {
        if (count > 0 && count < employees.size()) {
            for (int i = 0; i < employees.size(); i++) {
                for (int j = 0; j < employees.size() - 1 - i; j++) {
                    if (employees.get(j).calcSalary() < employees.get(j + 1).calcSalary()) {
                        Employee t;
                        t = employees.get(j);
                        employees.set(j, employees.get(j + 1));
                        employees.set(j + 1, t);
                    }

                }
            }
        }
        List<Employee> topSalary = new ArrayList<Employee>();
        for (int i = 0; i < count; i++) {
            topSalary.add(employees.get(i));
        }
        return topSalary;
    }


    public List<Employee> getLowestSalaryStaff(int count)
    {
        if(count>0 && count<employees.size()) {
            for(int i=0;i<employees.size();i++)
            {
                for(int j=0;j<employees.size()-1-i;j++)
                {
                    if(employees.get(j).calcSalary()>employees.get(j+1).calcSalary())
                    {
                        Employee t;
                        t=employees.get(j);
                        employees.set(j,employees.get(j+1));
                        employees.set(j+1,t);
                    }

                }
            }
        }
        List<Employee> lowerSalary = new ArrayList<Employee>();
        for(int i=0;i<count;i++)
        {
            lowerSalary.add(employees.get(i));
        }
        return lowerSalary;
    }

}