package Grupo8;

public class testeContato {

    public static void main(String[] args) {
        
        Estado estado = new Estado("Rio de Janeiro", "RJ");
        Cidade cidade = new Cidade("Petrópolis", estado);
        Endereco endereco = new Endereco("Rua Sargento Boening, 678", "Alto da Compadecida", "25600-000", cidade);
                
        Contato contato = new Contato("Rubia", new Telefone[3], endereco); //acrescentar e iniciar array telefones

        Telefone telefone1 = new Telefone("4002-8922");
        Telefone telefone2 = new Telefone("4002-8999");
        Telefone telefone3 = new Telefone("4002-8888");

        contato.adicionarTelefones(telefone1);
        contato.adicionarTelefones(telefone2);
        contato.adicionarTelefones(telefone3);
        
        System.out.println(contato.toString());
        
    }
    
}