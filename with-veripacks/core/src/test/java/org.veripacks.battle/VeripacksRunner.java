package org.veripacks.battle;

import org.testng.annotations.Test;
import org.veripacks.Verifier;

public class VeripacksRunner {
    @Test
    public void runVeripacks() {
        new Verifier()
                .verify("org.veripacks.battle")
                .throwIfNotOk();
    }
}
