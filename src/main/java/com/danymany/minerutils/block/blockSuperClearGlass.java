package com.danymany.minerutils.block;

public class blockSuperClearGlass extends blockMU
{
    public blockSuperClearGlass()
    {
        super();
        this.setBlockName("blockSuperClearGlass");
        this.setBlockTextureName("minerutils:blockSuperClearGlass");
    }

    public boolean isOpaqueCube()
    {
        return false;
    }
}
