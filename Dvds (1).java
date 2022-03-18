class Dvds extends Produto{

  private String nomeDiretor;
  private String anoLancamento;
  private String idiomaDisponivel;
  private String legendaDisponivel;

  public Dvds(String novoId, String novoNome, String novoNomeDiretor, String novoAnoLancamento, String novoIdiomaDisponivel, String novaLegendaDisponivel){
    super(novoId, novoNome);
    this.nomeDiretor = novoNomeDiretor;
    this.anoLancamento = novoAnoLancamento;
    this.idiomaDisponivel = novoIdiomaDisponivel;
    this.legendaDisponivel = novaLegendaDisponivel;
  }  

  public String getNomeDiretor(){
    return nomeDiretor;
  }
  public void setNomeDiretor(String nomeDiretor){
    this.nomeDiretor = nomeDiretor;
  }
  public String getAnoLancamento(){
    return anoLancamento;
  }
  public void setAnoLancamento(String anoLancamento){
    this.anoLancamento = anoLancamento;
  }
  public String getIdiomaDisponivel(){
    return idiomaDisponivel;
  }
  public void setIdiomaDisponivel(String idiomaDisponivel){
    this.idiomaDisponivel = idiomaDisponivel;
  }
  public String getLegendaDisponivel(){
    return legendaDisponivel;
  }
  public void setLegendaDisponivel(String legendaDisponivel){
    this.legendaDisponivel = legendaDisponivel;
  }
    public String toString() {
	  String saida = "\n> ID: "+this.getId()+"\n> NOME: "+this.getNome()+"\n> DIRETOR: "+nomeDiretor+"\n> LANCAMENTO: "+this.anoLancamento+"\n> IDIOMA: "+this.idiomaDisponivel+"\n> LEGENDA: "+this.legendaDisponivel+"\n\n ------------------------------------------------------";
    return saida;
  }
}