public class Main {
    public static void main(String[] args) {
        // Obtendo a classe
        Class<?> minhaClasseClass = MinhaClasse.class;

        // Verificando se a anotação está presente
        if (minhaClasseClass.isAnnotationPresent(Tabela.class)) {
            // Obtendo a anotação
            Tabela tabelaAnnotation = minhaClasseClass.getAnnotation(Tabela.class);

            // Obtendo o valor do atributo "nome" da anotação
            String nomeDaTabela = tabelaAnnotation.nome();

            // Imprimindo o nome da tabela no console
            System.out.println("Nome da Tabela: " + nomeDaTabela);
        } else {
            System.out.println("A anotação Tabela não está presente na classe.");
        }
    }
}
