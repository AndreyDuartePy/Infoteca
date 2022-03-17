import java.util.ArrayList;
import java.util.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter; 
import java.time.Period;

public class Biblioteca {
  private String cnpj;
  private String nome;
  private String endereco;
  private String telefone;
  private String email;
  private ArrayList usuarios;
  private ArrayList produtos;
  private ArrayList emprestimos;

  public Biblioteca(String novoCnpj, String novoNome, String novoEndereco, String novoTelefone, String novoEmail) {
    this.cnpj = novoCnpj;
    this.nome = novoNome;
    this.endereco = novoEndereco;
    this.telefone = novoTelefone;
    this.email = novoEmail;
    usuarios = new ArrayList();
    produtos = new ArrayList();
    emprestimos = new ArrayList();
  }
  
  public void cadastraUsuario(Usuario usuario) {
    if (!(usuarios.contains(usuario))){
      usuarios.add(usuario);
    }
  }

  public void cadastraProduto(Produto produto) {
    if (!(produtos.contains(produto))){
      produtos.add(produto);
    }
  }

  public void fazEmprestimo(Emprestimo emp) {
    if(!(emprestimos.contains(emp))) {
      System.out.println(emp.getUsuarioE().getNome()+", aguarde um pouco que verificaremos se seu empréstimo poderá ser realizado. \n");
      if(usuarios.contains(emp.getUsuarioE())) {
        if(produtos.contains(emp.getProdutoE())) {
          System.out.println("Muito bem! Você possui cadastro e o produto que você deseja está disponível para empréstimo! Aguarde um pouco para checar a data de devolução. \n");
          DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
          LocalDate dataSomada = emp.getDataEmprestimo().plus(Period.ofDays(30));
          String devol = formato.format(dataSomada);
          String dEmp = formato.format(emp.getDataEmprestimo());

          System.out.println("DATA EMPRÉSTIMO: " + dEmp);
          System.out.println("DATA DEVOLUÇÃO: " + devol);
          emprestimos.add(emp);
          
          System.out.println(" \n"+emp.getUsuarioE().getNome()+", seu empréstimo foi realizado!");
          System.out.println("****************************************************** \n");

          produtos.remove(emp.getProdutoE());
          
        }
        else{
          System.out.println("Sentimos muito, mas o produto que você escolheu não está disponível e não poderemos realizar seu empréstimo!");
        }
      }
      else{
        System.out.println("Sentimos muito, mas só pessoas com cadastro podem fazer empréstimos na Infoteca!");
      }
    }
  }
  
  public String getCnpj() {
    return cnpj;
  }
  public void setCnpj(String cnpj) {
    this.cnpj=cnpj;
  }

  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
      this.nome=nome;
  }

  public String getEndereco() {
    return endereco;
  }
  public void set(String endereco) {
      this.endereco=endereco;
  }

  public String getTelefone() {
    return telefone;
  }
  public void setTelefone(String telefone) {
      this.telefone=telefone;
  }

  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
      this.email= email;
  }

  public ArrayList getEmprestimos() {
    return emprestimos;
  }
  public void setEmprestimos(ArrayList emprestimos) {
      this.emprestimos=emprestimos;
  }

  public ArrayList getUsuarios() {
    return usuarios;
  }
  public void setUsuarios(ArrayList usuarios) {
      this.usuarios=usuarios;
  }

  public ArrayList getProdutos() {
    return produtos;
  }
  public void setProdutos(ArrayList produtos) {
      this.produtos=produtos;
  }

  public void exibirUsuarios() {
    System.out.println("\n"+" ******************************************************"+"\n"+"             " +"  USUARIOS CADASTRADOS ");
    System.out.println(" ******************************************************" + "\n" + usuarios.toString().replace("[", "").replace("]", "").replace(", ", ""));
  }

  public void exibirProdutos() {
    System.out.print("\n"+" ******************************************************"+"\n"+"             " + "  PRODUTOS CADASTRADOS ");
    System.out.println("\n" + " ******************************************************" + "\n" + produtos.toString().replace("[", "").replace("]", "").replace(", ", ""));
  }

  public void exibirEmprestimos() {
    System.out.print("\n"+" ******************************************************"+"\n"+"             " + "  EMPRÉSTIMOS CADASTRADOS ");
    System.out.println("\n" + " ******************************************************" + "\n" + emprestimos.toString().replace("[", "").replace("]", "").replace(", ", ""));
  }

  public LocalDate formataDataInicial(String dataRecebida) {
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
    LocalDate data = LocalDate.parse(dataRecebida, formato);
    
    return data;
  } 

}
