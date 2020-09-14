package abs_figures;

import abs_figures.Shape;

class Pyramid extends Shape {

    private double s;
    private double h;

    public Pyramid(double s,double h){
        this.s = s;
        this.h = h;
    }

    @Override
    public double getVolume() {
        return h * s * 4 / 3;
    }
}
