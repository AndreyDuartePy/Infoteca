import java.util.Calendar;
import java.util.Date;
import java.time.LocalDate;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter; 
import java.time.Period;

public class Emprestimo {
  
  private LocalDate dataEmprestimo;
  private String codigo;
  private Produto produtoE;
  private Usuario usuarioE;

  public Emprestimo (LocalDate novaDataEmprestimo, String novoCodigo, Produto novoProdutoE, Usuario novoUsuarioE) {
    this.dataEmprestimo = novaDataEmprestimo;
    this.codigo = novoCodigo;
    this.produtoE = novoProdutoE;
    this.usuarioE = novoUsuarioE;
  }

  public LocalDate getDataEmprestimo() {
    return dataEmprestimo;
  }
  public void setDataEmprestimo(LocalDate dataEmprestimo) {
      this.dataEmprestimo=dataEmprestimo;
  }

  public String getCodigo() {
    return codigo;
  }
  public void setCodigo(String codigo) {
      this.codigo=codigo;
  }

  public Produto getProdutoE() {
    return produtoE;
  }
  public void setProdutoE(Produto produtoE) {
      this.produtoE=produtoE;
  }

  public Usuario getUsuarioE() {
    return usuarioE;
  }
  public void setUsuarioE(Usuario usuarioE) {
      this.usuarioE=usuarioE;
  }
  
  public boolean equals(Object obj) {
    if (obj instanceof Emprestimo) {
      Emprestimo teste = (Emprestimo) obj;
      return this.codigo.equals(teste.getCodigo());
    }else {
      return false;
    }
  }
  
  public String toString() {
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
    LocalDate dataSomada = this.dataEmprestimo.plus(Period.ofDays(30));
    String devol = formato.format(dataSomada);
    String dEmp = formato.format(this.dataEmprestimo);
    String saida = "\n> CÓDIGO EMPRÉSTIMO: "+this.codigo+"\n> DATA EMPRÉSTIMO: " + dEmp+"\n> DATA DEVOLUÇÃO: "+devol+"\n> NOME DO PRODUTO: "+this.produtoE.getNome()+"\n> CÓDIGO PRODUTO: "+this.produtoE.getId()+"\n> NOME DO USUÁRIO: "+this.usuarioE.getNome()+"\n> CPF DO USUÁRIO: "+this.usuarioE.getCpf()+"\n\n ------------------------------------------------------";
    return saida;
  }
}
