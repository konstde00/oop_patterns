package com.konstde00.oop_patterns.structural.composite;

import java.awt.*;

public interface Shape {
    int getX();
    int getY();
    int getWidth();
    int getHeight();
    void move(int x, int y);
    Boolean isInsideBounds(int x, int y);
    void select();
    void unSelect();
    Boolean isSelected();
    void paint(Graphics graphics);
}
