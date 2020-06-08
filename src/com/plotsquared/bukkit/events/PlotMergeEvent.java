package com.plotsquared.bukkit.events;

import com.intellectualcrafters.plot.object.Plot;
import com.intellectualcrafters.plot.object.PlotId;
import org.bukkit.World;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;

import java.util.ArrayList;

public class PlotMergeEvent extends PlotEvent implements Cancellable {

    private static final HandlerList handlers = new HandlerList();
    private final int dir;
    private final int max;
    private final World world;
    private boolean cancelled;

    /**
     * PlotMergeEvent: Called when plots are merged
     *
     * @param world World in which the event occurred
     * @param plot  Plot that was merged
     * @param dir   The direction of the merge
     * @param max   Max merge size
     */
    public PlotMergeEvent(World world, Plot plot, final int dir, final int max) {
        super(plot);
        this.world = world;
        this.dir = dir;
        this.max = max;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public int getDir() {
        return this.dir;
    }

    public int getMax() {
        return this.max;
    }

    public World getWorld() {
        return this.world;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    @Override
    public void setCancelled(boolean b) {
        this.cancelled = b;
    }
}
