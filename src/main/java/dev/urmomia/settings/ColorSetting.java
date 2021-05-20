package dev.urmomia.settings;

import java.awt.*;

public class ColorSetting extends Setting {

    public boolean rainbow;
    public Color color;

    public ColorSetting(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    public Color getColor() {
        return this.color;
    }

}
