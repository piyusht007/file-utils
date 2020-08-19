package com.piyush.org.consumer;

import com.piyush.org.third.party.lib.Parser;
import com.piyush.org.third.party.lib.Writer;
import com.piyush.org.third.party.lib.factory.ParserFactory;
import com.piyush.org.third.party.lib.factory.WriterFactory;

import java.util.List;

/**
 * Staring point of the application.
 */
public class Application {
    public static void main(String[] args) {
        final String file = args[0];
        final String fileFormat = args[1];

        final Parser xmlParser = ParserFactory.getParser(fileFormat);
        final List<Employee> employees = xmlParser.parse(file, Employee.class);

        addEmployees(employees);
        removeEmployees(employees);

        final Writer writer = WriterFactory.getWriter(fileFormat);

        writer.write(employees, Employee.class, file, "employees");
    }

    private static void removeEmployees(final List<Employee> employees) {
        employees.remove(1);
    }

    private static void addEmployees(final List<Employee> employees) {
        final Employee sunil = getEmployee("Sunil", 24, "Senior Software Engineer", getAddress(20, "MG Road", "Pune", "Maharashtra"));
        final Employee amit = getEmployee("Amit", 26, "Senior Software Engineer", null);

        employees.add(sunil);
        employees.add(amit);
    }

    private static Address getAddress(Integer doorNo, String street, String town, String state) {
        final Address address = new Address();

        address.setDoorNo(doorNo);
        address.setState(state);
        address.setStreet(street);
        address.setTown(town);
        return address;
    }

    private static Employee getEmployee(final String name, final int age, final String designation, final Address address) {
        final Employee employee = new Employee();

        employee.setName(name);
        employee.setAge(age);
        employee.setDesignation(designation);
        employee.setAddress(address);
        return employee;
    }
}
