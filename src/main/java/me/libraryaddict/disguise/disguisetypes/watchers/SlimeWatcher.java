package me.libraryaddict.disguise.disguisetypes.watchers;

import me.libraryaddict.disguise.disguisetypes.Disguise;
import me.libraryaddict.disguise.utilities.DisguiseUtilities;

public class SlimeWatcher extends LivingWatcher {

    public SlimeWatcher(Disguise disguise) {
        super(disguise);
        setSize(DisguiseUtilities.random.nextInt(4) + 1);
    }

    public int getSize() {
        return (int) getValue(11, 1);
    }

    public void setSize(int size) {
        if (size <= 0 || size >= 128) {
            size = 1;
        }
        setValue(11, size);
        sendData(11);
    }

}
