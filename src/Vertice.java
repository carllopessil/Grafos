import java.util.ArrayList;

public class Vertice<TIPO> {
    private TIPO dado;
    private ArrayList<Aresta<TIPO>> arestasEntrada;
    private ArrayList<Aresta<TIPO>> arestasSaida;

    public Vertice (TIPO valor){
        this.dado=valor;
        this.arestasEntrada = new ArrayList<Aresta<TIPO>>();
        this.arestasSaida = new ArrayList<Aresta<TIPO>>();
    }

    public TIPO getDado() {
        return dado;
    }

    public void setDado(TIPO dado) {
        this.dado = dado;
    }

    public ArrayList<Aresta<TIPO>> getArestasEntrada() {
        return arestasEntrada;
    }

    public void setArestasEntrada(ArrayList<Aresta<TIPO>> arestasEntrada) {
        this.arestasEntrada = arestasEntrada;
    }

    public ArrayList<Aresta<TIPO>> getArestaSaida() {
        return arestasSaida;
    }

    public void setArestaSaida(ArrayList<Aresta<TIPO>> arestaSaida) {
        this.arestasSaida = arestaSaida;
    }
    public void adicionarArestaSaida(Aresta<TIPO> aresta){
        this.arestasSaida.add(aresta);
    }
    public void adicionarArestaEntrada(Aresta<TIPO> aresta){
        this.arestasSaida.add(aresta);
    }
}
