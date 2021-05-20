package dev.urmomia.settings;

/**
 * this was because i was too lazy to add double/int/float settings. get real xd
 * @author chomp chomp chomp chomp
 */

public class NumberSetting extends Setting {

    public double value;
    public double min;
    public double max;

    public NumberSetting(String name, double value, double min, double max) {
        this.name = name;
        this.value = value;
        this.min = min;
        this.max = max;
    }

    public double getValue() {
        return this.value;
    }

}
