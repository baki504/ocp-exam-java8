package chap04.variable;

interface Gorilla {
    String move();
}

class GorillaFamily {
    String walk = "walk";

    void everyonePlay(boolean baby) {
        String approach = "amble";

        play(() -> walk);
        play(() -> baby ? "hitch a ride" : "run");

    }

    void play(Gorilla g) {
        System.out.println(g.move());
    }

    public static void main(String[] args) {
        new GorillaFamily().everyonePlay(false);
        new GorillaFamily().everyonePlay(true);
    }
}
