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
<<<<<<< HEAD
        super(600, 400, 1); 
        addObject( new human(), 300, 200 );
=======
        super(600, 500, 1); 
        addObject( new human(), 300, 420 );
        getBackground().scale( 600, 500 );
>>>>>>> 52a108f931e42b5de14703e7efb40c63a49b8adf
    }
}
