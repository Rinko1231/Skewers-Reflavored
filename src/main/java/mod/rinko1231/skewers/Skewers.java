package mod.rinko1231.skewers;

import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("skewers")
public class Skewers
{
    public static final String MOD_ID = "skewers";


    public Skewers()
    {
        final var eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        SkewersRegistry.ITEMS_VANILLA.register(eventBus);
        TabInit.TABS.register(eventBus);
        if (ModList.get().isLoaded("aquaculture"))
        {
            SkewersRegistry.ITEMS_AQUACULTURE.register(eventBus);
        }
    }
}