public class Linguagem {

    protected String nome;
    protected int numFalantes;
    protected String regioesFaladas;
    protected String ordemDasPalavras;

    public void getInfo(){
        System.out.println( nome + " é o idioma falado por " + numFalantes + " pessoas principalmente em " + regioesFaladas + "a ordem é" + ordemDasPalavras );
    }

    public Linguagem(String nome, int numFalantes, String regioesFaladas, String ordemDasPalavras){
        this.nome = nome;
        this.numFalantes = numFalantes;
        this.regioesFaladas = regioesFaladas;
        this.ordemDasPalavras = ordemDasPalavras;
    }
    public static void main(String[] args) {
        Linguagem espanhol = new Linguagem("Espanhol", 538000000, "América do Sul", "verbo-objeto-sujeito"  );
        espanhol.getInfo();
        Mayan iucateco = new Mayan("iucateco", 800000);
        iucateco.getInfo();
        SinoTibetan tibetano = new SinoTibetan( "Tibetano" , 1500000000);
        tibetano.getInfo();
    }
    
}