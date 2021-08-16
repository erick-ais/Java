package exercicio;

public class Banco {

    // Atributos
    public int numconta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void estadoAtual() {
        System.out.println("------------------------------------");
        System.out.println("Conta: " + this.getNumconta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

    // Médotos Personalizados
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if(t == "CC") {
            this.setSaldo(50);
        } else if(t == "CP") {
            this.setSaldo(150);
        }
        System.out.println("Conta Aberta Com Sucesso!");
    }
    public void fecharConta() {
        if(this.getSaldo() > 0) {
            System.out.println("Conta não pode ser fechada!");
        } else if(getSaldo() < 0) {
            System.out.println("Conta não pode ser fechada por causa do débido!");
        } else {
            this.setStatus(false);
        }
        System.out.println("Conta Fechada!!!");
    }
    public void depositar(float v) {
        if(this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Impossível depositar em conta fechada.");
        }
    }
    public void sacar(float v) {
        if(this.getStatus()) {
            if(this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo Insufucuente!");
            }
        } else {
            System.out.println("Impossível sacar de uma conta fechada.");
        }
    }
    public void pagarMesal() {
        int v = 0;
        if(this.getTipo() == "CC") {
            v = 12;
        } else if(this.getTipo() == "CP"){
            v = 20;
        }
        if(this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso!");
        } else {
            System.out.println("Conta fechada! Não pode ocorrer a cobrança.");
        }
    }

    // Métodos Especiais
    public Banco() {
        this.saldo = 0;
        this.status = false;
    }

    public void setNumconta(int n) {
        this.numconta = n;
    }

    public int getNumconta() {
        return this.numconta;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public String getDono() {
        return this.dono;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setStatus(boolean s) {
        this.status = s;
    }

    public boolean getStatus() {
        return this.status;
    }
}
