package edu.alenasoft.principlespatterns.solid.lsp;

public class Square implements Shape {

  private final double width;

  public Square(double width) {
    this.width = width;
  }

  @Override
  public double getArea() {
    return this.width * this.width;
  }
}
