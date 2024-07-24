package edu.alenasoft.principlespatterns.solid.isp;

import edu.alenasoft.principlespatterns.solid.isp.behaviors.SwimBehavior;

public class SwimPlayer implements Player, SwimBehavior {
  @Override
  public void swim() {
    System.out.println("Swim");
  }

  @Override
  public void play() {
    this.swim();
  }
}
