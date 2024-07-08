package rufe.laplacians_jargon

import net.minecraftforge.common.MinecraftForge
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext
import rufe.laplacians_jargon.Laplacians_Jargon.BuildConfig
import rufe.laplacians_jargon.creative_tab.LaplaciansJargonCreativeTab
import rufe.laplacians_jargon.register.ItemRegister

@Mod(BuildConfig.MOD_ID)
class LaplaciansJargon {
    init{
        val eventBus = FMLJavaModLoadingContext.get().modEventBus

        ItemRegister.register(eventBus)
        LaplaciansJargonCreativeTab.register(eventBus)

        MinecraftForge.EVENT_BUS.register(this)
    }
}