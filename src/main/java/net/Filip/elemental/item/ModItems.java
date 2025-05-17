package net.Filip.elemental.item;

import net.Filip.elemental.ElementalMod;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
        public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ElementalMod.MOD_ID);

        public static final DeferredItem<Item> FIRE_HEART_RENMANT =
                ITEMS.registerItem("fire_heart_renmant", Item::new, new Item.Properties());

        public static final DeferredItem<Item> WATER_HEART_RENMANT =
                ITEMS.registerItem("water_heart_renmant", Item::new, new Item.Properties());

        public static final DeferredItem<Item> EARTH_HEART_RENMANT =
                ITEMS.registerItem("earth_heart_renmant", Item::new, new Item.Properties());

        public static final DeferredItem<Item> AIR_HEART_RENMANT =
                ITEMS.registerItem("air_heart_renmant", Item::new, new Item.Properties());


        public static void register(IEventBus eventBus) {
            ITEMS.register(eventBus);
        }

}
