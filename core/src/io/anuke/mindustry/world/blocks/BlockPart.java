package io.anuke.mindustry.world.blocks;

import io.anuke.mindustry.world.Block;
import io.anuke.mindustry.world.Tile;

/**
 * Used for multiblocks. Each block that is not the center of the multiblock is a part.
 * Think of these as delegates to the actual block; all events are passed to the target block.
 * They are made to share all properties from the linked tile/block.
 */
public class BlockPart extends Block{
    public final static int maxSize = 9;
    private final static BlockPart[][] parts = new BlockPart[maxSize][maxSize];

    private final int dx, dy;

    public BlockPart(int dx, int dy){
        super("part_" + dx + "_" + dy);
        this.dx = dx;
        this.dy = dy;
        solid = false;
        hasPower = hasItems = hasLiquids = true;
        parts[dx + maxSize/2][dy + maxSize/2] = this;
    }

    public static BlockPart get(int dx, int dy){
        if(dx == -maxSize/2 && dy == -maxSize/2) throw new IllegalArgumentException("Why are you getting a [0,0] blockpart? Stop it.");
        return parts[dx + maxSize/2][dy + maxSize/2];
    }

    @Override
    public Tile linked(Tile tile){
        return tile.getNearby(-dx, -dy);
    }

    @Override
    public void drawTeam(Tile tile){}

    @Override
    public void draw(Tile tile){}

    @Override
    public boolean synthetic(){
        return true;
    }

    @Override
    public boolean isHidden(){
        return true;
    }

    @Override
    public String toString(){
        return "BlockPart[" + dx + ", " + dy + "]";
    }


}
