package com.piyush.org;

import com.piyush.org.factory.ParserFactory;
import com.piyush.org.factory.WriterFactory;
import com.piyush.org.model.Employee;
import com.piyush.org.model.Employees;

/**
 * Staring point of the application.
 */
public class Application {
    public static void main(String[] args) {
        final String file = "C:\\xmlTemp\\employees.xml";
        final String fileFormat = "xml";
        final Parser xmlParser = ParserFactory.getParser(fileFormat);

        final Employees employees = xmlParser.parse(file, Employees.class);

        addEmployees(employees);
        removeEmployees(employees);

        final Writer writer = WriterFactory.getWriter(fileFormat);

        writer.write(employees, Employees.class, file);
    }

    private static void removeEmployees(final Employees employees) {
        employees.getEmployees().remove(1);
    }

    private static void addEmployees(final Employees employees) {
        final Employee sunil = getEmployee("Sunil", 24, "Senior Software Engineer");
        final Employee amit = getEmployee("Amit", 26, "Senior Software Engineer");

        employees.getEmployees().add(sunil);
        employees.getEmployees().add(amit);
    }

    private static Employee getEmployee(final String name, final int age, final String designation) {
        final Employee employee = new Employee();

        employee.setName(name);
        employee.setAge(age);
        employee.setDesignation(designation);
        return employee;
    }
}
