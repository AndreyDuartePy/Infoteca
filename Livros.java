class Livros extends Produto {
  
  private String isbn;
  private String nomeAutor;
  private String nomeTradutor;
  private String idiomaTraduzido;
  private String editora;

  public Livros(String novoId, String novoNome, String novoIsbn, String novoNomeAutor, String novoNomeTradutor, String novoIdiomaTraduzido, String novaEditora) {
    super(novoId, novoNome);
    this.isbn = novoIsbn;
    this.nomeAutor = novoNomeAutor;
    this.nomeTradutor = novoNomeTradutor;
    this.idiomaTraduzido = novoIdiomaTraduzido;
    this.editora = novaEditora;
  }

  public String getIsbn(){
    return isbn;
  }
  public void setIsbn(String isbn){
    this.isbn = isbn;
  }

  public String getNomeAutor(){
    return nomeAutor;
  }
  public void setNomeAutor(String nomeAutor){
    this.nomeAutor = nomeAutor;
  }

  public String getNomeTradutor(){
    return nomeTradutor;
  }
  public void setNomeTradutor(String nomeTradutor){
    this.nomeTradutor = nomeTradutor;
  }

  public String getIdiomaTraduzido(){
    return idiomaTraduzido;
  }
  public void setIdiomaTraduzido(String idiomaTraduzido){
    this.idiomaTraduzido = idiomaTraduzido;
  }

  public String getEditora(){
    return editora;
  }
  public void setEditora(String editora){
    this.editora = editora;
  }

  public String toString() {
	  String saida = "\n> ID: "+this.getId()+"\n> NOME: "+this.getNome()+"\n> ISBN: "+this.isbn+"\n> AUTOR: "+this.nomeAutor+"\n> TRADUTOR: "+this.nomeTradutor+"\n> IDIOMA: "+this.idiomaTraduzido+"\n> EDITORA: "+this.editora+"\n\n ------------------------------------------------------";
    return saida;
  }
}
  