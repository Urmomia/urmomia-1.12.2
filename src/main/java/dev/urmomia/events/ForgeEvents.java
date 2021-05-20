package dev.urmomia.events;

import dev.urmomia.modules.Module;
import dev.urmomia.modules.ModuleManager;
import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import org.lwjgl.input.Keyboard;

public class ForgeEvents {

    public ForgeEvents() {
        MinecraftForge.EVENT_BUS.register(this);
    }

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
