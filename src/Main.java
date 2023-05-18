public class Main {
    public static void main(String[] args) {
        // Aula de Orientação  a Objetos
        // Declarar Objetos
        Pessoa adao;
        // Instanciar objetos
        adao = new Pessoa();
        Pessoa eva = new Pessoa();
        // Definição do formato
        adao.nome = "Adão";
        adao.sobrenome = "silva";
        eva.nome = "Eva";
        eva.sobrenome = "silva";
        // Acionar comportamento
        adao.falar();
        eva.falar();
    }
}