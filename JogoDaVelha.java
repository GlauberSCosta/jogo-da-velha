public class MainJogoDaVelha {

    enum Estado {Blank, X, O}

    ;

    int n = 3;
    Estado[][] jogo = new Estado[n][n];
    int jogada;

    boolean marcar(int x, int y, Estado s) {
        if (jogo[x][y] == Estado.Blank) {
            jogo[x][y] = s;
        }
        jogada++;


        //check coluna
        for (int i = 0; i < n; i++) {
            if (jogo[x][i] != s)
                break;
            if (i == n - 1) {
                return true;
            }
        }

        //check linha
        for (int i = 0; i < n; i++) {
            if (jogo[i][y] != s)
                break;
            if (i == n - 1) {
                return true;
            }
        }

        //check diagonal
        if (x == y) {
            //we're on a diagonal
            for (int i = 0; i < n; i++) {
                if (jogo[i][i] != s)
                    break;
                if (i == n - 1) {
                    return true;
                }
            }
        }

        //check anti diagonal
        if (x + y == n - 1) {
            for (int i = 0; i < n; i++) {
                if (jogo[i][(n - 1) - i] != s)
                    break;
                if (i == n - 1) {
                    return true;
                }
            }
        }


        if (jogada == (Math.pow(n, 2) - 1)) {

        }
        return false;
    }

}
