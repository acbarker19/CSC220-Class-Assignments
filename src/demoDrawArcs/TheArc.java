/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoDrawArcs;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author barkera2020
 */
public class TheArc {
    
    private Integer over, down, width, height, startAngle, arcAngle;
    
    public TheArc(Integer over, Integer down, Integer width, Integer height,
            Integer startAngle, Integer arcAngle){
        this.over = over;
        this.down = down;
        this.width = width;
        this.height = height;
        this.startAngle = startAngle;
        this.arcAngle = arcAngle;
    }
    
    public void draw(Graphics g){
        g.setColor(Color.PINK);
        g.fillArc(over, down, width, height, startAngle, arcAngle);
    }
    
}
