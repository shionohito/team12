import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cafe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cafe extends World
{

    /**
     * Constructor for objects of class cafe.
     * 
     */
    public cafe()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.

        super(600, 500, 1); 
        addObject( new human(), 300, 420 );
        getBackground().scale(getWidth(), getHeight() );
    }
}
