package modelo;

public class Pet {

    private String nome;
    private int anoNascimento;
    private String especie;
    private String raca;

    private Proprietario proprietario;

    public Pet(){

    }

    public Pet(String nome, Proprietario proprietario,int anoNascimento,String especie, String raca){
        setNome(nome);
        setProprietario(proprietario);
        setAnoNascimento(anoNascimento);
        setEspecie(especie);
        setRaca(raca);
    }

    // permissão de escrita no atributo.
    public void setNome(String nome) {
        this.nome = nome;
    }

    // permissão de leitura no atributo.
    public String getNome(){
        return this.nome;
    }

    // permissão de escrita no atributo.
    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
        this.proprietario.addPet(this);
    }

    // permissão de leitura no atributo.
    public Proprietario getProprietario(){
        return this.proprietario;
    }

    // permissão de escrita no atributo.
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    // permissão de leitura no atributo.
    public int getAnoNascimento(){
        return this.anoNascimento;
    }

    // permissão de escrita no atributo.
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    // permissão de leitura no atributo.
    public String getEspecie(){
        return this.especie;
    }

    // permissão de escrita no atributo.
    public void setRaca(String raca) {
        this.raca = raca;
    }

    // permissão de leitura no atributo.
    public String getRaca(){
        return this.raca;
    }

    public int getIdade(){
        return 2024 - this.anoNascimento;
    }

}
