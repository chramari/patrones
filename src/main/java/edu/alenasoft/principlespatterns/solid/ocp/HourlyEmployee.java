package edu.alenasoft.principlespatterns.solid.ocp;

public class HourlyEmployee implements Payable {

  private final int HOURLY_PAYMENT = 10;
  private final int workedHours;

  public HourlyEmployee(int workedHours) {
    this.workedHours = workedHours;
  }

  @Override
  public double getPay() {
    return this.workedHours * this.HOURLY_PAYMENT;
  }
}
