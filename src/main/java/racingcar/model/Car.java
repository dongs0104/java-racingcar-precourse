package racingcar.model;

import java.util.Collections;
import racingcar.RacingGameConstants;

public class Car {

    private String name;
    private int moveCount = 0;

    public Car(String name) {
        if (name.length() > RacingGameConstants.MAX_NAME_LENGTH) {
            throw new IllegalArgumentException(
                "[ERROR] 자동차의 이름은 " + RacingGameConstants.MAX_NAME_LENGTH + "자를 넘을 수 없습니다.");
        }
        setName(name);
    }

    public String toString() {
        return String.format("%s : %s", getName(), String.join("", Collections.nCopies(getMoveCount(), "-")));
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setMoveCount(int count) {
        this.moveCount = count;
    }

    public String getName() {
        return name;
    }

    public int getMoveCount() {
        return moveCount;
    }
}
