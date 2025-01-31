import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class human here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class notebook extends Actor {
    public notebook() {
        setImage("notebook.png"); // Actorの画像を設定
        getImage().scale(100,100);
    }

    public void act() {
        move(5); // 移動
        if (Greenfoot.getRandomNumber(100) < 10) {
            turn(Greenfoot.getRandomNumber(90) - 45); // ランダムに方向転換
        }
        if (isAtEdge()) {
            turn(180); // 画面端で反転
        }
    }
}
