package rufe.laplacians_jargon

import net.minecraftforge.common.MinecraftForge
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext
import rufe.laplacians_jargon.Laplacians_Jargon.BuildConfig

@Mod(BuildConfig.MOD_ID)
class LaplaciansJargon {
    init{
        val modEventBus = FMLJavaModLoadingContext.get().modEventBus

        MinecraftForge.EVENT_BUS.register(this)
    }
}