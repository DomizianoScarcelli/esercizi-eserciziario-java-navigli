package Eserciziario.es213;

public class VagoneLetto extends Vagone{

    public VagoneLetto(){
        super(10);
    }

    @Override
    public void occupa(Passeggero passeggero){
        try {
            if (super.getElencoPasseggeri().size() >= super.getPOSTI_LIBERI()) throw new postiNonDisponibiliException();
            else if (!(passeggero instanceof PasseggeroAssonnato)) throw new passeggeroNonAmmessoException();
            else {
                super.getElencoPasseggeri().add(passeggero);
                System.out.println("Passeggero" + passeggero.getNome() + "registrato");
            }
        } catch (postiNonDisponibiliException e) {
            e.printStackTrace();
        } catch (passeggeroNonAmmessoException s){
            s.printStackTrace();
        }
    }

    @Override
    public String toString(){
        return "VagoneLetto";
    }
}
