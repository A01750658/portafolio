/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Retos;
import java.util.Scanner;
/**
 *
 * @author alanvega
 */
public class Reto29 {
    public Reto29(){
    
    }
    public void Reto29(){
    Scanner in = new Scanner(System.in);
    System.out.println("Introduce la fecha en formato DD/MM/AAAA separada por diagonales: ");
    String fecha = in.next();
    String[] partes = fecha.split("/");
    String day = partes[0];
    String month = partes [1];
    String year = partes [2];
    int numday = Integer.parseInt(day);
    int nummonth =Integer.parseInt(month);
    int numyear = Integer.parseInt (year);
    switch (nummonth){
        case 1: 
            if (numday>31){
            System.out.println("Día no válido");
            }
            else{
            System.out.println("El mes es enero");
            }
            break;
        case 2:
            if (numday>28){
            System.out.println("Día no válido");
            }
            else{
            System.out.println("El mes es febrero");
            }
            break;
        case 3:
            if (numday>31){
            System.out.println("Día no válido");
            }
            else{
            System.out.println("El mes es marzo");
            }
            break;
        case 4:
            if (numday>30){
            System.out.println("Día no válido");
            }
            else{
            System.out.println("El mes es Abril");
            }
            break;
        case 5:
            if (numday>31){
            System.out.println("Día no válido");
            }
            else{
            System.out.println("El mes es mayo");
            }
            break;
        case 6:
            if (numday>30){
            System.out.println("Día no válido");
            }
            else{
            System.out.println("El mes es junio");
            }
            break;
        case 7:
            if (numday>31){
            System.out.println("Día no válido");
            }
            else{
            System.out.println("El mes es julio");
            }
            break;
        case 8:
            if (numday>31){
            System.out.println("Día no válido");
            }
            else {
            System.out.println("El mes es agosto");
            }
            break;
        case 9:
            if (numday>30){
            System.out.println("Día no válido");
            }
            else {
            System.out.println("El mes es septiembre");
            }
            break;
        case 10:
            if (numday>31){
            System.out.println("Día no válido");
            }
            else {
            System.out.println("El mes es octubre");
            }
            break;
        case 11:
            if (numday>30) {
            System.out.println("Día no válido");
            }
            else {
            System.out.println("El mes es noviembre");
            }
            break;
        case 12:
            if (numday>31){
            System.out.println("Día no válido");
            }
            else {
            System.out.println("el mes es diciembre");
            }
            break;
        default:
            System.out.println("Mes no válido");
            break;
    }
    }
    }
