class SinoTibetan extends Linguagem {


    public SinoTibetan (String nome, int numFalantes){
        super(nome, numFalantes, " Asia ", " sujeito-objeto-verbo " );
        if(this.nome.contains("tibetano")){
            ordemDasPalavras = " sujeito-verbo-objeto ";
        }
    }
    @Override
    public void getInfo(){
        System.out.println( nome + " é falado por " + numFalantes + " pessoas, principalmente em " + regioesFaladas + "A linguagem segue a ordem das palavras "  );

    }
}