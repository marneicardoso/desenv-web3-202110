public class Pessoa {

    // Atributos
    private int id;
    private String nome;
    private String fone;
    private int idade;
    private double peso;

    // Métodos

    // Método Construtor vazio
    public Pessoa() {

    }

    // Método Construtor com parâmetros (quantos forem necessário)
    public Pessoa(String _nome) {
        this.nome = _nome;
    }

    // Método Construtor com parâmetros (todos)
    public Pessoa(int _id, String _nome, String _fone, int _idade, double _peso) {
        this.id = _id;
        this.nome = _nome;
        this.fone = _fone;
        this.idade = _idade;
        this.peso = _peso;
    }

    public Boolean podeDirigir() {

        // Verifica se a idade é maior ou igual a 18
        if (this.idade >= 18) {
            return true; // Early return (retorno precoce)
        }

        return false;
    }

    public String votar() {

        // Verifica se a idade é maior ou igual a 16
        if (this.idade < 16) {
            return "Não pode votar";

        } else if (this.idade >= 18 && this.idade <= 65) {
            return "Deve votar";

        } else {
            return "Pode votar";
        }
    }

    // get == pegar (verbo)
    // set == atribuir (verbo) ou set == conjunto (substantivo)

    // Getters e Setters
    public int getId() {
        return this.id;
    }

    public void setId(int _id) {
        this.id = _id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String _nome) {
        this.nome = _nome;
    }

    public String getFone() {
        return this.fone;
    }

    public void setFone(String _fone) {
        this.fone = _fone;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int _idade) {
        this.idade = _idade;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double _peso) {
        this.peso = _peso;
    }
}

/*
 * O principal motivo de usarmos sistemas computacionais é de automatizar
 * processos repetitivos e/ou complexos.
 */