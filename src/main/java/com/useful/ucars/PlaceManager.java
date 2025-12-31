package com.useful.ucars;

import java.util.List;

public class PlaceManager {
	public static Boolean placeableOn(String materialName, byte data) {
		Boolean placeable = false;
		if (!UCars.config.getBoolean("general.cars.roadBlocks.enable")) {
			return true;
		}
		List<String> rBlocks = UCars.config
				.getStringList("general.cars.roadBlocks.ids");
		for (String raw : rBlocks) {
			if (ItemStackFromId.equals(raw, materialName, data)) {
				placeable = true; // Placing on a road block
			}
		}
		return placeable;
	}

}
