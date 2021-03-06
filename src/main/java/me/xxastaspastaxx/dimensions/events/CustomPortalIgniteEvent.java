package me.xxastaspastaxx.dimensions.events;

import org.bukkit.entity.Entity;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.event.block.BlockIgniteEvent.IgniteCause;
import org.bukkit.inventory.ItemStack;

import me.xxastaspastaxx.dimensions.portal.CompletePortal;

public class CustomPortalIgniteEvent extends Event implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    
    private boolean cancelled;
    
    CompletePortal complete;
    IgniteCause cause;
    Entity entity;
    boolean load;
    
    ItemStack lighter;
    
    public CustomPortalIgniteEvent(CompletePortal complete, IgniteCause cause, Entity entity, boolean load, ItemStack lighter) {
    	this.complete=complete;
    	this.cause = cause;
    	this.entity = entity;
    	this.load = load;
    	this.lighter = lighter;
    }
    
    public CompletePortal getPortal() {
    	return complete;
    }
    
    public IgniteCause getCause() {
    	return cause;
    }
    
    public Entity getEntity() {
    	return entity;
    }
    
    public boolean isLoading() {
    	return load;
    }
    
    public ItemStack getLighter() {
    	return lighter;
    }
    
    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancel) {
        cancelled = cancel;
    }

    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
