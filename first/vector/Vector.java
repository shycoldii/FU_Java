package vector;

import java.util.Arrays;

public class Vector {
    private double x;
    private double y;
    private double z;

    /**
     *
     * @param x - первая координата
     * @param y - вторая координата
     * @param z - третья координата
     */

    public Vector(double x,double y,double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double lenghtVector(){
        return Math.sqrt(x*x+y*y+z*z);
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getZ() {
        return z;
    }

    public static double scalar_vectors(Vector first_vector, Vector second_vector){
        return first_vector.getX()*second_vector.getX()+first_vector.getY()*second_vector.getY()+
                first_vector.getZ()*second_vector.getZ();
    }


    public static Vector standart_actions(Vector first_vector, Vector second_vector, int flag){
        switch(flag){
            case 1:
                String sum_1 = Double.toString(first_vector.getX()+second_vector.getX());
                String sum_2 = Double.toString(first_vector.getY()+ second_vector.getY());
                String sum_3 = Double.toString(first_vector.getZ()+ second_vector.getZ());
                System.out.println("f) Сумма векторов равна: (" + sum_1 + ", " + sum_2 + ", " + sum_3 + ")");
                return new Vector(first_vector.getX()+second_vector.getX(),
                        first_vector.getY()+ second_vector.getY(),
                        first_vector.getZ()+ second_vector.getZ());
            case 2:
                String sub_1 = Double.toString(first_vector.getX()- second_vector.getX());
                String sub_2 = Double.toString(first_vector.getY()- second_vector.getY());
                String sub_3 = Double.toString(first_vector.getZ()-  second_vector.getZ());
                System.out.println("f) Разность векторов равна: ("+sub_1 +", "+sub_2+", "+sub_3+")");
                return new Vector(first_vector.getX()- second_vector.getX(),
                        first_vector.getY()- second_vector.getY(),
                        first_vector.getZ()-  second_vector.getZ());
            case 3:
                String m_1 = Double.toString(first_vector.getY()* second_vector.getZ()- first_vector.getZ()* second_vector.getY());
                String m_2 = Double.toString(first_vector.getZ()* second_vector.getX()- first_vector.getX()* second_vector.getZ());
                String m_3 = Double.toString(first_vector.getX()* second_vector.getY()- first_vector.getY()* second_vector.getX());
                System.out.println("d) Векторное произведение векторов: ("+m_1+", "+m_2+", "+m_3+")");
                return new Vector(first_vector.getY()* second_vector.getZ()- first_vector.getZ()* second_vector.getY(),
                        first_vector.getZ()* second_vector.getX()- first_vector.getX()* second_vector.getZ(),
                        first_vector.getX()* second_vector.getY()- first_vector.getY()* second_vector.getX());
            default:
                return new Vector(0,0,0);
        }


    }
    public static Vector[] vectors(int n){
        Vector[] vectors = new Vector[n];
        for (int i = 0; i<n; i++){
            vectors[i] = new Vector(Math.random(),Math.random(),Math.random());
        }
        return vectors;
    }
    public static void print_vectors(Vector[] vectors){
        System.out.println("Созданные вектора с заданным размером n");
        for (int i= 0; i< vectors.length; i++){
            System.out.println("x: "+vectors[i].getX()+"; y: "+vectors[i].getY()+"; z: "+vectors[i].getZ());
        }
    }
}

