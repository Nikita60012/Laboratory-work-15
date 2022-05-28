import java.util.Scanner;
import java.lang.String;
enum Sizes{
    XXS(32){
        @Override
        public String getDiscription() {
            return "Детский размер";
        }
    }, XS(34), S(36), M(38), L(40);
    private int euroSize;
    Sizes(int i){
        euroSize = i;
    }
    public String getDiscription() {
        return "Взрослый размер";
    }
    public String toString(){
        return name() + " (" + euroSize + ") " + getDiscription();
    }
}

interface  MenClothes{
    void dressM();
}

interface WomenClothes{
    void dressW();
}

abstract class Clothes{
    public Sizes sizeCl;
    public double costCl;
    public String colorCl;
    Clothes(Sizes size, double cost, String color){
        this.sizeCl = size;
        this.costCl = cost;
        this.colorCl = color;
    }
}

public class MyProgram {
    public static void main(String[] args){
        String[] allClothes = {"Футболка", "Штаны", "Юбка", "Галстук"};
        Atelier atelier = new Atelier(allClothes);
        System.out.println("Выберите каталог мужской или женской одежды (1 или 2)");
        Scanner in = new Scanner(System.in);
        switch (in.nextInt()) {
            case 1 -> atelier.dressAMan();
            case 2 -> atelier.dressAWoman();
        }
    }
}
class T_shirt extends Clothes implements MenClothes,WomenClothes{
    T_shirt(Sizes size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressM() {
        System.out.println("Размер: " + sizeCl + "; цена: " + costCl + "; цвет: " + colorCl);
        System.out.println();
    }

    @Override
    public void dressW() {
        System.out.println("Размер: " + sizeCl + "; цена: " + costCl + "; цвет: " + colorCl);
        System.out.println();
    }
}
class Trousers extends Clothes implements MenClothes,WomenClothes{
    Trousers(Sizes size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressM() {
        System.out.println("Размер: " + sizeCl + "; цена: " + costCl + "; цвет: " + colorCl);
        System.out.println();
    }

    @Override
    public void dressW() {
        System.out.println("Размер: " + sizeCl + "; цена: " + costCl + "; цвет: " + colorCl);
        System.out.println();
    }
}
class Skirt extends Clothes implements WomenClothes{
    Skirt(Sizes size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressW() {
        System.out.println("Размер: " + sizeCl + "; цена: " + costCl + "; цвет: " + colorCl);
        System.out.println();
    }
}
class Tie extends Clothes implements MenClothes{
    Tie(Sizes size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressM() {
        System.out.println("Размер: " + sizeCl + "; цена: " + costCl + "; цвет: " + colorCl);
        System.out.println();
    }
}
class Atelier{
    String[] allClothes;
    Atelier(String[] allClothes){
        this.allClothes = allClothes;
    }
    public void dressAMan(){
        T_shirt t_shirt = new T_shirt(Sizes.M, 2500, "Серая");
        System.out.println(allClothes[0]);
        t_shirt.dressM();
        Trousers trousers = new Trousers(Sizes.XXS, 1200, "Тёмно-синие");
        System.out.println(allClothes[1]);
        trousers.dressM();
        Tie tie = new Tie(Sizes.XS, 1000, "Чёрный");
        System.out.println(allClothes[3]);
        tie.dressM();
    }
    public void dressAWoman(){
        T_shirt t_shirt = new T_shirt(Sizes.L, 2500, "Бежевая");
        System.out.println(allClothes[0]);
        t_shirt.dressW();
        Trousers trousers = new Trousers(Sizes.S, 1500, "Синие");
        System.out.println(allClothes[1]);
        trousers.dressW();
        Skirt skirt = new Skirt(Sizes.S, 3000, "Розовая");
        System.out.println(allClothes[2]);
        skirt.dressW();
    }
}