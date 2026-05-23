
package com.example.minesweeper;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

public class MinesweeperMod implements ClientModInitializer {
    public static KeyBinding OPEN_MINESWEEPER_KEY;

    @Override
    public void onInitializeClient() {
        OPEN_MINESWEEPER_KEY = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "key.minesweeper.open",
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_J,
                "category.minesweeper"
        ));

        net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents.END_CLIENT_TICK.register(client -> {
            while (OPEN_MINESWEEPER_KEY.wasPressed()) {
                client.setScreen(new MinesweeperScreen());
            }
        });
    }
}
