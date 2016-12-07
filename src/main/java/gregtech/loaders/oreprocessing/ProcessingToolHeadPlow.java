package gregtech.loaders.oreprocessing;

import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GT_ModHandler;
import gregtech.common.items.GT_MetaGenerated_Tool_01;
import net.minecraft.item.ItemStack;

public class ProcessingToolHeadPlow implements gregtech.api.interfaces.IOreRecipeRegistrator {
    public ProcessingToolHeadPlow() {
        OrePrefixes.toolHeadPlow.add(this);
    }

    public void registerOre(OrePrefixes aPrefix, Materials aMaterial, String aOreDictName, String aModName, ItemStack aStack) {
        GT_ModHandler.addShapelessCraftingRecipe(GT_MetaGenerated_Tool_01.INSTANCE.getToolWithStats(GT_MetaGenerated_Tool_01.PLOW, 1, aMaterial, aMaterial.mHandleMaterial, null), new Object[]{aOreDictName, OrePrefixes.stick.get(aMaterial.mHandleMaterial)});
    }
}
