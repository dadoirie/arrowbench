package net.arrowbench;

import net.arrowbench.misc.FletchingScreen;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class ArrowBenchClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        HandledScreens.register(ArrowBenchMain.FLETCHING, FletchingScreen::new);
    }

}
