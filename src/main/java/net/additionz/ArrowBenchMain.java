package net.arrowbench;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import net.arrowbench.misc.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.Block;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.registry.Registry;

public class ArrowBenchMain implements ModInitializer {

    public static final RecipeType<FletchingRecipe> FLETCHING_RECIPE = RecipeType.register("fletching");
    public static final RecipeSerializer<FletchingRecipe> FLETCHING_SERIALIZER = RecipeSerializer.register("fletching", new FletchingRecipe.Serializer());
    public static ScreenHandlerType<FletchingScreenHandler> FLETCHING = new ScreenHandlerType<>(FletchingScreenHandler::new);

    @Override
    public void onInitialize() {

        Registry.register(Registry.SCREEN_HANDLER, "fletching", FLETCHING);
    }

}
