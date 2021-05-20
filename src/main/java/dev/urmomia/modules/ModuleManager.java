package dev.urmomia.modules;

import java.util.concurrent.CopyOnWriteArrayList;

public class ModuleManager {

    public static CopyOnWriteArrayList<Module> modules;

    public ModuleManager() {
        modules = new CopyOnWriteArrayList<>();

        /*
         * insert module adding here
         */
    }

    public static CopyOnWriteArrayList getModules() {
        return modules;
    }

}
