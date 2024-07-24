package edu.alenasoft.principlespatterns.solid.ocp;

public class ComissionEmployee implements Payable {

  private final int totalSales;
  private final double fee;

  public ComissionEmployee(int totalSales, double fee) {
    this.totalSales = totalSales;
    this.fee = fee;
  }

  @Override
  public double getPay() {
    return this.fee * this.totalSales;
  }
}
