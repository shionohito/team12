import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class classroom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class classroom extends World
{

    /**
     * Constructor for objects of class classroom.
     * 
     */
    public classroom()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 500, 1); 
        addObject( new human(), 300, 420 );

        addObject( new teacher1(), 100, 420 );
        getBackground().scale( 600, 500 );

        getBackground().scale(getWidth(), getHeight() );
    }
}
