import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class noteboiok here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class student extends Actor
{
 
      public student() {
        
        setImage("student.png"); // Actorの画像を設定
         getImage().scale(50,50);
    }
    /**
     * Act - do whatever the noteboiok wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("right")){
           setLocation(getX()+4, getY()); 
            
        }
        if(Greenfoot.isKeyDown("left")){
            setLocation(getX()-4, getY()); // left
          
        }
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX(), getY()-4); // up
           
        }
        if(Greenfoot.isKeyDown("down")){
            setLocation(getX(), getY()+4); // down
           
        }
       
        Actor teacher = getOneIntersectingObject( Teacher.class);
        Actor notebook = getOneIntersectingObject( notebook.class);
        Timer timer = (Timer) getWorld().getObjects(Timer.class).get(0); // Timerを取得
       
        if( teacher != null ){
            
             Greenfoot.setWorld(new ResultScreen(timer.getTimeLeft())); // 残り時間を渡す
            }else if ( notebook != null){
             Greenfoot.setWorld(new ResultScreen(timer.getTimeLeft())); // 残り時間を渡す
            }
    }    
      
  
}
