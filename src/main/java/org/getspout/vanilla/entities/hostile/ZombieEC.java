package org.getspout.vanilla.entities.hostile;

import org.getspout.api.metadata.MetadataStringValue;
import org.getspout.vanilla.entities.HostileEC;
import org.getspout.vanilla.entities.LandEC;
import org.getspout.vanilla.mobs.MobID;

public class ZombieEC extends LandEC implements HostileEC {
	@Override
	public void onAttached() {
		super.onAttached();
		parent.setMetadata("MobID", new MetadataStringValue(MobID.Zombie.id));
	}

	@Override
	public void onTick(float dt) {
		super.onTick(dt);
	}

}
