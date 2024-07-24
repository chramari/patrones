package edu.alenasoft.principlespatterns.patterns.iterator;

import org.junit.jupiter.api.Test;

class UsersPanelTest {

  @Test
  void show_users_v1() {
    var panel = new UsersPanel();

    panel.show();
  }

  @Test
  void show_users_v2() {
    var panel = new UsersPanelV2();
    panel.addAggregate(new GoogleAggregate());

    panel.show();
  }

  @Test
  void add_company_on_runtime() {
    var panel = new UsersPanelV2();
    System.out.println("hoy");
    panel.show();
    System.out.println("futuro");
    panel.addAggregate(new GoogleAggregate());
    panel.addAggregate(new FacebookAggregate());
    panel.addAggregate(new CREAggregate());
    panel.show();
  }
}
