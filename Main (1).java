import java.time.LocalDate;

class Main {
  public static void main(String[] args) {
    
    Biblioteca infoteca = new Biblioteca("09.999.874/5758-22", "Infoteca", "Rua das Araucárias, 158 - Setor Tradicional, Gramado - RS", "83 991514531", "infoteca@gmail.com");
    
    //Usuário 1
    String nome1 = "Maria Luíza Magna";
    String cpf1 = "093.008.155-45";
    String telefone1 = "83988001316";
    String email1 = "maryluhmagna@gmail.com";
    String senha1 = "123senha";
    Usuario usuario1 = new Usuario(nome1, cpf1, telefone1, email1, senha1);

    //Usuário 2
    String nome2 = "Geovana Augusto";
    String cpf2 = "012.345.678-90";
    String telefone2 = "83940028923";
    String email2 = "xoffanah.farmaciasaugusto@gmail.com";
    String senha2 = "456senha";
    Usuario usuario2 = new Usuario(nome2, cpf2, telefone2, email2, senha2);

    //Usuário 3
    String nome3 = "Eloisa Soares";
    String cpf3 = "543.251.988-91";
    String telefone3 = "83940028922";
    String email3 = "lolo@gmail.com";
    String senha3 = "789senha";
    Usuario usuario3 = new Usuario(nome3, cpf3, telefone3, email3, senha3);

    //Usuário 4
    String nome4 = "José Andrey Duarte";
    String cpf4 = "727.093.988-92";
    String telefone4 = "83987528921";
    String email4 = "zezin@gmail.com";
    String senha4 = "900senha";
    Usuario usuario4 = new Usuario(nome4, cpf4, telefone4, email4, senha4);

    //Usuário 5
    String nome5 = "Ana Clara Pinheiro";
    String cpf5 = "029.675.983-93";
    String telefone5 = "83999834569";
    String email5 = "clarinhapudim@gmail.com";
    String senha5 = "899senha";
    Usuario usuario5 = new Usuario(nome5, cpf5, telefone5, email5, senha5);

    infoteca.cadastraUsuario(usuario1);
    infoteca.cadastraUsuario(usuario2);
    infoteca.cadastraUsuario(usuario3);
    //Teste: Não pode cadastrar usuário repetido.
    infoteca.cadastraUsuario(usuario1);
    infoteca.exibirUsuarios();

    //Livro 1
    String id1 = "ll1";
    String nomeLivro1 = "Bobók";
    String isbn1 = "111-93993-1";
    String nomeAutor1 = "Fiódor Dostoiévski";
    String nomeTradutor1 = "Paulo Bezerra";
    String idiomaTraduzido1 = "Português";
    String editora1 = "34";
    Livros livro1 = new Livros(id1, nomeLivro1, isbn1, nomeAutor1, nomeTradutor1, idiomaTraduzido1, editora1);
    
    //Livro 2
    String id2 = "ll2";
    String nomeLivro2 = "Felicidade Conjugal";
    String isbn2 = "111-93083-2";
    String nomeAutor2 = "Lev Tólstoi";
    String nomeTradutor2 = "Boris Schnaiderman";
    String idiomaTraduzido2 = "Português";
    String editora2 = "34";
    Livros livro2 = new Livros(id2, nomeLivro2, isbn2, nomeAutor2, nomeTradutor2, idiomaTraduzido2, editora2);

    infoteca.cadastraProduto(livro1);
    //Teste: Não pode cadastrar livro repetido.
    infoteca.cadastraProduto(livro1);

    //DVD 1
    String idDVD1 = "dd1";
    String nomeDVD1 = "Barbie e o Castelo de Diamantes";
    String nomeDiretor1 = "Gino Nichele";
    String anoLancamento1 = "2008";
    String idiomaDisponivel1 = "EN";
    String legendaDisponivel1 = "PT-BR";

    Dvds dvd1 = new Dvds(idDVD1, nomeDVD1, nomeDiretor1, anoLancamento1, idiomaDisponivel1, legendaDisponivel1);
    infoteca.cadastraProduto(dvd1);

    //DVD 2
    String idDVD2 = "dd2";
    String nomeDVD2 = "Barbie e a Princesa da Ilha";
    String nomeDiretor2 = "Greg Richardson";
    String anoLancamento2 = "2007";
    String idiomaDisponivel2 = "EN";
    String legendaDisponivel2 = "PT-BR";

    Dvds dvd2 = new Dvds(idDVD2, nomeDVD2, nomeDiretor2, anoLancamento2, idiomaDisponivel2, legendaDisponivel2);
    infoteca.cadastraProduto(dvd2);

    infoteca.cadastraProduto(dvd1);
    infoteca.cadastraProduto(dvd2);
    //Teste: Não pode cadastrar DVD repetido.
    infoteca.cadastraProduto(dvd1);
    
    //APOSTILA 1
    String idApostila1 = "aa1";
    String nomeApostila1 = "Os fundamentos da Arte Contemporânea";
    String nomeAutorAp1 = "Esdras Sarmento";
    String numeroEdicaoAp1 = "1";
    String categoriaAp1 = "Acadêmica";
    Apostila ap1 = new Apostila(idApostila1, nomeApostila1, nomeAutorAp1, numeroEdicaoAp1, categoriaAp1);

    //APOSTILA 2
    String idApostila2 = "aa2";
    String nomeApostila2 = "Programação Orientada a Objetos";
    String nomeAutorAp2 = "Mirna Carelli Oliveira Maia";
    String numeroEdicaoAp2 = "2";
    String categoriaAp2 = "Acadêmica";
    Apostila ap2 = new Apostila(idApostila2, nomeApostila2, nomeAutorAp2, numeroEdicaoAp2, categoriaAp2);
    
    infoteca.cadastraProduto(ap1);
    infoteca.cadastraProduto(ap2);
    //Teste: Não pode cadastrar apostila repetida.
    infoteca.cadastraProduto(ap1);


  //EQUIPAMENTOS 1
    String idEquip = "ee1";
    String nomeEquip = "Tablet";
    String marcaEquip = "Dell";
    String modeloEquip = "56903";
    String anoEquip = "2022";
    String descricaoEquip = "8GB DE RAM, 256GB";

    Equipamentos equip1 = new Equipamentos(idEquip, nomeEquip, marcaEquip, modeloEquip, anoEquip, descricaoEquip);
    infoteca.cadastraProduto(equip1);

  //EQUIPAMENTOS 2
    String idEquip2 = "ee2";
    String nomeEquip2 = "Notebook";
    String marcaEquip2 = "Asus";
    String modeloEquip2 = "9567";
    String anoEquip2 = "2019";
    String descricaoEquip2 = "8GB DE RAM, 256GB";

    Equipamentos equip2 = new Equipamentos(idEquip2, nomeEquip2, marcaEquip2, modeloEquip2, anoEquip2, descricaoEquip2);
    
    infoteca.cadastraProduto(equip1);
    infoteca.cadastraProduto(equip2);
    //Teste: Não pode cadastrar equipamentos repetidos.
    infoteca.cadastraProduto(equip1);
    infoteca.exibirProdutos();

    //Empréstimo 1
    String dataE1 = "16/03/2022";
    String codigoEmp1 = "mmm1";
    Produto produtoEmp1 = ap1;
    LocalDate dataEmp1 = infoteca.formataDataInicial(dataE1);
    Usuario usuarioEmp1 = usuario1;
    Emprestimo emp1 = new Emprestimo(dataEmp1, codigoEmp1, produtoEmp1, usuarioEmp1);

    //Empréstimo 2
    String dataE2 = "18/03/2022";
    String codigoEmp2 = "mmm2";
    Produto produtoEmp2 = equip1;
    LocalDate dataEmp2 = infoteca.formataDataInicial(dataE2);
    Usuario usuarioEmp2 = usuario3;
    Emprestimo emp2 = new Emprestimo(dataEmp2, codigoEmp2, produtoEmp2, usuarioEmp2);

    //Empréstimo 3
    String dataE3 = "20/05/2022";
    String codigoEmp3 = "mmm3";
    Produto produtoEmp3 = livro2;
    LocalDate dataEmp3 = infoteca.formataDataInicial(dataE3);
    Usuario usuarioEmp3 = usuario2;
    Emprestimo emp3 = new Emprestimo(dataEmp3, codigoEmp3, produtoEmp3, usuarioEmp3);

    infoteca.fazEmprestimo(emp1);
    //TESTE: Usuário não cadastrado
    infoteca.fazEmprestimo(emp2);
    //TESTE: Produto não cadastrado
    infoteca.fazEmprestimo(emp3);
    infoteca.exibirEmprestimos();
  }
}
