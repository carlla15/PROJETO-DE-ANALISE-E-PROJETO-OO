package projeto_APOO_academia;

public class Aluno extends ClasseBase {
    private String nome;
    private int idade;
    private String endereco;

    private Aluno(Builder builder) {
        super(builder.cpf);
        this.nome = builder.nome;
        this.idade = builder.idade;
        this.endereco = builder.endereco;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        return "Aluno{cpf='" + getId() + "', nome='" + nome + "', idade=" + idade + ", endereco='" + endereco + "'}";
    }

    public static class Builder {
        private String cpf;
        private String nome;
        private int idade;
        private String endereco;

        public Builder cpf(String cpf) {
            this.cpf = cpf;
            return this;
        }

        public Builder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder idade(int idade) {
            this.idade = idade;
            return this;
        }

        public Builder endereco(String endereco) {
            this.endereco = endereco;
            return this;
        }

        public Aluno build() {
            return new Aluno(this);
        }
    }
}