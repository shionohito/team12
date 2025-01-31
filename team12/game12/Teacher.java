import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Teacher extends Actor {
    public Teacher() {
        setImage("teacher.png"); // Actorの画像を設定
         getImage().scale(50,50);
    }
 
    public void act() {
        move(5); // ゆっくり移動
        if (Greenfoot.getRandomNumber(100) < 5) {
            turn(Greenfoot.getRandomNumber(90) - 45); // ランダムに方向転換
        }
        if (isAtEdge()) {
            turn(180); // 画面端で反転
        }
    }
   
}
