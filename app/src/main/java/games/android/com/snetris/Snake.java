package games.android.com.snetris;

import java.util.ArrayList;

/**
 * Created by paen3 on 11/17/2018.
 */

public class Snake {

    private ArrayList<Block> snake;
    private int blockH;
    private int color;

    private long startTime;

    public Snake(int blockH, int color){
        this.blockH = blockH;
        this.color = color;

        startTime = System.currentTimeMillis();


    }
    public void update(){

        int elapsedTime = (int)(System.currentTimeMillis() - startTime);
        startTime = System.currentTimeMillis();
        float speed = Constants.SCREEN_HEIGHT/10000.0f;
        for(Block ob: ){
            ob.incrementY(speed*elapsedTime);

        }
        if(obstacles.get(obstacles.size()-1).getRectangle().top >= Constants.SCREEN_HEIGHT){
            int xStart = (int)(Math.random()*(Constants.SCREEN_WIDTH - playerGap));
            obstacles.add(0, new Obstacle(obstacleHeight,color, xStart,obstacles.get(0).getRectangle().top - obstacleHeight-obstacleGap, playerGap ));
            obstacles.remove(obstacles.size()-1);
        }


    }

}
