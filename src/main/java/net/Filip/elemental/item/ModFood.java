package net.Filip.elemental.item;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModFood {

    public static final DeferredRegister.Items FOOD = DeferredRegister.createItems("elemental");

    public static final DeferredItem<Item> FOOD_EXAMPLE =
            FOOD.registerItem("food_example", Item::new, new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(5)
                            .saturationModifier(0.25f)
                            .alwaysEdible()
                            .build()));

    public static void register(IEventBus eventBus) {
        FOOD.register(eventBus);
    }


}
