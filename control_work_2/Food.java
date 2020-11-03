package control_work_2;

import java.util.DoubleSummaryStatistics;

public class Food {
    private String type;
    private String name;
    private int price;
    private String measure;
    private int amount;
    private String composition;
    private int num;

    public Food(String type, String name, int price, String measure, int amount, String composition, int num) {
        this.type = type;
        this.name = name;
        this.price = price;
        this.measure = measure;
        this.amount = amount;
        this.composition = composition;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void get_info() {
        System.out.println("=====================");
        System.out.println("Тип товара: " + type);
        System.out.println("Наименование: " + name);
        System.out.println("Цена: " + price);
        System.out.println("Количество: " + amount + measure);
        System.out.println("Состав: " + composition);
        System.out.println("=====================");
    }

    public String getType() {
        return this.type;
    }

    public int getNum() {
        return this.num;
    }

    public int getPrice() {
        return price;
    }

    public void get_to_menu() {
        System.out.println(name + "(" + amount + measure + ")" + ": " + price + " |" + composition + "|");

    }

    public void setNum(int i) {
        num += i;
    }
}
