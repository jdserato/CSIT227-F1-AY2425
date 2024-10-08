package Sept05.Comp;// Java program to illustrate
// Concept of Composition

// Importing required classes
import java.util.*;

// Class 1
// Department class
class Department {

    // Attributes of Department
    public String departmentName;

    // Constructor of Department class
    public Department(String departmentName)
    {
        this.departmentName = departmentName;
    }

    public String getDepartmentName()
    {
        return departmentName;
    }
}

// Class 2
// Company class
class Company {

    // Reference to refer to list of books
    private String companyName;
    private List<Department> departments;

    // Constructor of Company class
    public Company(String companyName)
    {
        this.companyName = companyName;
        this.departments = new ArrayList<Department>();
    }

    // Method
    // to add new Department to the Company
    public void addDepartment(Department department)
    {
        departments.add(department);
    }

    public List<Department> getDepartments()
    {
        return new ArrayList<>(departments);
    }

    // Method
    // to get total number of Departments in the Company
    public int getTotalDepartments()
    {
        return departments.size();
    }
}

// Class 3
// Main class
class CompositonExample {

    // Main driver method
    public static void main(String[] args)
    {
        // Creating a Company object
        Company techCompany = new Company("Tech Corp");

        techCompany.addDepartment(new Department("Engineering"));
        techCompany.addDepartment(new Department("Operations"));
        techCompany.addDepartment(new Department("Human Resources"));
        techCompany.addDepartment(new Department("Finance"));

        int d = techCompany.getTotalDepartments();
        System.out.println("Total Departments: " + d);

        System.out.println("Department names: ");
        for (Department dept : techCompany.getDepartments()) {
            System.out.println("- " + dept.getDepartmentName());
        }
    }
}
