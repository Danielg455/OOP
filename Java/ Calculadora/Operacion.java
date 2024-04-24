package calcu;

import java.util.Scanner;

public class Operacion {
    private float num1;
    private float num2;
    Scanner sc;
    
    public Operacion(){
        num1=0;
        num2=0;
        sc = new Scanner(System.in);
    }
    
    //Getters: obtener (o leer) el valor de una variable privada.
    //Setters: establecer (o escribir) un nuevo valor en una variable privada.


     public float getNum1(){
        return this.num1;
    }
    public void setNum1(float num1){
        this.num1 = num1;
    }
    public float getNum2(){
        return this.num2;
    }
    public void setNum2(float num2){
        this.num2 = num2;
    }


    public float suma(float x,float y){
        return  x + y;
    }         
    public float resta(float x, float y){
        return x - y;
    }
    public float multi(float x, float y){
        return  x * y;
    }
    public float divi(float x, float y){
        return x / y; 
    }
    
            public void mostrarresultado(String p, float re){  //en "p" guardamos el texto que queremos y re es la operacion. que nos retorna el resulltado.
                System.out.println(p + re);
            }
                        
            public int pedirdato(String p){
                System.out.println(p);
                int n=sc.nextInt();
                return n;
            }
        }
