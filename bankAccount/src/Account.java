public class Account {

    private String nome;
    private int number;
    private float balance;

    public Account(String nome, int number, int balance) {
        this.nome = nome;
        this.number = number;
        this.balance = balance;
    }]

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void withdraw(float value){
        this.setBalance(this.getBalance() - value);
    }

    public void deposit(float value){
        this.setBalance(this.getBalance() + value);
    }
}
