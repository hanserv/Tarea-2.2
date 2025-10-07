package com.calculadora;

/**
 *
 * @author hanse
 */
public class Calculadora {
    
    //Methods 
    //sum:
    public double suma(int num1,int num2) {
        return (double)(num1)+num2;
    }
    public double suma(int num1,int num2,int num3) {
        return (double)(num1)+num2+num3;
    }
    public double suma(int num1,int num2,int num3, int num4) {
        return (double)(num1)+num2+num3+num4;
    }
    
    //subtraction
    public double resta(int num1,int num2) {
        return (double)(num1)-num2;
    }
    public double resta(int num1,int num2,int num3) {
        return (double)(num1)-num2-num3;
    }
    public double resta(int num1,int num2,int num3, int num4) {
        return (double)(num1)-num2-num3-num4;
    }
    
    //multiplication
    public double multiplicacion(int num1,int num2) {
        return (double)(num1)*num2;
    }
    public double multiplicacion(int num1,int num2,int num3) {
        return (double)(num1)*num2*num3;
    }
    public double multiplicacion(int num1,int num2,int num3, int num4) {
        return (double)(num1)*num2*num3*num4;
    }
    
    //division
    public double division(int num1,int num2) {
        if(num2 == 0) {
            System.out.println("Error. No se puede dividir entre 0.");
            return -1;
        }
        else return (double)(num1)/num2;
    }
    
    //Main
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println("1. Suma. resultado: "+calc.suma(10, 10)+"\n2. Suma. resultado: "+calc.suma(10, 10,3)+"\n3. Suma. resultado: "+calc.suma(10, 10,3,8));
        System.out.println("\n1. Resta. resultado: "+calc.resta(100, 10)+"\n2. Resta. resultado: "+calc.resta(100, 10,3)+"\n3. Resta. resultado: "+calc.resta(100, 10,3,8));
        System.out.println("\n1. Multiplicacion. resultado: "+calc.multiplicacion(1, 10)+"\n2. Multiplicacion. resultado: "+calc.multiplicacion(1, 10,3)+"\n3. Multiplicacion. resultado: "+calc.multiplicacion(1, 10,3,8));
        System.out.println("\n1. Division. resultado: "+calc.division(35, 2));
    }
}
