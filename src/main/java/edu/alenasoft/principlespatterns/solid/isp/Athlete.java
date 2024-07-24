package edu.alenasoft.principlespatterns.solid.isp;

public class Athlete implements LegacyPlayer {

  private final String name;

  public Athlete(String name) {
    this.name = name;
  }

  public void run() {
    if ("runner".equals(this.name)) {
      System.out.println(this.name + " is running");
    }
  }

  public void jump() {
    if ("jumper".equals(this.name)) {
      System.out.println(this.name + " is jumping");
    }
  }

  public void swim() {
    if ("swimmer".equals(this.name)) {
      System.out.println(this.name + " is swimming");
    }
  }

  @Override
  public void walk() {}
}
