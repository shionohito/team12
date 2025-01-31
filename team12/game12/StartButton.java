import greenfoot.*;

public class StartButton extends Actor {
    public StartButton() {
        setImage("start_button.png"); // ボタンの画像を設定
        getImage().scale(50,50);
    }

    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new Classroom()); // Classroom に遷移
        }
    }
}