package edu.alenasoft.principlespatterns.solid.ocp;

public class FixedEmployee implements Payable {

  private final int BASIC_PAYMENT = 1000;

  @Override
  public double getPay() {
    return this.BASIC_PAYMENT;
  }
}
