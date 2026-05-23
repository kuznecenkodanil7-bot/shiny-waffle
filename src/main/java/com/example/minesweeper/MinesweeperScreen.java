
package com.example.minesweeper;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;

public class MinesweeperScreen extends Screen {
    protected MinesweeperScreen() {
        super(Text.of("Сапер"));
    }

    @Override
    protected void init() {
        super.init();
    }

    @Override
    public void render(int mouseX, int mouseY, float delta) {
        super.render(mouseX, mouseY, delta);
    }

    @Override
    public boolean mouseClicked(double mouseX, double mouseY, int button) {
        return super.mouseClicked(mouseX, mouseY, button);
    }
}
