public class Numeros{
    private int Numero1;
    private int Numero2;
    private int Numero3;
    private float Saldo;
    private float Tiradas;
    

    public Numeros(){

    }

    //Valores predeterminados
    public void Saldo(){
        this.Saldo = 16;
    }
    public void Tiradas(){
        this.Tiradas = 0;
    }

    //Metodos Constructores
    public  float getSaldo(){
    return Saldo;
    }
    public void setTiradas(float tirada){
    Tiradas = tirada;
    }

    public  float getTiradas(){
    return Tiradas;
    }
    public void setSaldo(float saldo){
    Saldo = saldo;
    }

    public  int getNumero1(){
    return Numero1;
    }

    public void setNumero1(int numero1){
    Numero1 = numero1;
    }
    public  int getNumero2(){
    return Numero2;
    }

    public void setNumero2(int numero2){
    Numero2 = numero2;
    }
    public  int getNumero3(){
    return Numero3;
    }

    public void setNumero3(int numero3){
    Numero3 = numero3;
    }
}