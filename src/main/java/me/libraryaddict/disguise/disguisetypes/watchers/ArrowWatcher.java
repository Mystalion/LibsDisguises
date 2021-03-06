package me.libraryaddict.disguise.disguisetypes.watchers;

import me.libraryaddict.disguise.disguisetypes.Disguise;
import me.libraryaddict.disguise.disguisetypes.FlagWatcher;

public class ArrowWatcher extends FlagWatcher {

    public ArrowWatcher(Disguise disguise) {
        super(disguise);
    }

    public boolean isCritical() {
        return (byte) getValue(5, (byte) 0) == 1;
    }

    public void setCritical(boolean critical) {
        setValue(5, (byte) (critical ? 1 : 0));
        sendData(5);
    }

}
