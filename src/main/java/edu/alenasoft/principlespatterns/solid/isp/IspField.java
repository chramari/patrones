package edu.alenasoft.principlespatterns.solid.isp;


import java.util.List;

public class IspField {

    public void play() {
        var runJumpPlayer = new RunJumpPlayer();
        var jumpPlayer = new JumperPlayer();

//        var verticalJumpBehavior = new JumpBehavior() {
//            @Override
//            public void jump() {
//                System.out.println("Jump vertically");
//            }
//        };
//      var jumpVerticalPlayer = new JumperPlayer(verticalJumpBehavior);

        var jumpVerticalPlayer = new JumperPlayer(() -> System.out.println("Jump vertically"));
        var swimPlayer = new SwimPlayer();

        List<Player> players = List.of(runJumpPlayer, jumpPlayer, swimPlayer, jumpVerticalPlayer);
        players.forEach(Player::play);

//        runJumpPlayer.jump();
//        runJumpPlayer.run();
//
//        jumpPlayer.jump();
//        jumpPlayer.play();
//
//        swimPlayer.swim();
    }
}
