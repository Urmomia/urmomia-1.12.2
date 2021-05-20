package dev.urmomia;

import dev.urmomia.modules.Module;
import dev.urmomia.modules.ModuleManager;
import net.engio.mbassy.bus.MBassador;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;

@Mod(modid = Urmomia.MODID, name = Urmomia.NAME, version = Urmomia.VERSION)
public class Urmomia {

    public static final String MODID = "urmomia";
    public static final String NAME = "Urmomia";
    public static final String VERSION = "0.1";
    public static final MBassador EVENT_BUS = new MBassador();

    public static Logger log = LogManager.getLogger(NAME);

    public static ModuleManager moduleManager;

    @EventHandler
    public void onForgeInit(FMLInitializationEvent event) {
        this.initiate();
        Display.setTitle(NAME + " v" + VERSION);
        log.info("Urmomia is loaded.");
    }

    public void initiate() {
        moduleManager = new ModuleManager();
        log.info("Modules are loaded.");
    }

    /*
     * will put somewhere later. in main class for now
     */

    @SubscribeEvent
    public void onKey(InputEvent.KeyInputEvent event) {
        if (Minecraft.getMinecraft().world == null || Minecraft.getMinecraft().player == null) return;
        try {
            if (Keyboard.isCreated() && Keyboard.getEventKeyState()) {
                int key = Keyboard.getEventKey();
                if (key <= 0) return;
                for (Module module : ModuleManager.modules) {
                    if (module.getKey() == key && key > 0) {
                        module.toggle();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
