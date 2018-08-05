package com.quzzar.betterrecipes.recipes;

import java.util.List;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.material.MaterialData;

import com.quzzar.betterrecipes.BetterRecipesLib;

public class BetterShapelessRecipe extends BetterRecipe {

	private ShapelessRecipe recipe;
	private ItemStack result;
	
	public BetterShapelessRecipe(String recipeKey, ItemStack result) {
		super();
		
		this.recipe = new ShapelessRecipe(
						new NamespacedKey(BetterRecipesLib.getInstance(), recipeKey),
						new ItemStack(Material.STICK));
		this.result = result;
		
	}
	
	public void addIngredient(ItemStack ingredient) {
		
		MaterialData mData = ingredient.getData();
		
		getItemMap().put(mData, ingredient);
		recipe.addIngredient(ingredient.getAmount(), mData);
	}
	
	@Override
	public ItemStack getResult() {
		return result;
	}
	
	public void setResult(ItemStack result) {
		this.result = result;
	}
	
	@Override
	public NamespacedKey getKey() {
		return recipe.getKey();
	}
	
	public List<ItemStack> getIngredientList() {
		return recipe.getIngredientList();
	}
	
	@Override
	public ShapelessRecipe getRecipe() {
		return recipe;
	}

}
