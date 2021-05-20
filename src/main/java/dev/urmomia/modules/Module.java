package dev.urmomia.modules;


import dev.urmomia.settings.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Module {

    public final String name;
    public final String description;
    public final Category category;

    public int key;
    public boolean toggled;

    public List<Setting> settings = new ArrayList<>();

    public Module(String name, String description, int key, Category category) {
        this.name = name;
        this.description = description;
        this.key = key;
        this.category = category;
        this.toggled = false;
    }

    public Module(String name, String description, Category category) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.key = 0;
        this.toggled = false;
    }

    public void onEnable() { }
    public void onDisable() { }

    public void toggle() {
        if (toggled) {
            this.toggled = false;
            this.onDisable();
        } else {
            this.toggled = true;
            this.onEnable();
        }
    }

    public boolean isToggled() {
        return this.toggled;
    }

    public void setToggled(boolean toggled) {
        this.toggled = toggled;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public int getKey() {
        return this.key;
    }

    public BooleanSetting addBoolean(String name, boolean enabled) {
        BooleanSetting booleanSetting = new BooleanSetting(name, enabled);
        this.settings.add(booleanSetting);
        return booleanSetting;
    }

    public ColorSetting addColor(String name, Color color) {
        ColorSetting colorSetting = new ColorSetting(name, color);
        this.settings.add(colorSetting);
        return colorSetting;
    }

    public ModeSetting addMode(String name, String mode, String... modes) {
        ModeSetting modeSetting = new ModeSetting(name, mode, modes);
        this.settings.add(modeSetting);
        return modeSetting;
    }

    public NumberSetting addNumber(String name, double value, double min, double max) {
        NumberSetting numberSetting = new NumberSetting(name, value, min, max);
        this.settings.add(numberSetting);
        return numberSetting;
    }

}
