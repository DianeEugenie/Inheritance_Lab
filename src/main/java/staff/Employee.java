package staff;


public abstract class Employee {

    private String name;
    private String niNumber;
    private double salary;

    public Employee(String name, String niNumber, double salary){
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNiNumber() {
        return niNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double raise){
        if (raise >= 0) {
            this.salary += raise;
        }
    }

    public double payBonus(){
        return this.salary * 0.01;
    }

    public void setName(String name) {
        if (name != null && !name.equals("")) {
            this.name = name;
        }
        //BELOW DOES NOT WORK
//        if (!name.equals("") && name != null) {
//            this.name = name;
//        }
    }
}
