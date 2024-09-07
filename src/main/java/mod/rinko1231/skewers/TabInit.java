package mod.rinko1231.skewers;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class TabInit {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Skewers.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SKEWERS_TAB = TABS.register(Skewers.MOD_ID, () -> CreativeModeTab.builder()
            // Set name of tab to display
            .title(Component.translatable("item_group." + Skewers.MOD_ID))
            // Set icon of creative tab
            .icon(() -> new ItemStack(SkewersRegistry.SKEWER_BEEF_COOKED.get()))
            // Add default items to tab
            .displayItems((params, output) -> {
                SkewersRegistry.ITEMS_VANILLA.getEntries().forEach(it -> output.accept(it.get()));
            })
            .build()
    );
}