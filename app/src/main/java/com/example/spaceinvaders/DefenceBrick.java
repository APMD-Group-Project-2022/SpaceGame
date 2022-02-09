package com.example.spaceinvaders;

import android.graphics.RectF;

public class DefenceBrick {

    private RectF rect;

    private boolean isVisible;

    // the constructor the width and height are initialised based on the screen resolution as are all our other game objects
//    public DefenceBrick(int row, int column, int shelterNumber, int screenX, int screenY){
            public DefenceBrick(int row, int column, int shelterNumber, int screenX, int screenY){

        int width = screenX / 90;
        int height = screenY / 40;

        isVisible = true;

        // initialise a brickPadding variable to 1
        int brickPadding = 1;
        // shelterPadding to one-ninth of the screen width
        int shelterPadding = screenX / 9;
        // startHeight for the first brick of each shelter.
        int startHeight = screenY - (screenY /8 * 2);

        rect = new RectF(column * width + brickPadding +
        (shelterPadding * shelterNumber) +
        shelterPadding + shelterPadding * shelterNumber,
        row * height + brickPadding + startHeight,
        column * width + width - brickPadding +
        (shelterPadding * shelterNumber) +
        shelterPadding + shelterPadding * shelterNumber,
        row * height + height - brickPadding + startHeight);
        }

    //      Methods for getters and setters
    //      get the rect object
    public RectF getRect(){
        return this.rect;
    }
    //      set the object invisible when destroyed
    public void setInvisible(){
        isVisible = false;
    }
    //    current state of visibility
    public boolean getVisibility(){
        return isVisible;
    }
}