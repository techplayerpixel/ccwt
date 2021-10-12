package me.Aryanbhai.CcWt.hurricanebow;

import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.util.Vector;


public class hurricanebow implements Listener{
	public Vector rotateVector(Vector vector, double whatAngle) {
        double sin = Math.sin(whatAngle);
        double cos = Math.cos(whatAngle);
        double x = vector.getX() * cos + vector.getZ() * sin;
        double z = vector.getX() * -sin + vector.getZ() * cos;
     
        return vector.setX(x).setZ(z);
    }
	@EventHandler
    public void onShoot(EntityShootBowEvent e) {
       
        if (!e.getBow().getItemMeta().getDisplayName().contains("§5Hurricane Bow")) {
            return;
        }
       
        if (!(e.getEntity() instanceof Player)) {
            return;
        }
       
        Arrow arrow = (Arrow) e.getProjectile();
        
        Arrow arrow1 = e.getEntity().getWorld().spawn(e.getEntity().getEyeLocation(), Arrow.class);
        arrow1.spigot().setDamage(arrow.spigot().getDamage());
        arrow1.setKnockbackStrength(2);
        arrow1.setShooter(e.getEntity());
        arrow1.setVelocity(this.rotateVector(arrow.getVelocity(), 50.0));
        
        Arrow arrow2 = e.getEntity().getWorld().spawn(e.getEntity().getEyeLocation(), Arrow.class);
        arrow2.spigot().setDamage(arrow.spigot().getDamage());
        arrow2.setKnockbackStrength(2);
        arrow2.setShooter(e.getEntity());
        arrow2.setVelocity(this.rotateVector(arrow.getVelocity(), -50.0));
       
    }
}
