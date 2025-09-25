//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        // Adicionar palavras (linguagens de programação)
        dicionario.adicionarPalavra("java", "Linguagem de programação orientada a objetos.");
        dicionario.adicionarPalavra("typescript", "Superset da linguagem JavaScript que adiciona tipagem estática.");
        dicionario.adicionarPalavra("kotlin", "Linguagem moderna de programação para a JVM.");

        System.out.println();
        System.out.println("Exibir todas as palavras: ");
        dicionario.exibirPalavras();

        System.out.println();
        System.out.println("Pesquisar palavras: java");
        String definicaoJava = dicionario.pesquisarPorPalavra("java");
        System.out.println("Definição da linguagem 'java': " + definicaoJava);

        System.out.println();
        System.out.println("Pesquisar palavras: kotlin");
        String definicaoCSharp = dicionario.pesquisarPorPalavra("kotlin");
        System.out.println(definicaoCSharp);

        System.out.println();
        System.out.println("Remover uma palavra: typescriopt.");
        dicionario.removerPalavra("typescript");
        dicionario.exibirPalavras();
    }
}