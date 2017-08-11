package com.javarush.task.task13.task1328;

public abstract class AbstractRobot implements Attackable, Defensable{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private static int hitCount;

    public BodyPart attack() {
        BodyPart attackedBodyPart = null;
        hitCount = hitCount + 1;

        if (hitCount == 1) {
            attackedBodyPart = BodyPart.ARM;
        } else if (hitCount == 2) {
            attackedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 3) {
            attackedBodyPart = BodyPart.ARM;
        } else
            attackedBodyPart = BodyPart.CHEST;
        return attackedBodyPart;
    }

    public BodyPart defense() {
        BodyPart defencedBodyPart = null;
        hitCount = hitCount + 2;

        if (hitCount == 1) {
            defencedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 2) {
            defencedBodyPart = BodyPart.LEG;
        } else if (hitCount == 3) {
            defencedBodyPart = BodyPart.ARM;
        } else
            defencedBodyPart = BodyPart.CHEST;
        return defencedBodyPart;
    }
}
