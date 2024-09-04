package rufe.laplacians_jargon

import net.minecraftforge.fml.common.Mod
import rufe.laplacians_jargon.Laplacians_Jargon.BuildConfig
import rufe.laplacians_jargon.creative_tab.CreativeTabRegister
import rufe.laplacians_jargon.register.ItemRegister
import thedarkcolour.kotlinforforge.forge.MOD_BUS

@Mod(BuildConfig.MOD_ID)
object LaplaciansJargon {
    init{

        ItemRegister.register(MOD_BUS)
        CreativeTabRegister.register(MOD_BUS)
    }
}