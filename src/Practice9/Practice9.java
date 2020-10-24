package Practice9;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;


public class Practice9 {
    public static void main(String[] args) {
        Company company = new Company();
        Random random = new Random();
        Calendar calendar = new GregorianCalendar();

        String[] names = new String[]{"Vernon", "Michael", "Matthew", "Piers", "Joseph"};
        String[] surnames = new String[]{"Lester", "Bryan", "Clark", "Stewart", "Collins"};


        for(int i=0; i<10; i++){
            calendar.set(Calendar.YEAR, random.nextInt(10) + 1970);
            calendar.set(Calendar.MONTH, random.nextInt(12));
            calendar.set(Calendar.DAY_OF_MONTH, random.nextInt(28));
            //Date date = calendar.getTime();
            DateFormat dateFormat = new SimpleDateFormat("dd MMM yyy GG");
            dateFormat.format(calendar.getTime());

            Employee employee = new Employee(names[random.nextInt(5)], surnames[random.nextInt(5)],
                    dateFormat, "dsdsd", "790393939393", 232);
            company.hire(employee);
            System.out.println(employee.toString());
        }

    }
}

interface EmployeeHandler{
    boolean handleEmployee(Employee employee);
}

interface HandlerName {
    void handleEmployee(Employee employee);
}

class Employee{
    private String name;
    private String surname;
    private DateFormat birthday;
    private String address;
    private String phone_number;
    private int salary;

    public Employee(String name, String surname, DateFormat birthday, String address, String phone_number, int salary) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.address = address;
        this.phone_number = phone_number;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getSurname(){
        return surname;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }

    public DateFormat getBirthday(){
        return birthday;
    }
    public void setBirthday(DateFormat birthday){
        this.birthday = birthday;
    }

    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }

    public String getPhone_number(){
        return phone_number;
    }
    public void setPhone_number(String phone_number){
        this.phone_number = phone_number;
    }

    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "{ name: " + name + "\n" +
                "surname: " + surname + "\n" +
                "birthdate: "  + birthday+  "\n" +
                "address: " + address + "\n" +
                "phone_number: " + phone_number + "\n" +
                "salary: " + salary + " }"+"\n"+
                "--------------------------"+ "\n";
    }
}

class Company{
    private ArrayList<Employee> employees = new ArrayList<>();

    public void hire(Employee employee){
        employees.add(employee);
    }
    public void hireAll(ArrayList<Employee> employees){

    }

    public void fire(Employee employee){
        employees.remove(employee);
    }

    public void fireAll(ArrayList<Employee> employees){
        //employees.removeAll();
    }


}
