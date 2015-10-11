package trixmot.trixmotmod1.proxy;

import trixmot.trixmotmod1.Mod1Blocks;
import trixmot.trixmotmod1.init.mod1Items;

public class ClientProxy extends CommonProxy{

	@Override
	public void registerRenders() {
		Mod1Blocks.registerRenders();
		mod1Items.registerRenders();
	}

}
