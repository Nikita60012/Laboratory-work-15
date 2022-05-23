import java.util.Scanner;
import java.lang.String;
enum Sizes{
/*     String getDiscription() {
        return "Взрослый размер";
        }*/
    int[] euroSize = {32,34,36,38,40};
    XXS, XS, S, M, L;

}

interface  MenClothes{
    void dressM();
    }

    interface WomenClothes{
    void dressW();
    }

    abstract class Clothes{
    public String sizeCl;
    public double costCl;
    public String colorCl;
    }

public class MyProgram {
    public static void main(String[] args){
        String[] allClothes = {"Футболка", "Штаны", "Юбка", "Галстук"};
        Atelier atelier = new Atelier(allClothes);
        Scanner in = new Scanner(System.in);
        switch (in.nextInt()) {
            case 1 -> atelier.dressAMan();
            case 2 -> atelier.dressAWoman();
        }
    }
}
class T_shirt extends Clothes implements MenClothes,WomenClothes{
    @Override
    public void dressM() {

    }

    @Override
    public void dressW() {

    }
}
class Trousers extends Clothes implements MenClothes,WomenClothes{
    @Override
    public void dressM() {

    }

    @Override
    public void dressW() {

    }
}
class Skirt extends Clothes implements WomenClothes{
    @Override
    public void dressW() {

    }
}
class Tie extends Clothes implements MenClothes{
    @Override
    public void dressM() {

    }
}
class Atelier{
    String[] allClothes;
    Atelier(String[] allClothes){
        this.allClothes = allClothes;
    }
    public void dressAMan(){
        T_shirt t_shirt = new T_shirt();
        t_shirt.dressM();
        Trousers trousers = new Trousers();
        trousers.dressM();
        Tie tie = new Tie();
        tie.dressM();
    }
    public void dressAWoman(){
        T_shirt t_shirt = new T_shirt();
        t_shirt.dressW();
        Trousers trousers = new Trousers();
        trousers.dressW();
        Skirt skirt = new Skirt();
        skirt.dressW();
    }
}
