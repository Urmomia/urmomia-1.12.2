package dev.urmomia;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = Urmomia.MODID, name = Urmomia.NAME, version = Urmomia.VERSION)
public class Urmomia {
    public static final String MODID = "urmomia";
    public static final String NAME = "Urmomia";
    public static final String VERSION = "0.1";

    private static Logger log = LogManager.getLogger(NAME);

    @EventHandler
    public void init(FMLInitializationEvent event) {
        log.info("Urmomia is loaded.");
    }
}
