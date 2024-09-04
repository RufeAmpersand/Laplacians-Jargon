package rufe.laplacians_jargon.creative_tab

import net.minecraft.core.registries.Registries
import net.minecraft.network.chat.Component
import net.minecraft.world.item.CreativeModeTab
import net.minecraftforge.eventbus.api.IEventBus
import net.minecraftforge.registries.DeferredRegister
import rufe.laplacians_jargon.Laplacians_Jargon.BuildConfig
import rufe.laplacians_jargon.register.AbstractRegister
import rufe.laplacians_jargon.register.ItemRegister
import thedarkcolour.kotlinforforge.forge.ObjectHolderDelegate

object CreativeTabRegister: AbstractRegister<CreativeModeTab> {
    val creativeModTabs: DeferredRegister<CreativeModeTab> = DeferredRegister.create(Registries.CREATIVE_MODE_TAB,BuildConfig.MOD_ID)
    val creativeModTabId : String = "item_group." + BuildConfig.MOD_ID + ".general"
    val creativeModTab: ObjectHolderDelegate<CreativeModeTab> = registering(creativeModTabs,creativeModTabId){
        CreativeModeTab.builder().title(Component.translatable(creativeModTabId)).icon{
            ItemRegister.pageOfWisdom.defaultInstance
        }.displayItems{ _, output ->
            ItemRegister.registerEntries.forEach{ (_, item) ->
                output.accept(item.get())
            }
        }.build()
    }

    fun register(eventBus: IEventBus){
        creativeModTabs.register(eventBus)
    }
}