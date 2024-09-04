package rufe.laplacians_jargon.register

import net.minecraftforge.registries.DeferredRegister
import thedarkcolour.kotlinforforge.forge.ObjectHolderDelegate
import thedarkcolour.kotlinforforge.forge.registerObject

interface AbstractRegister<T> {
    fun registering(registries: DeferredRegister<T>, id:String, supplier: () -> T): ObjectHolderDelegate<T>{
        return registries.registerObject(id,supplier)
    }
}

interface AbstractRegisterWithEntries<T>:AbstractRegister<T>{
    val registerEntries:HashMap<String,ObjectHolderDelegate<T>>

    fun registeringAndAddEntries(registries:DeferredRegister<T>, id: String, supplier:() -> T): ObjectHolderDelegate<T> {
        val entry = registering(registries,id,supplier)
        registerEntries[id] = entry
        return entry
    }
}