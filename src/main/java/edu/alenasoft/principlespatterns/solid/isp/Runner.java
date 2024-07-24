package edu.alenasoft.principlespatterns.solid.isp;

public class Runner implements LegacyPlayer {
  @Override
  public void run() {
    System.out.println("Runner is running");
  }

  @Override
  public void jump() {
    // NO DEBE SALTAR, no agregue código
  }

  @Override
  public void swim() {
    throw new UnsupportedOperationException();
  }

  @Override
  public void walk() {}
}
