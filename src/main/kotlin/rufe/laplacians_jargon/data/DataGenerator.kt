package rufe.laplacians_jargon.data

import net.minecraftforge.data.event.GatherDataEvent
import net.minecraftforge.eventbus.api.SubscribeEvent
import net.minecraftforge.fml.common.Mod
import rufe.laplacians_jargon.data.provider.LJRecipeProvider

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
object DataGenerator {
    @SubscribeEvent
    fun runData(event:GatherDataEvent){
        with(event.generator) {
//             addProvider(event.includeServer(),::LJRecipeProvider)
        }
    }
}