package edu.alenasoft.principlespatterns.solid.ocp;

import org.junit.jupiter.api.Test;

class EmployeeTest {

  @Test
  void test_get_pay() {
    var employee = new Employee(PaymentType.FIXED);
    System.out.println(employee.getPay());
  }
}
