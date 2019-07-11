package com.nsfocus.knights;

public class DamselResuingKnight implements Knight {
    private Quest quest;
    public DamselResuingKnight(Quest quest){
        this.quest = quest;
    }

    public void embarkOnQuest() {
        this.quest.embark();
    }

    public static void main(String[] args) {
        Quest quest = new RescueDanselQuest();
        DamselResuingKnight knight = new DamselResuingKnight(quest);
        knight.embarkOnQuest();
    }
}
