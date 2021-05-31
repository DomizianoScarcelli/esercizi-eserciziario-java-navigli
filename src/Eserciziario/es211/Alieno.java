package Eserciziario.es211;

public class Alieno extends Nemico{
    @Override
    public void prossimoPasso() {
        super.x--;
    }

    @Override
    public int getX() {
        return super.getX();
    }

    @Override
    public int getY() {
        return super.getY();
    }

    @Override
    public String toString(){
        return "M";
    }
}
