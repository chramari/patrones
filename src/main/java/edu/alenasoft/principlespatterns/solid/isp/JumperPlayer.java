package edu.alenasoft.principlespatterns.solid.isp;

import edu.alenasoft.principlespatterns.solid.isp.behaviors.DefaultJumpBehavior;
import edu.alenasoft.principlespatterns.solid.isp.behaviors.JumpBehavior;

public class JumperPlayer implements Player {

  private final JumpBehavior jumpBehavior;

  public JumperPlayer() {
    this.jumpBehavior = new DefaultJumpBehavior();
  }

  public JumperPlayer(JumpBehavior jumpBehavior) {
    this.jumpBehavior = jumpBehavior;
  }

  @Override
  public void play() {
    this.jumpBehavior.jump();
  }
}
