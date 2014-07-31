package allout58.mods.bigfactories;

import allout58.mods.bigfactories.lib.ModInfo;
import allout58.mods.bigfactories.proxy.ISidedProxy;
import allout58.mods.bigfactories.util.LogHelper;
import allout58.mods.bigfactories.util.VersionChecker;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.MinecraftForge;

/**
 * Created by James Hollowell on 7/31/2014.
 */

@Mod(modid = ModInfo.MOD_ID, name = ModInfo.MOD_NAME, version = "@VERSION@")
public class BigFactories
{
    public static String version = "@VERSION@";

    @SidedProxy(clientSide = "allout58.mods.bigfactories.proxy.ClientProxy", serverSide = "allout58.mods.bigfactories.proxy.ServerProxy")
    public static ISidedProxy proxy;

    @Mod.Instance(ModInfo.MOD_ID)
    public static BigFactories instance;

    @Mod.EventHandler
    public void pre(FMLPreInitializationEvent event)
    {
        LogHelper.init(event.getModLog());
        VersionChecker.execute();

        /*--------------- Register Events ---------------- */
        MinecraftForge.EVENT_BUS.register(VersionChecker.instance);
    }

    static
    {
        if (version.contains("VERSION"))
            version = "1.0.0-rev1";//Hardcode if in dev environment
    }
}
