public class CheckingAccount {

    private String name;
    private int balance;
    private String id;
    private double interestRate;

    public CheckingAccount(String inputName, int inputBalance, String inputId) {

        this.name = inputName; // this? Establecer diferencia entre el atributo propio...
        this.balance = inputBalance; // de mi clase y lo que esta afuera.
        this.id = inputId;
        this.interestRate = 0.02; // inicialisamos interes en 0.02
    }

    // Metodos
    public String getAccount() {
        return this.name;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int newBalance) {
        this.balance = newBalance;
    }

    public double getMonthlyInterest() {
        return this.interestRate * this.balance;
    }

    public void consignar(int valorConsignado) {
        balance = balance + valorConsignado;

    }

    public void retirar(int valorRetirado) {
        balance = balance - valorRetirado;
    }
}

// generar un get que defina cunto voy a generar un set para 6 meses? Ganancia
// simple CDT
// get saber cuanto se gana en 6meses --- set es el "deposito"