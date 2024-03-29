package com.mycompany.gametutorial;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class FastEnemy extends GameObject {
    private Handler handler;

    public FastEnemy(int x, int y, ID id, Handler handler) {
        super(x, y, id);
        velX = 2;
        velY = 9;
        this.handler = handler;
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, 16, 16);
    }

    public void tick() {
        x += velX;
        y += velY;

        if (y <= 0 || y >= Game.HEIGHT - 32) {
            velY *= -1;
        }
        if (x <= 0 || x >= Game.HEIGHT - 16) {
            velX *= -1;
        }
        handler.addObject(new Trail(x, y, ID.Trail, Color.CYAN, 16, 16, 0.02f, handler));
    }

    public void render(Graphics g) {
        g.setColor(Color.CYAN);
        g.fillRect(x, y, 16, 16);
    }

}
