package es211;

public class Sparatutto {
    private String[][] sfondo;

    public Sparatutto(Navicella navicella, Nemico... nemici){
        this.sfondo = new String[10][5];
        for (int y = 0; y < sfondo.length; y++){
            for (int x = 0; x < sfondo[0].length; x++){
                this.sfondo[y][x] = " ";
            }
        }
        for (int i = 0; i < 3; i++){
            int randY = (int)Math.round(Math.random() * sfondo.length-1);
            int randX = (int) Math.round(Math.random() * sfondo[0].length-1);
            this.sfondo[randY][randX] = "*";
        }
        this.sfondo[navicella.getY()][navicella.getY()] = navicella.toString();
        for (Nemico nemico : nemici){
            this.sfondo[nemico.getY()][nemico.getX()] = nemico.toString();
        }

        if (navicella.getStato()){
            for (int s = 0; s < sfondo[0].length - navicella.getX(); s++){
                this.sfondo[navicella.getY()][s] = "-";
            }
        }


    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        for (int y = 0; y < sfondo.length; y++){
            stringBuilder.append("\n");
            for (int x = 0; x < sfondo[0].length; x++){
                stringBuilder.append(sfondo[y][x]);
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args){
        Navicella navicella = new Navicella();
        Nemico meteorite = new Meteorite();
        Nemico alieno = new Alieno();
        navicella.setStato(true);
        Sparatutto sfondo = new Sparatutto(navicella, meteorite, alieno);
        System.out.println(sfondo);
    }

}
