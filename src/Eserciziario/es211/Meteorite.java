package Eserciziario.es211;

public class Meteorite extends Nemico{
    @Override
    public void prossimoPasso() {
        super.y++;
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
