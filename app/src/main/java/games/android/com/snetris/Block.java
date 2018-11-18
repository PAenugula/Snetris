package games.android.com.snetris;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/**
 * Created by paen3 on 11/17/2018.
 */

public class Block implements GameObject {

    private Rect rectangle;
    private int color;

    public Block(int blockH, int color, int startX, int startY){
        this.color = color;
        rectangle = new Rect(0, startY, startX, startY+blockH);
    }

    public Rect getRectangle(){
        return rectangle;
    }

    public void incrementY(float y){
        rectangle.top += y;
        rectangle.bottom += y;
    }
    public void incrementX(float x){
        rectangle.left += x;
        rectangle.right += x;

    }
    public Boolean appleCollide(Apple apple){
        return Rect.intersects(rectangle,apple.getRectangle());

    }

    @Override
    public void draw(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(color);
        canvas.drawRect(rectangle);
    }
}
