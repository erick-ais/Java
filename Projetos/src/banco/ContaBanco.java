package banco;

public class ContaBanco {
    private String cliente;
    protected String cpf;
    private String tipo;
    protected int conta;
    private int agencia;
    private float saldo;

    public void estadoAtual() {
        System.out.println("\nCliente: " + this.getCliente());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Conta: " + this.getConta());
        System.out.println("Agência: " + this.getAgencia());
        System.out.println("Saldo: R$" + this.getSaldo());
        System.out.println("------------------------------------");
    }

    public void depositar(float v) {
        this.setSaldo(getSaldo() + v);
    }

    public void sacar(float v) {
        if(getSaldo() >= v) {
            this.setSaldo((this.getSaldo() - 0.10F) - v);
            System.out.println("Saque realizado com sucesso!!!");
        } else {
            System.out.println("Você não tem saldo disponível para saque!");
        }
    }

    public ContaBanco() {
        this.saldo = 0;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    public String getCliente() {
        return this.cliente;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getCpf() {
        return this.cpf;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo() {
        return this.tipo;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }
    public int getConta() {
        return this.conta;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    public int getAgencia() {
        return this.agencia;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public float getSaldo() {
        return this.saldo;
    }
}
