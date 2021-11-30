package pl.wipb.ztp.chess;

import java.awt.*;

public interface InterfacePiece {
    public void draw(Graphics2D g);
    public int getX();
    public int getY();
    public void moveTo(int xx, int yy);
    public InterfacePiece UnDecorate();
}
