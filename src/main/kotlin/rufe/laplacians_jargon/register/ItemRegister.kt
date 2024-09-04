package rufe.laplacians_jargon.register

import net.minecraft.world.item.Item
import net.minecraftforge.eventbus.api.IEventBus
import net.minecraftforge.registries.DeferredRegister
import net.minecraftforge.registries.ForgeRegistries
import net.minecraftforge.registries.RegistryObject
import rufe.laplacians_jargon.Laplacians_Jargon.BuildConfig
import rufe.laplacians_jargon.consts.idEnchantedPage
import rufe.laplacians_jargon.consts.idPageOfWisdom
import rufe.laplacians_jargon.item.ItemEnchantedPage
import rufe.laplacians_jargon.item.ItemPageOfWisdom
import java.util.function.Supplier

@Suppress("unused")
object ItemRegister {
    private val ITEMS: DeferredRegister<Item> = DeferredRegister.create(ForgeRegistries.ITEMS,BuildConfig.MOD_ID)
    val ITEM_MAP: HashMap<String, RegistryObject<Item>> = LinkedHashMap()

    val pageOfWisdom: RegistryObject<Item> = registering(idPageOfWisdom){
        ItemPageOfWisdom
    }
    val enchantedPage: RegistryObject<Item> = registering(idEnchantedPage){
        ItemEnchantedPage
    }

    private fun registering(id: String, supplier: Supplier<Item>): RegistryObject<Item> {
        val item:RegistryObject<Item> = ITEMS.register(id, supplier)
        ITEM_MAP[id] = item
        return item
    }

    fun register(bus: IEventBus) = ITEMS.register(bus)
}