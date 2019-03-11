package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    ROCK,
    SCISSOR,
    PAPER;

    public RockPaperScissorHandSign getWinner() {

    return RockPaperScissorHandSign.PAPER;

    }

    public RockPaperScissorHandSign getLoser() {
        return RockPaperScissorHandSign.SCISSOR;
    }
}




