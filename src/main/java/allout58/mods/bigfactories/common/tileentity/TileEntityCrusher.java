package allout58.mods.bigfactories.common.tileentity;

import net.minecraft.tileentity.TileEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by James Hollowell on 8/1/2014.
 */
public class TileEntityCrusher extends TileEntity implements IMBMaster
{
    private boolean isFormed=false;
    private List<IMBSlave> slaveList=new ArrayList<IMBSlave>();

    @Override
    public void reset()
    {
        isFormed=false;
    }
}
