package fundamentos;

public class TipoString {
    public static void main(String[] args) {
        String nome = "Erick";
        String sobrenome = "Augusto";
        int idade = 27;
        float salario = 2750.69F;

        // PRINT Sem linha adicional
        System.out.print("exemplos de string\n\n".toUpperCase());

        // PRINT com linha adicional (ln)
        System.out.println("Nome: " + nome
                + "\nSobrenome: " + sobrenome
                + "\nIdade: " + idade
                + "Salário: " + salario);

        // PRINT com formatação (f)
        System.out.printf("\nO senhor %s %s tem %d e ganha R$%.2f reais!",
                nome, sobrenome, idade, salario);

        // String com formatação (format)
        String dados = String.format("\n\nDADOS DO FUNCIONÁRIO:\nNome: %s %s\nIdade: %d\nSalário: R$%.2f",
                nome, sobrenome, idade, salario);
        System.out.println(dados);
    }
}
