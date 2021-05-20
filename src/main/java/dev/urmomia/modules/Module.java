package dev.urmomia.modules;


public class Module {

    public final String name;
    public final String description;
    public final Category category;
    public final int key;

    public boolean toggled;

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

}
