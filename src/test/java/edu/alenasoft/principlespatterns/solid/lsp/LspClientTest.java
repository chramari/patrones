package edu.alenasoft.principlespatterns.solid.lsp;

import org.junit.jupiter.api.Test;

class LspClientTest {

  @Test
  void execute() {
    var client = new LspClient();
    client.execute();
  }
}
