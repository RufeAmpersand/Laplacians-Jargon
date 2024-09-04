package rufe.laplacians_jargon.data.provider

import kotlinx.serialization.json.internal.encodeByWriter
import net.minecraft.data.PackOutput
import net.minecraft.data.recipes.*
import net.minecraft.world.item.Item
import net.minecraft.world.item.Items
import net.minecraft.world.level.ItemLike
import rufe.laplacians_jargon.consts.idEnchantedPage
import rufe.laplacians_jargon.item.ItemEnchantedPage
import rufe.laplacians_jargon.item.ItemPageOfWisdom
import rufe.laplacians_jargon.register.ItemRegister
import java.util.function.Consumer

class LJRecipeProvider(packOutput: PackOutput) : RecipeProvider(packOutput) {
    override fun buildRecipes(consumer: Consumer<FinishedRecipe>) {
        shapeless(ItemRegister.enchantedPage).requires(Items.ENCHANTED_BOOK).requires(Items.SHEARS).save(consumer)
        shapeless(ItemRegister.pageOfWisdom).requires(ItemRegister.enchantedPage).requires(Items.GLOW_INK_SAC).requires(Items.GOLD_NUGGET).save(consumer)
    }

    fun shaped(result: ItemLike): ShapedRecipeBuilder {
        return ShapedRecipeBuilder.shaped(RecipeCategory.MISC,result)
    }

    fun shapeless(result: ItemLike): ShapelessRecipeBuilder {
        return ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,result)
    }
}