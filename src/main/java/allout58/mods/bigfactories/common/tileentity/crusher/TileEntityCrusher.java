package allout58.mods.bigfactories.common.tileentity.crusher;

import allout58.mods.bigfactories.common.tileentity.interfaces.IFacing;
import allout58.mods.bigfactories.common.tileentity.interfaces.IMBMaster;
import allout58.mods.bigfactories.common.tileentity.interfaces.IMBSlave;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.ForgeDirection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by James Hollowell on 8/1/2014.
 */
public class TileEntityCrusher extends TileEntity implements IMBMaster, IFacing
{
    private boolean isFormed=false;
    private List<IMBSlave> slaveList=new ArrayList<IMBSlave>();

    private int facing= ForgeDirection.UP.ordinal();

    @Override
    public void reset()
    {
        isFormed=false;
    }

    @Override
    public int getFacing()
    {
        return facing;
    }

    @Override
    public ForgeDirection getForgeFacing()
    {
        return ForgeDirection.getOrientation(facing);
    }

    @Override
    public void setFacing(int facing)
    {
        this.facing=facing;
    }

    @Override
    public void setFacing(ForgeDirection facing)
    {
        this.facing=facing.ordinal();
    }
}
