package card;

import game.Direction;
/**
 * Changes orientation of the robot
 * -1 = left turn
 * 1 = right turn
 * 2 = U-turn
 */
public class CardTurn implements ICard{
    int turnSteps;
    int priority;

    public CardTurn(int turnSteps, int priority) {
        this.turnSteps = turnSteps;
        this.priority = priority;
    }

    public void checkPriority() {

    }



    /**
     * @return priority value of the card as an int
     */
    @Override
    public int getPriority() {
        return priority;
    }
}