package edu.alenasoft.principlespatterns.solid.isp;

import org.junit.jupiter.api.Test;

class LegacyPlayerTest {

  @Test
  void player_runs() {
    var player = new Athlete("test");
    player.run();
  }
}
