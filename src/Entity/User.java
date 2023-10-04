package Entity;
import java.util.Random;

public class User{
    public int Numero;
    public String Agencia;
    public String Nome;
    public Double Saldo;

    public int setNumero(){
        Random rand = new Random();
        
        return this.Numero = rand.nextInt(999);
    }
    public String setAgencia(){
        Random rand = new Random();
        String agencia = +rand.nextInt(999)+"-"+rand.nextInt(9);
        return this.Agencia = agencia;
    }
}