package committee.nova.test;

import committee.nova.test.init.ModCommon;
import net.fabricmc.api.ModInitializer;

public class ModFabric implements ModInitializer {

    @Override
    public void onInitialize() {

        new ModCommon();
    }
}
