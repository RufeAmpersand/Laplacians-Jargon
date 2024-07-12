package rufe.laplacians_jargon.creative_tab

import net.minecraft.core.registries.Registries
import net.minecraft.network.chat.Component
import net.minecraft.world.item.CreativeModeTab
import net.minecraftforge.eventbus.api.IEventBus
import net.minecraftforge.registries.DeferredRegister
import net.minecraftforge.registries.RegistryObject
import rufe.laplacians_jargon.Laplacians_Jargon.BuildConfig
import rufe.laplacians_jargon.register.ItemRegister

object LaplaciansJargonCreativeTab {
    val creativeModTabs: DeferredRegister<CreativeModeTab> = DeferredRegister.create(Registries.CREATIVE_MODE_TAB,BuildConfig.MOD_ID)
    val creativeModTabId : String = "item_group." + BuildConfig.MOD_ID + ".general"
    val creativeModTab: RegistryObject<CreativeModeTab> = creativeModTabs.register(creativeModTabId){
        CreativeModeTab.builder().title(Component.translatable(creativeModTabId)).icon{
            ItemRegister.pageOfWisdom.get().defaultInstance
        }.displayItems{ _, output ->
            ItemRegister.ITEM_MAP.forEach{ (_, item) ->
                output.accept(item.get())
            }
        }.build()
    }

    fun register(eventBus: IEventBus){
        creativeModTabs.register(eventBus)
    }
}