package
        produto.java {
private String nome;
private String descricao;
private String localizacao;
private String tipo;
private String anfitriao;
private float precoPorNoite;
private float avaliacao;
private int capacidade;
private String disponibilidade;
private float taxaLimpeza;


public produto (String nome, String descricao, String localizacao, String tipo, String anfitriao, float precoPorNoite, float avaliacao, int capacidade, String disponibilidade, float taxaLimpeza) {
    this.nome = nome;
    this.descricao = descricao;
    this.localizacao = localizacao;
    this.tipo = tipo;
    this.anfitriao = anfitriao;
    this.precoPorNoite = precoPorNoite;
    this.avaliacao = avaliacao;
    this.capacidade = capacidade;
    this.disponibilidade = disponibilidade;
    this.taxaLimpeza = taxaLimpeza;
}

public void exibirInformacoes() {
    System.out.println("Nome: " + nome);
    System.out.println("Descrição: " + descricao);
    System.out.println("Localização: " + localizacao);
    System.out.println("Tipo: " + tipo);
    System.out.println("Anfitrião: " + anfitriao);
    System.out.println("Preço por Noite: " + precoPorNoite);
    System.out.println("Avaliação: " + avaliacao);
    System.out.println("Capacidade: " + capacidade);
    System.out.println("Disponibilidade: " + disponibilidade);
    System.out.println("Taxa de Limpeza: " + taxaLimpeza);
}
}