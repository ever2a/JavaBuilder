package com.cerberuz;

import com.cerberuz.domain.Address;
import com.cerberuz.domain.Contacto;
import com.cerberuz.domain.Phone;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee.EmployeeBuilder()
            .setAge(24)
            .setName("Ever")
            .setGender("Male")
            .setAddress(new Address("Calle 01", "Ciudad 01", "Pais 01", "cp 01"))
            //.setAddress("Calle 02", "Ciudad 02", "Pais 02", "cp 02")
            .setPhone(new Phone("1001", "01", "Fijo"))
            .setPhone("2002", "02", "Móvil")
            .setContact(new Contacto("Nombre 01",
                new Phone("3003", "03", "Móvil"),
                new Address("Calle 03", "Ciudad 03", "Pais 03", "cp 03")))
            .build();

        System.out.println("Employee: " + employee);

    }
}