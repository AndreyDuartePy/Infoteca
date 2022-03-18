class Equipamentos extends Produto{

  private String marcaEquipamento;
  private String modeloEquipamento;
  private String anoDeLancamentoEquip;
  private String descricaoEquipamento;
    
  public Equipamentos(String novoId, String novoNome, String novaMarcaEquip, String novoModeloEquip, String novoAno, String novaDescricaoEquip){
    super(novoId, novoNome);
    this.marcaEquipamento = novaMarcaEquip;
    this.modeloEquipamento = novoModeloEquip;
    this.anoDeLancamentoEquip = novoAno;
    this.descricaoEquipamento = novaDescricaoEquip;
    }

  public String getMarcaEquipamento(){
    return marcaEquipamento;
  }
  public void setMarcaEquipamento(String marcaEquipamento){
    this.marcaEquipamento = marcaEquipamento;
  }
  public String getModeloEquipamento(){
    return modeloEquipamento;
  }
  public void setModeloEquipamento(String modeloEquipamento){
  this.modeloEquipamento = modeloEquipamento;
  }
  public String getAnoDeLancamentoEquip(){
    return anoDeLancamentoEquip;
  }
  public void setAnoDeLancamentoEquip(String anoDeLancamentoEquip){
  this.anoDeLancamentoEquip = anoDeLancamentoEquip;
  }
  public String getDescricaoEquipamento(){
    return descricaoEquipamento;
  }
  public void setDescricaoEquipamento(String descricaoEquipamento){
  this.descricaoEquipamento = descricaoEquipamento;
  }

  public String toString() {
	  String saida = "\n> ID: "+this.getId()+"\n> NOME: "+this.getNome()+"\n> MARCA: "+this.marcaEquipamento+"\n> MODELO: "+this.modeloEquipamento+"\n> ANO: "+this.anoDeLancamentoEquip+"\n> DESCRICAO: "+this.descricaoEquipamento+"\n\n ------------------------------------------------------";
    return saida;
  }
}
