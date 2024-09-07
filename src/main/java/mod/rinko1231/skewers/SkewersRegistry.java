package mod.rinko1231.skewers;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SkewersRegistry
{
    public static final DeferredRegister<Item> ITEMS_VANILLA = DeferredRegister.create(ForgeRegistries.ITEMS, Skewers.MOD_ID);
    public static final DeferredRegister<Item> ITEMS_AQUACULTURE = DeferredRegister.create(ForgeRegistries.ITEMS, Skewers.MOD_ID);

    // RAW SKEWERS
    public static final RegistryObject<Item> SKEWER_BEEF_RAW = ITEMS_VANILLA.register("skewer_beef_raw", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(0.3f).meat().build())));
    public static final RegistryObject<Item> SKEWER_PORKCHOP_RAW = ITEMS_VANILLA.register("skewer_porkchop_raw", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(0.3f).meat().build())));
    public static final RegistryObject<Item> SKEWER_COD_RAW = ITEMS_VANILLA.register("skewer_cod_raw", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> SKEWER_SALMON_RAW = ITEMS_VANILLA.register("skewer_salmon_raw", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> SKEWER_VEGGIE_RAW = ITEMS_VANILLA.register("skewer_veggie_raw", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(0.4f).build())));
    public static final RegistryObject<Item> SKEWER_CHICKEN_RAW = ITEMS_VANILLA.register("skewer_chicken_raw", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(0.3f).effect(new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.3F).meat().build())));
    public static final RegistryObject<Item> SKEWER_RABBIT_RAW = ITEMS_VANILLA.register("skewer_rabbit_raw", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(0.3f).meat().build())));
    public static final RegistryObject<Item> SKEWER_MUTTON_RAW = ITEMS_VANILLA.register("skewer_mutton_raw", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(0.3f).meat().build())));

    // COOKED SKEWERS
    public static final RegistryObject<Item> SKEWER_BEEF_COOKED = ITEMS_VANILLA.register("skewer_beef_cooked", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(16).saturationMod(0.8f).meat().build())));
    public static final RegistryObject<Item> SKEWER_PORKCHOP_COOKED = ITEMS_VANILLA.register("skewer_porkchop_cooked", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(16).saturationMod(0.8f).meat().build())));
    public static final RegistryObject<Item> SKEWER_COD_COOKED = ITEMS_VANILLA.register("skewer_cod_cooked", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(10).saturationMod(0.6f).build())));
    public static final RegistryObject<Item> SKEWER_SALMON_COOKED = ITEMS_VANILLA.register("skewer_salmon_cooked", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(12).saturationMod(0.8f).build())));
    public static final RegistryObject<Item> SKEWER_VEGGIE_COOKED = ITEMS_VANILLA.register("skewer_veggie_cooked", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(8).saturationMod(0.6f).build())));
    public static final RegistryObject<Item> SKEWER_CHICKEN_COOKED = ITEMS_VANILLA.register("skewer_chicken_cooked", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(12).saturationMod(0.6f).meat().build())));
    public static final RegistryObject<Item> SKEWER_RABBIT_COOKED = ITEMS_VANILLA.register("skewer_rabbit_cooked", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(10).saturationMod(0.6f).meat().build())));
    public static final RegistryObject<Item> SKEWER_MUTTON_COOKED = ITEMS_VANILLA.register("skewer_mutton_cooked", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(12).saturationMod(0.8f).meat().build())));

    // OTHER
    public static final RegistryObject<Item> CARAMEL = ITEMS_VANILLA.register("caramel", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> SKEWER_CARAMEL_APPLE = ITEMS_VANILLA.register("skewer_caramel_apple", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(0.6f).build())));
    public static final RegistryObject<Item> SKEWER_COOKIE = ITEMS_VANILLA.register("skewer_cookie", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(0.2f).build())));

    // AQUACULTURE
    public static final RegistryObject<Item> SKEWER_ALGAE = ITEMS_AQUACULTURE.register("skewer_algae", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.0F).fast().build())));
    public static final RegistryObject<Item> SKEWER_FISH_FILLET_RAW = ITEMS_AQUACULTURE.register("skewer_fish_fillet_raw", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.2F).build())));
    public static final RegistryObject<Item> SKEWER_FISH_FILLET_COOKED = ITEMS_AQUACULTURE.register("skewer_fish_fillet_cooked", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(0.6F).build())));
}