package hackerRank.javaTutorial;

import java.util.*;

// Write your Checker class here

class Checker implements Comparator<Player> {

    @Override
    public int compare(Player a, Player b) {
        // If 2 Players have the same score
        if (a.score == b.score) {
            return a.name.compareTo(b.name);
        }

        // Otherwise, order higher score first
        else if (a.score > b.score) {
            return -1;
        } else if (a.score < b.score) {
            return 1;
        }

        return 0;
    }
}

class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return this.name + " " + this.score;
    }
}

class JavaComparator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for (int i = 0; i < n; i++) {
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();
        Arrays.sort(player, checker);
        for (int i = 0; i < player.length; i++) {
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}