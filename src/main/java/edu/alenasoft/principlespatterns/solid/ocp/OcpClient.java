package edu.alenasoft.principlespatterns.solid.ocp;

import java.util.List;

public class OcpClient {

  public void makePayments() {
    var fixedEmployee = new FixedEmployee();
    var hourlyEmployee = new HourlyEmployee(8);
    var comissionEmployee = new ComissionEmployee(1000, 0.15);

    List<Payable> employees = List.of(fixedEmployee, hourlyEmployee, comissionEmployee);

    for (var employee : employees) {
      System.out.println("Pago:" + employee.getPay());
    }
  }
}
