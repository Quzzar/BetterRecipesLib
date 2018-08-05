package com.quzzar.betterrecipes.old;

public class LegacyRecipe {

	
	/*
	
	private String getCode(ItemStack[] ingredients) {
		
		
		final String nullChar = "#";
		String code = "";
		
		for(ItemStack item : ingredients) {
			
			if(item!=null) {
				String name = item.getType().name();
				code += name.substring(0, 1);
			} else {
				code += nullChar;
			}
			
		}
		
		//Bukkit.broadcastMessage("Before: "+code);
		
		double sqrt = Math.sqrt(code.length());
		int gridSize = (int) sqrt;
		
		StringBuilder nRowBuilder = new StringBuilder();
		for(int i=0; i<gridSize; i++) {
			nRowBuilder.append(nullChar);
		}
		String nRow = nRowBuilder.toString();
		
		// Remove nRows from front
		while(code.startsWith(nRow)) {
			code = code.substring(gridSize);
		}
		
		// Remove nRows from back
		while(code.endsWith(nRow)) {
			code = code.substring(0, code.length() - gridSize);
		}
		
		//Bukkit.broadcastMessage("After:   "+code);
		
		return code;
		
	}
	
	
	// You can't craft items if they have metadata in the ingredients
	@EventHandler
	public void onItemCraft(PrepareItemCraftEvent e) {
		
		String ironPickCode = "I#I##I";
		
		if(getCode(e.getInventory().getMatrix()).equals(ironPickCode)) {
			e.getInventory().setResult(new ItemStack(Material.IRON_PICKAXE));
		}
		
		
	}
	
	@EventHandler
	public void onInvCustomClik(InventoryClickEvent e) {

		// Only applies to crafting table result slot and player inv result slot
		if(e.getSlotType().equals(SlotType.RESULT) 
				&& e.getClickedInventory() instanceof CraftingInventory) {
			
			CraftingInventory craftInv = (CraftingInventory) e.getClickedInventory();
			
			// Is there a custom recipe here? (is there a result but no registered recipe)
			if(craftInv.getResult()!=null && craftInv.getRecipe()==null) {
				
				if(e.getClick().isShiftClick()) {
					Bukkit.broadcastMessage(e.getSlot()+" on Shift");
					e.setCancelled(true);
				} else if(e.getClick().isLeftClick() || e.getClick().isRightClick()) {
					Bukkit.broadcastMessage(e.getSlot()+" on Normal");
					
					
					WorldUtilities.getInstance().getServer().getScheduler().scheduleSyncDelayedTask(
							WorldUtilities.getInstance(), new Runnable() {
						  @Override
						  public void run() {
							  
							  consumeItems(craftInv.getMatrix());
							  
						    for (HumanEntity he : craftInv.getViewers()) {
						    	if(he instanceof Player) {
								      Player p = (Player) he;
								      p.updateInventory();
						    	}
						    }
						  }
							}, 1L);
					
					
				} else {
					Bukkit.broadcastMessage(ChatColor.RED+"ERROR! MISSED SOMETHING!");
				}
				
			}
			
		}
		
	}
		
	private void consumeItems(ItemStack[] ingredients) {
		
		for(ItemStack item : ingredients) {
			if(item!=null && item.getAmount()>1) {
				item.setAmount(item.getAmount()-1);
			}
		}
		
	}
	
	
	
	 */
	
	
}
