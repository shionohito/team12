import greenfoot.*;

public class ResultScreen extends World {
    public ResultScreen(int remainingTime) {    
        super(600, 400, 1);
        setBackground("./images/classroom.jpg"); // 結果画面の背景画像
        showText("ゲーム終了！", 300, 150);
        showText("残り時間: " + remainingTime + " 秒", 300, 200);
        showText("スペースキーでタイトルへ", 300, 300);
    }

    public void act() {
        if (Greenfoot.isKeyDown("space")) {
            Greenfoot.setWorld(new StartScreen()); // タイトル画面に戻る
        }
    }
}