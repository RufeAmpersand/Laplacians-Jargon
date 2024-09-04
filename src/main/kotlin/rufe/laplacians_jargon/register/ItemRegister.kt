package rufe.laplacians_jargon.register

import net.minecraft.world.item.Item
import net.minecraftforge.eventbus.api.IEventBus
import net.minecraftforge.registries.DeferredRegister
import net.minecraftforge.registries.ForgeRegistries
import rufe.laplacians_jargon.Laplacians_Jargon.BuildConfig
import rufe.laplacians_jargon.consts.idPageOfWisdom
import rufe.laplacians_jargon.item.ItemPageOfWisdom
import thedarkcolour.kotlinforforge.forge.ObjectHolderDelegate

@Suppress("unused")
object ItemRegister : AbstractRegisterWithEntries<Item> {
    override val registerEntries: HashMap<String, ObjectHolderDelegate<Item>> = LinkedHashMap()
    private val ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,BuildConfig.MOD_ID)
    val pageOfWisdom by this.registeringAndAddEntries(ITEMS,idPageOfWisdom){
        ItemPageOfWisdom
    }

    fun register(bus: IEventBus) = ITEMS.register(bus)
}