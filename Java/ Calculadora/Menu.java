package calcu;

public class Menu extends Operacion 
{
    
    //mostramos el menu y gestionar las operaciones que se necesitenn
    public void menu() {
        int opc;
        System.out.println(" \nBienvenido a CalcSup!\n \nSeleccione la operacion que quiere realizar...");

        System.out.println("1. Suma\n2. Resta\n3. Multiplicacion\n4. Division\n5. Salir");
        
        opc = super.pedirdato("");
        
        // Realizar la operacion segun la opcion seleccionadaa
        if (opc == 1) {
            super.setNum1(pedirdato("Primer dato:"));
            super.setNum2(pedirdato("Segundo dato:"));
            super.mostrarresultado("El resultado de la suma es:  ", suma(getNum1(), getNum2()));
        } else if (opc == 2) {
            super.setNum1(pedirdato("primer dato:"));
            super.setNum2(pedirdato("segundo dato:"));
            super.mostrarresultado("El resultado de la resta es:  ", resta(getNum1(), getNum2()));
        } 
        else if (opc == 3) {
            super.setNum1(pedirdato("primer dato:"));
            super.setNum2(pedirdato("segundo dato:"));
            super.mostrarresultado("El resultado de la multiplicacion es:  ", multi(getNum1(), getNum2()));
        }
        else if (opc == 4) {
            super.setNum1(pedirdato("primer dato"));
            super.setNum2(pedirdato("segundo dato"));
            super.mostrarresultado("El resultado de la division es:  ", divi(getNum1(), getNum2()));
        }
        else if (opc == 5) {
            System.out.println("Gracias");
        } else {
            // Opcion invalida
            System.out.println("Opcion no valida");
        }
    }
}
