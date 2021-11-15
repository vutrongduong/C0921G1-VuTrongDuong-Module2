package ss8_clean_code_va_refactoring.bai_tap.apj_tennis_game_develop.src.com.codegym;


public class TennisGame {
    StringBuilder score = new StringBuilder();
    public static final char SUBTRACTION = '-';
    int tempScore;

    public String getScore(String play1Name, String play2Name, int score1, int score2) {
        if (score1 == score2) {
            checkTiePoint(score1);
        } else if (score1 >= 4 || score2 >= 4) {
            checkHighScore(score1, score2);
        } else {
            checkBadScore(score1, score2);
        }
        return score.toString();
    }

    public void checkTiePoint(int tiecore) {
        switch (tiecore) {
            case 0:
                score = new StringBuilder("Love-All");
                break;
            case 1:
                score = new StringBuilder("Fifteen-All");
                break;
            case 2:
                score = new StringBuilder("Thirty-All");
                break;
            case 3:
                score = new StringBuilder("Forty-All");
                break;
            default:
                score = new StringBuilder("Deuce");
                break;
        }
    }

    public void checkHighScore(int score1, int score2) {
        int minusResult = score1 - score2;
        if (minusResult == 1) score = new StringBuilder("Advantage player1");
        else if (minusResult == -1) score = new StringBuilder("Advantage player2");
        else if (minusResult >= 2) score = new StringBuilder("Win for player1");
        else score = new StringBuilder("Win for player2");
    }

    public void checkBadScore(int score1, int score2) {
        for (int i = 1; i < 3; i++) {
            if (i == 1) tempScore = score1;
            else {
                score.append(SUBTRACTION);
                tempScore = score2;
            }
            switch (tempScore) {
                case 0:
                    score.append("Love");
                    break;
                case 1:
                    score.append("Fifteen");
                    break;
                case 2:
                    score.append("Thirty");
                    break;
                case 3:
                    score.append("Forty");
                    break;
            }
        }
    }
}
