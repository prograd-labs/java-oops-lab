public class EmployeeOne{
    private String name;
    private int age;
    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception {
        if(age<0){
            throw new Exception("Invalid Age");
        }
        else{
            this.age = age;
        }
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) throws Exception {
        if(salary<0){
            throw new Exception("Invalid Salary");
        }
        else{
            this.salary = salary;
        }
    }
}
