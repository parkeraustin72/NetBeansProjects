package com.mycompany.gametutorial;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Random;
import static javafx.scene.paint.Color.color;

public class Player extends GameObject {

    Random r = new Random();
    Handler handler;

    public Player(int x, int y, ID id, Handler handler) {
        super(x, y, id);
        this.handler = handler;

    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, 32, 32);
    }

    public void tick() {
        x += velX;
        y += velY;

        x = Game.clamp(x, 0, Game.WIDTH - 38);
        y = Game.clamp(y, 0, Game.HEIGHT - 61);
        
        handler.addObject(new Trail(x + 2, y + 2, ID.Trail, Color.white, 28, 28, 0.05f, handler));
        
        collision();
    }
    private void collision(){
        for( int i = 0; i < handler.object.size(); i++){
            GameObject tempObject = handler.object.get(i);
            if(tempObject.getID()== ID.BasicEnemy || tempObject.getID() == ID.FastEnemy){
                
                if(getBounds().intersects(tempObject.getBounds())){
                    // Collision detection code
                    HUD.HEALTH -=2;
                }
            }
        }
    }

    public void render(Graphics g) {

        g.setColor(Color.white);
        g.fillRect(x, y, 32, 32);
    }

}
