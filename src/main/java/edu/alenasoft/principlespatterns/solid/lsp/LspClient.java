package edu.alenasoft.principlespatterns.solid.lsp;

import java.util.List;

public class LspClient {

  public void execute() {

    var rectangle = new Rectangle(10, 5);
    System.out.println(rectangle.getArea());

    var square = new Square(10);
    System.out.println(square.getArea());

    List<Shape> shapes = List.of(rectangle, square);

    shapes.forEach(s -> System.out.println("Area: " + s.getArea()));
  }
}
