package edu.alenasoft.principlespatterns.solid.isp;

public class RunnerPlayer implements Player {
  @Override
  public void play() {
    System.out.println("Player is running");
    System.out.println("Player is jumping");
  }
}
