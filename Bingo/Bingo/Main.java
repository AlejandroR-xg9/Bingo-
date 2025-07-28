import java.util.Scanner;
public class Main{
public static void main(String[] args) {
    //Colocar nueva instancia de Saldo en 16
    Numeros primero = new Numeros();
    primero.Saldo();
    int random1 = (int) (Math.random()*(1000 - 100 + 1) + 100);
    int random2 = (int) (Math.random()*(1000 - 100 + 1) + 100);
    int random3 = (int) (Math.random()*(1000 - 100 + 1) + 100);
    
    //Tiradas = 0
    primero.Tiradas();
    
    //Asignar Randoms a la variable numeros waw.
    primero.setNumero1(random1);
    primero.setNumero2(random2);
    primero.setNumero3(random3);

    //Scanner
    Scanner scanner = new Scanner(System.in);

 





    int accion = -1;
    while (accion == -1){
    System.out.println("Escriba que desea hacer: Comprar Tiradas(1), BINGO(2),Salir(3)");
    int Maccion = scanner.nextInt();
//Comprar
    while(Maccion == 1){
    float Tiradas = 0;
    System.out.println("Saldo Actual: " + primero.getSaldo());
    System.out.println("¿Cuantas tiradas quieres comprar?");
    Tiradas = scanner.nextInt();
    primero.setTiradas(Tiradas);
    primero.setSaldo(primero.getSaldo()-(Tiradas*4));
    System.out.println("Saldo Actual: " + primero.getSaldo());
    Maccion = 0;
        }
//BINGO
    while(Maccion == 2){

        System.out.println("Tiradas restantes: " + primero.getTiradas());
        System.out.println("B I N G O");
            if (primero.getTiradas() > 0){
                System.out.println("|" + primero.getNumero1() + "|" + primero.getNumero2() + "|" + primero.getNumero3() + "|");
                System.out.println("Saldo Actual: " + primero.getSaldo());
                primero.setTiradas(primero.getTiradas() - 1);
                Maccion = 0;
             }
             else{
                System.out.println("No tiene suficientes tiradas");
             }
             Maccion = 0;
    
        
    }
    if (Maccion == 3){
        accion = 0;
        System.out.println("Saliste del programa :D");
        }
    }
scanner.close();
}
}
