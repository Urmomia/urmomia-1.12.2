package dev.urmomia.settings;

import java.util.Arrays;
import java.util.List;

public class ModeSetting extends Setting {

    public List<String> modes;
    public int mode;

    public ModeSetting(String name, String defaultMode, String... modes) {
        this.name = name;
        this.mode = this.modes.indexOf(mode);
        this.modes = Arrays.asList(modes);
    }


    public String getMode() {
        return this.modes.get(mode);
    }

    public void setMode(String mode) {
        this.mode = this.modes.indexOf(mode);
    }

}
