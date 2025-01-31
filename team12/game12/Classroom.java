import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Classroom extends World {
    private Timer timer;
    private int score;
    public Classroom() {    
        super(600, 400, 1); // ウィンドウサイズを600x400に設定
        setBackground("./images/classroom.jpg"); // 背景画像（例: classroom.png）
      
        // Actorを配置
        addObject(new student(), 250, 300);
        addObject(new notebook(), 50, 100);
        addObject(new Teacher(), 400, 100);

        timer = new Timer();
        addObject(timer,50,50);
        score = 0;
    }
     public void act() {
        if (score >= 10) { // クリア条件（例：スコアが50以上）
           
        }
    }

    public void addScore(int points) {
        score += points;
    }
    }  
    
    

