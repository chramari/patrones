package edu.alenasoft.principlespatterns.solid.ocp;

public class Employee {

  private final PaymentType paymentType;
  private final Integer basicSalary = 1000;
  private final Integer hourlySalary = 10;

  public Employee(PaymentType paymentType) {
    this.paymentType = paymentType;
  }

  public int getPay() {
    return this.basicSalary;
  }

  public int getPayByHours(int workedHours) {
    return workedHours * this.hourlySalary;
  }

  public PaymentType getPaymentType() {
    return paymentType;
  }
}
