package edu.alenasoft.principlespatterns.solid.isp.behaviors;

public class DefaultJumpBehavior implements JumpBehavior {
  @Override
  public void jump() {
    System.out.println("Jumping");
  }
}
