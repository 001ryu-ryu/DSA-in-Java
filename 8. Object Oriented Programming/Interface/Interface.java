public class Interface {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.move();

        Rook r = new Rook();
        r.move();

        King k = new King();
        k.move();
    }
}

interface ChessPlayer {
    void move();
}

class Queen implements ChessPlayer {
    public void move() {
        System.out.println("Up, down, left, right, diagonal(in all directions)");
    }
}

class Rook implements ChessPlayer {
    public void move() {
        System.out.println("Up, down, left, right");
    }
}

class King implements ChessPlayer {
    public void move() {
        System.out.println("Up, down, left, right, diagonal -- only one step");
    }
}