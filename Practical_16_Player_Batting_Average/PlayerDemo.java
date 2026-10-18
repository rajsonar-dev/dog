class Player {
    String pname;
    int innings, runs, not_outs;

    Player(String pname, int innings, int runs, int not_outs) {
        this.pname = pname; this.innings = innings;
        this.runs = runs; this.not_outs = not_outs;
    }
    void showdata() {
        System.out.println("Player: " + pname);
        System.out.println("Innings: " + innings);
        System.out.println("Runs: " + runs);
        System.out.println("Not outs: " + not_outs);
    }
    void calcAvd() {
        int dismissals = innings - not_outs;
        if (dismissals == 0) System.out.println("Average cannot be calculated");
        else System.out.println("Batting average = " + (double) runs / dismissals);
    }
}
public class PlayerDemo {
    public static void main(String[] args) {
        Player p = new Player("Virat", 10, 500, 2);
        p.showdata();
        p.calcAvd();
    }
}
