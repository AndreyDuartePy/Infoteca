public abstract class Produto {

  private String id;
  private String nome;
  
  public Produto(String novaId, String novoNome){
    this.id = novaId;
    this.nome = novoNome;
  }
  public String getId(){
    return id;
  }
  public void setId(String id){
    this.id = id;
  }
  public String getNome(){
    return nome;
  }
  public void setNome(String nome){
    this.nome = nome;
  }

  public boolean equals(Object obj) {
    if (obj instanceof Produto) {
      Produto teste = (Produto) obj;
      return this.id.equals(teste.getId());
    }else {
      return false;
    }
  }
}
