package figures;

public class Shape {
    /**
     * Этот класс отвечает за объем. В него поступают величины из других классов.
     * Pyramid,SolidOfRevolution, Box - наследники.
     */
    private  double volume;

    public Shape(double volume){
        this.volume = volume;
    }
    public double getVolume(){
        return volume;
    }
}

