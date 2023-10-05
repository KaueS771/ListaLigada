public class Main
{
    public static void main(String[] args) {
        ListaLigada lista1 = new ListaLigada();
        lista1.adicionaInicio(90);
        lista1.adicionaInicio(10);
        lista1.adicionaInicio(100);
        lista1.adicionaInicio(19);
        System.out.println(lista1.toString());
    }
}