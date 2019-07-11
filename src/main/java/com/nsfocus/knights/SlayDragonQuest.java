package com.nsfocus.knights;

import java.io.PrintStream;

public class SlayDragonQuest implements Quest{
    private PrintStream printStream;

    public SlayDragonQuest(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void embark() {
        this.printStream.println("embarking on quest to slay the dragon!");
    }
}
