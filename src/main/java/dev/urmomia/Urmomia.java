package dev.urmomia;

import dev.urmomia.events.ForgeEvents;
import dev.urmomia.modules.ModuleManager;
import net.engio.mbassy.bus.MBassador;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.Display;

@Mod(modid = Urmomia.MODID, name = Urmomia.NAME, version = Urmomia.VERSION)
public class Urmomia {

    public static final String MODID = "urmomia";
    public static final String NAME = "Urmomia";
    public static final String VERSION = "0.1";
    public static final MBassador EVENT_BUS = new MBassador();

    public static Logger log = LogManager.getLogger(NAME);

    public static ModuleManager moduleManager;
    public static ForgeEvents forgeEvents;

    @EventHandler
    public void onForgeInit(FMLInitializationEvent event) {
        this.initiate();
        Display.setTitle(NAME + " v" + VERSION);
        log.info("Urmomia is loaded.");
    }

    public void initiate() {
        moduleManager = new ModuleManager();
        log.info("Modules are loaded.");

        forgeEvents = new ForgeEvents();
        log.info("Forge events are loaded!");
    }

}
