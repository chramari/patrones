package edu.alenasoft.principlespatterns.solid.isp;

import edu.alenasoft.principlespatterns.solid.isp.behaviors.JumpBehavior;

public abstract class DefaultJumpPlayer implements Player, JumpBehavior {

  @Override
  public void jump() {
    System.out.println("Jumping");
  }
}
