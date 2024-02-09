package Employee;

public class Test {
    public static void main(String[] args) {
        CompanyDetails companyDetails= new CompanyDetails("transformer","simulation","Sonic","Mumbai");
        EmployeeDetails employeeDetails = new EmployeeDetails("chandu","9908",2000,companyDetails);
                System.out.println(employeeDetails);

    }
}
