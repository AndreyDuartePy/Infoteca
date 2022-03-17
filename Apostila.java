class Apostila extends Produto{

  private String nomeAutor;
  private String numeroEdicao;
  private String categoria; 

  public Apostila(String novoId, String novoNome, String novoNomeAutor, String novoNumeroEdicao, String novaCategoria){
    super(novoId, novoNome);
    this.nomeAutor = novoNomeAutor;
    this.numeroEdicao = novoNumeroEdicao;
    this.categoria = novaCategoria;
  }

  public String getNomeAutor(){
    return nomeAutor;
  }
  public void setNomeAutor(String nomeAutor){
    this.nomeAutor = nomeAutor;
  }
  public String getNumeroEdicao(){
    return numeroEdicao;
  }
  public void setNumeroEdicao(String numeroEdicao){
    this.numeroEdicao = numeroEdicao;
  }
  public String getCategoria(){
    return categoria;
  }
  public void setCategoria(String categoria){
    this.categoria = categoria;
  }
  
  public String toString() {
	  String saida = "\n> ID: "+this.getId()+"\n> NOME: "+this.getNome()+"\n> AUTOR: "+nomeAutor+"\n> EDICAO: "+this.numeroEdicao+"\n> CATEGORIA: "+this.categoria+"\n\n ------------------------------------------------------";
    return saida; 
  }
}