package NancyDrew;

import java.util.Arrays;

public class Drawing {
    private int height;
    private int length;
    char [][] picture;

    public Drawing(int height, int length, char symbol) {
        picture = new char[height][length];
        this.height = height;
        this.length = length;
        for (int i = 0;i < height; i++)
            Arrays.fill(picture[i],symbol);
    }

    public void print() {
        for (char[] a : picture) {
            for (char b : a) {
                System.out.print(b);
                System.out.print(' ');
            }
            System.out.println('\b');
        }
    }

    public void setPoint(int x, int y, char symbol) {
        picture[y-1][x-1] = symbol;
    }

    public void drawVerticalLine(int row, int top, int bottom, char symbol) {
        for (int i = top - 1; i < bottom; i++)
            picture[i][row-1] = symbol;
    }

    public void drawHorizontalLine(int line, int lefty, int righty, char symbol) {
        for (int i = lefty - 1; i < righty; i++)
            picture[line-1][i] = symbol;
    }

    public void drawRectangle(int ax, int ay, int bx, int by, char symbol) {
        drawHorizontalLine(ay, ax, bx, symbol);
        drawHorizontalLine(by,ax,bx,symbol);
        drawVerticalLine(ax, ay, by, symbol);
        drawVerticalLine(bx, ay, by, symbol);
    }

    public void drawCircle(int x, int y, int r, char symbol) {
        int rx = 0;
        int ry = 0;

        for (int i = 0; i < height; i++) {
            for (int k = 0; k < length; k++) {
                rx = x-1-k;
                ry = y-1-i;
                if ((rx)*(rx)+(ry)*(ry) <= r*r)
                    picture[i][k] = symbol;
            }
        }
    }

    public void draw(int x, int y, Drawing d) {
        int lx;
        int ly;
        if ((d.length + x - 1) > this.length)
            lx = this.length+1;
        else
            lx = d.length + x;

        if ((d.height + y - 1) > this.height)
            ly = this.height+1;
        else
            ly = d.height + y;

        for (int i = x-1; i < lx-1; i++) {
            for (int k = y-1; k < ly-1; k++) {
                this.picture[k][i] = d.picture[k-y+1][i-x+1];
            }
        }
    }


}
