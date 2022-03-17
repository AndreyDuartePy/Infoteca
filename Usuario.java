public class Usuario{

  private String nome;
  private String cpf;
  private String telefone;
  private String email;
  private String senha;


  public Usuario(String novoNome, String novoCpf, String novoTelefone, String novoEmail, String novaSenha) {
    this.nome = novoNome;
    this.cpf = novoCpf;
    this.telefone = novoTelefone;
    this.email = novoEmail;
    this.senha = novaSenha;
  }

  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
      this.nome=nome;
  }
  
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
      this.cpf=cpf;
  }

  public String getTelefone() {
    return telefone;
  }
  public void setTelefone(String fone) {
      this.telefone = fone;
  }

  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
      this.email=email;
  }

  public String getSenha() {
    return senha;
  }
  public void setSenha(String Senha) {
      this.senha = Senha;
  }

  public boolean equals(Object obj) {
    if (obj instanceof Usuario) {
      Usuario teste = (Usuario) obj;
      return this.cpf.equals(teste.getCpf());
    }else {
      return false;
    }
  }

  public String toString() {
	  String saida = "\n> NOME: " + this.nome+"\n> CPF: "+this.cpf+"\n> TELEFONE: "+this.telefone+"\n> EMAIL: "+this.email+"\n> SENHA: "+this.senha+"\n\n ------------------------------------------------------";
    return saida;
  }
}