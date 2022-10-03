public class MainOne {
    public static void main(String[] args) throws Exception {
        EmployeeOne employeeOne = new EmployeeOne();

        employeeOne.setName("Sethu");
        employeeOne.setAge(20);
        employeeOne.setSalary(40000);

        System.out.println(employeeOne.getName());
        System.out.println(employeeOne.getAge());
        System.out.println(employeeOne.getSalary());


        employeeOne.setName("Sethu");
        employeeOne.setAge(-20);
        employeeOne.setSalary(-40000);


        System.out.println(employeeOne.getName());
        System.out.println(employeeOne.getAge());
        System.out.println(employeeOne.getSalary());


    }
}
