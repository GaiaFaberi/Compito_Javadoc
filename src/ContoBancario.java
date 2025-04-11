/**
 * Questa classe rappresenta un conto bancario
 */
public class ContoBancario extends Object{
    protected String iban = "";
    protected double saldo = 0.0;

    /**
     * Costruttore che inizializza il conto bancario con un iban e un saldo
     * @param iban  il numero del conto bancario
     * @param saldo il saldo iniziale del conto bancario
     */
    public ContoBancario(String iban, double saldo){
        this.iban = iban;
        this.saldo = saldo;
    }

    
    /**
     * Questo metodo deposita una somma di denaro sul conto bancario, incrementando il saldo
     * @param importo  la somma di denaro da depositare
     * @throws IllegalArgumentException se l'importo è negativo
     */
    public void deposita(double importo){
        if (importo < 0) {
            throw new IllegalArgumentException("L'importo non può essere negativo.");
        }
        this.saldo += importo;
    }

    /**
     * Restituisce il numero del conto bancario
     * @return il numero del conto bancario 
     */
    public String getIban() {
        return iban;
    }

    /**
     * Restituisce il saldo del conto bancario
     * @return il saldo del conto bancario
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Questo metodo preleva una somma di denaro sul conto bancario, decrementando il saldo
     * @param importo la somma di denaro da prelevare
     * @throws IllegalArgumentException se l'importo è negativo
     */
    public void preleva(double importo){
        if (importo < 0 || importo > saldo) {
            throw new IllegalArgumentException("Il prelievo non può essere maggiore del saldo o saldo negativo");
        }
        this.saldo -= importo;
    }

    /**
     * Override che restituisce una rappresentazione stringa del conto bancario, inclusivo di iban e saldo
     */
    @Override
    public String toString() {
        return "Conto bancario: \n" + this.iban + "\n Saldo: \n" + this.saldo;
    }
}
