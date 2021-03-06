package org.getspout.vanilla.entities.neutral;

import org.getspout.api.metadata.MetadataStringValue;
import org.getspout.vanilla.entities.LandEC;
import org.getspout.vanilla.entities.NeutralEC;
import org.getspout.vanilla.mobs.MobID;

public class WolfEC extends LandEC implements NeutralEC {
	@Override
	public void onAttached() {
		super.onAttached();
		parent.setMetadata("MobID", new MetadataStringValue(MobID.Wolf.id));
	}

	@Override
	public void onTick(float dt) {
		super.onTick(dt);
	}

}
