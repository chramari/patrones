package edu.alenasoft.principlespatterns.solid.isp;

import edu.alenasoft.principlespatterns.solid.isp.behaviors.RunBehavior;

public class RunJumpPlayer extends DefaultJumpPlayer implements RunBehavior {

  @Override
  public void run() {
    System.out.println("Running");
  }

  @Override
  public void play() {
    this.run();
    this.jump();
  }
}
