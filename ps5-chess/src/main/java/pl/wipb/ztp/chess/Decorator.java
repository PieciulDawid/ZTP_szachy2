package pl.wipb.ztp.chess;

import java.awt.*;
import java.awt.geom.AffineTransform;

public class Decorator  implements InterfacePiece{

    public InterfacePiece piece;
    private AffineTransform tr;

    public Decorator(InterfacePiece piece, AffineTransform tr)
    {
        this.piece = piece;
        this.tr = tr;
    }

    @Override
    public void draw(Graphics2D g) {
        if(this.piece==null){
            return;
        }
        AffineTransform tmp = g.getTransform();
        g.transform(tr);
        piece.draw((g));
        g.setTransform(tmp);
    }

    @Override
    public int getX() {
        return piece.getX();
    }

    @Override
    public int getY() {
        return piece.getY();
    }

    @Override
    public void moveTo(int xx, int yy) {
        piece.moveTo(xx,yy);
    }

    public InterfacePiece UnDecorate(){
        return piece;
    }
}
