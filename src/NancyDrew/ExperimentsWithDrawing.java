package NancyDrew;

public class ExperimentsWithDrawing {
    public static void main(String[] args) {
        Drawing d = new Drawing(8,8,'⬜');
        d.drawRectangle(2,2,3,3,'◼');
        d.drawRectangle(6,2,7,3, '◼');
        d.setPoint(3,3,'⬛');
        d.setPoint(6,3,'⬛');
        Drawing b = new Drawing (4,4,'◼');
        b.setPoint(1,1,'⬜');
        b.setPoint(4,1,'⬜');
        b.drawHorizontalLine(4,2,3,'⬜');
        d.draw(3,4,b);
        d.print();
    }

}
