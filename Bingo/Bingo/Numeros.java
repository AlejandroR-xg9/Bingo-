public class Numeros{
    private int Numero1;
    private int Numero2;
    private int Numero3;
    private float Saldo;
    private float Tiradas;
    


public double CalcularPremio(){
    int par1 = 0;
    int par2 = 0;
    int par3 = 0;
    double premio = 0;
    if (Numero1 % 2 == 0){
        par1 ++;
    }
    if (Numero2 % 2 == 0){
        par2 ++;
    }
    if (Numero3 % 2 == 0){
        par3 ++;
    }
    int pares = par1+par2+par3;
    if (pares > 2){
        if(par1 > 2 && par2 > 2){
            if(Numero1 >= 700 && Numero2 >= 700){
                premio = (Numero1 + Numero2)/0.20;
            }
            else if(Numero1 >= 500 || Numero2 >= 500){
                premio = (Numero1 + Numero2)/0.15;
            }
            else if(Numero1 > 2 ){
                premio = (Numero1 + Numero2)/0.25;
            }
        }
        else if(par2 > 2 && par3 > 2){
            
        }
        else if(par3 > 2 && par1 > 2){
            
        }
    }
    return premio;
}


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