package domain.rules;

import domain.Move;
import domain.Result;
import domain.Rules;

public class RockPaperScissors implements Rules {
    @Override
    public Result decide(Move mine, Move theirs) {
        if ((mine == Move.SCISSORS && theirs == Move.ROCK) || (mine == Move.ROCK && theirs == Move.PAPER) || (mine == Move.PAPER && theirs == Move.SCISSORS)){
            return Result.LOSE;
        }
        else if (mine == theirs) {
            return Result.DRAW;
        }
        else {
            return Result.WIN;
        }
    }
}
