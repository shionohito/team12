
import greenfoot.*;
 
public class StartScreen extends World {
    public static void main(String[] args) {
        Greenfoot.setWorld(new StartScreen()); // 最初に StartScreen を開く
    }
    
    public StartScreen() {    
        super(600, 400, 1); // ウィンドウサイズを600x400に設定
        setBackground("./images/classroom.jpg"); // 背景画像を設定
        addObject(new StartButton(), 300, 80); // スタートボタンを画面中央に追加
    }
  
}
