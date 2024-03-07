public class Bank {
    private CheckingAccount accountOne; // Check... Clase y account.. atributos
    private CheckingAccount accountTwo;
    // private CDT CDTaccountOne; // CDT clase y CDTacc.. atributo y o bariable.
    // Necesaria para inicializar los
    // valores como vemos abajo en el constructor de Bank

    public Bank() {
        accountOne = new CheckingAccount("Zeus", 0, "1");
        accountTwo = new CheckingAccount("Hades", 0, "2");
        // CDTaccountOne = new CDT(0, 10);
    }

    public static void main(String[] args) {
        Bank bankOfGods = new Bank(); // objeto en este caso

        System.out.print("\n");
        System.out.println("Nombre de la cuenta: " + bankOfGods.accountOne.getAccount());
        System.out.println("saldo existente en su cuenta es de :" + " " + bankOfGods.accountOne.getBalance());

        bankOfGods.accountOne.setBalance(100);

        System.out.println("Su saldo actual es de: " + bankOfGods.accountOne.getBalance());
        bankOfGods.accountOne.consignar(100);
        System.out.println("Su saldo actual es de: " + bankOfGods.accountOne.getBalance());
        bankOfGods.accountOne.consignar(100);
        System.out.println("Su saldo actual es de: " + bankOfGods.accountOne.getBalance());
        bankOfGods.accountOne.consignar(100);
        System.out.println("Su saldo actual es de: " + bankOfGods.accountOne.getBalance());
        bankOfGods.accountOne.consignar(50);
        System.out.println("Su saldo actual es de: " + bankOfGods.accountOne.getBalance());

        System.out.print("\n");

        bankOfGods.accountOne.retirar(50);
        System.out.println("Su saldo actual es de: " + bankOfGods.accountOne.getBalance());
        bankOfGods.accountOne.retirar(100);
        System.out.println("Su saldo actual es de: " + bankOfGods.accountOne.getBalance());
        bankOfGods.accountOne.retirar(100);
        System.out.println("Su saldo actual es de: " + bankOfGods.accountOne.getBalance());
        bankOfGods.accountOne.retirar(100);
        System.out.println("Su saldo actual es de: " + bankOfGods.accountOne.getBalance());
        bankOfGods.accountOne.retirar(50);
        System.out.println("Su saldo actual es de: " + bankOfGods.accountOne.getBalance());
        System.out.print("\n");

        // -------------------//---------accountTwo-------------//----------------//--------------//----------

        System.out.println("Nombre de la cuenta: " + bankOfGods.accountTwo.getAccount());
        System.out.println("Saldo existente en su cuenta es de :" + " " + bankOfGods.accountTwo.getBalance());

        System.out.print("\n");
        bankOfGods.accountTwo.setBalance(100);

        System.out.println("Su saldo actual es de: " + bankOfGods.accountTwo.getBalance());
        bankOfGods.accountTwo.consignar(50);
        System.out.println("Su saldo actual es de: " + bankOfGods.accountTwo.getBalance());
        bankOfGods.accountTwo.consignar(50);
        System.out.println("Su saldo actual es de: " + bankOfGods.accountTwo.getBalance());
        bankOfGods.accountTwo.consignar(50);
        System.out.println("Su saldo actual es de: " + bankOfGods.accountTwo.getBalance());
        bankOfGods.accountTwo.consignar(50);
        System.out.println("Su saldo actual es de: " + bankOfGods.accountTwo.getBalance());
        System.out.print("\n");

        bankOfGods.accountTwo.retirar(50);
        System.out.println("Su saldo actual es de: " + bankOfGods.accountTwo.getBalance());
        bankOfGods.accountTwo.retirar(50);
        System.out.println("Su saldo actual es de: " + bankOfGods.accountTwo.getBalance());
        bankOfGods.accountTwo.retirar(50);
        System.out.println("Su saldo actual es de: " + bankOfGods.accountTwo.getBalance());
        bankOfGods.accountTwo.retirar(50);
        System.out.println("Su saldo actual es de: " + bankOfGods.accountTwo.getBalance());
        bankOfGods.accountTwo.retirar(50);
        System.out.println("Su saldo actual es de: " + bankOfGods.accountTwo.getBalance());

    }
}