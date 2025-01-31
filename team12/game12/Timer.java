import greenfoot.*;

public class Timer extends Actor {
    private int timeLeft;
    private int frameCounter;

    public Timer() {
        timeLeft = 20; // 制限時間を 20 秒に設定
        frameCounter = 0;
        updateImage();
    }

    public void act() {
        frameCounter++;
        if (frameCounter >= 60) { // 60フレームごとに1秒減らす
            timeLeft--;
            frameCounter = 0;
            updateImage();
        }

        if (timeLeft <= 0) {
            Greenfoot.setWorld(new ResultScreen(timeLeft)); // 残り時間を渡して結果画面へ
        }
    }

    private void updateImage() {
        setImage(new GreenfootImage("Time: " + timeLeft, 24, Color.WHITE, Color.BLACK));
    }

    public int getTimeLeft() {
        return timeLeft;
    }
}