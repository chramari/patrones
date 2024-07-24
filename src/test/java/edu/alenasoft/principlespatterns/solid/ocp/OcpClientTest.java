package edu.alenasoft.principlespatterns.solid.ocp;

import org.junit.jupiter.api.Test;

class OcpClientTest {

  @Test
  void run() {
    var client = new OcpClient();

    client.makePayments();
  }
}
