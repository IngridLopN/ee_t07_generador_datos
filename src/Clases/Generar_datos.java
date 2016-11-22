/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.*;
import java.text.SimpleDateFormat;
import javax.swing.*;
import java.util.*;
import com.csvreader.CsvWriter;
/**
 *
 * @author IngridNiño
 */
public class Generar_datos {
    
    private ListaSimLigada<String> nombres;
    private ListaSimLigada<String> apellidos_maternos;
    private ListaSimLigada<String> apellidos_paternos;
    private ListaSimLigada<String> ciudades;
    private ListaSimLigada<String> direcciones;
    private ListaSimLigada<String> emails;
    private ListaSimLigada<String> empresas;
    private ListaSimLigada<String> nacionalidades;
    private ListaSimLigada<String> rfc;
    
    public void cargar_nombres(){
        nombres=new ListaSimLigada<String>();
        String nomArc = "Nombres.txt";
        try {
            BufferedReader br = new BufferedReader(new FileReader(nomArc));
            String l;
            l= br.readLine();
            while (l != null) {
                nombres.inserta_final(l);
                l = br.readLine();
            }
            br.close();
        } catch (IOException ioe){
            JOptionPane.showMessageDialog(null, "Archivo no encontrado", "Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    public void cargar_apellidos_maternos(){
        apellidos_maternos = new ListaSimLigada<String>();
        String nomArc = "Apellidos_Maternos.txt";
        try {
            BufferedReader br = new BufferedReader(new FileReader(nomArc));
            String l;
            l= br.readLine();
            while (l != null) {
                apellidos_maternos.inserta_final(l);
                l = br.readLine();
            }
            br.close();
        } catch (IOException ioe){
            JOptionPane.showMessageDialog(null, "Archivo no encontrado", "Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    public void cargar_apellidos_paternos(){
        apellidos_paternos = new ListaSimLigada<String>();
        String nomArc = "Apellidos_Paternos.txt";
        try {
            BufferedReader br = new BufferedReader(new FileReader(nomArc));
            String l;
            l= br.readLine();
            while (l != null) {
                apellidos_paternos.inserta_final(l);
                l = br.readLine();
            }
            br.close();
        } catch (IOException ioe){
            JOptionPane.showMessageDialog(null, "Archivo no encontrado", "Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    public void cargar_ciudades(){
        ciudades = new ListaSimLigada<String>();
        String nomArc = "Ciudades.txt";
        try {
            BufferedReader br = new BufferedReader(new FileReader(nomArc));
            String l;
            l= br.readLine();
            while (l != null) {
                ciudades.inserta_final(l);
                l = br.readLine();
            }
            br.close();
        } catch (IOException ioe){
            JOptionPane.showMessageDialog(null, "Archivo no encontrado", "Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    public void cargar_direcciones(){
        direcciones = new ListaSimLigada<String>();
        String nomArc = "Direcciones.txt";
        try {
            BufferedReader br = new BufferedReader(new FileReader(nomArc));
            String l;
            l= br.readLine();
            while (l != null) {
                direcciones.inserta_final(l);
                l = br.readLine();
            }
            br.close();
        } catch (IOException ioe){
            JOptionPane.showMessageDialog(null, "Archivo no encontrado", "Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    public void cargar_emails(){
        emails = new ListaSimLigada<String>();
        String nomArc = "Emails.txt";
        try {
            BufferedReader br = new BufferedReader(new FileReader(nomArc));
            String l;
            l= br.readLine();
            while (l != null) {
                emails.inserta_final(l);
                l = br.readLine();
            }
            br.close();
        } catch (IOException ioe){
            JOptionPane.showMessageDialog(null, "Archivo no encontrado", "Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    public void cargar_empresas(){
        empresas = new ListaSimLigada<String>();
        String nomArc = "Empresas.txt";
        try {
            BufferedReader br = new BufferedReader(new FileReader(nomArc));
            String l;
            l= br.readLine();
            while (l != null) {
                empresas.inserta_final(l);
                l = br.readLine();
            }
            br.close();
        } catch (IOException ioe){
            JOptionPane.showMessageDialog(null, "Archivo no encontrado", "Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    public void cargar_nacionalidades(){
        nacionalidades = new ListaSimLigada<String>();
        String nomArc = "Nacionalidades.txt";
        try {
            BufferedReader br = new BufferedReader(new FileReader(nomArc));
            String l;
            l= br.readLine();
            while (l != null) {
                nacionalidades.inserta_final(l);
                l = br.readLine();
            }
            br.close();
        } catch (IOException ioe){
            JOptionPane.showMessageDialog(null, "Archivo no encontrado", "Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    public void cargar_rfc(){
        rfc = new ListaSimLigada<String>();
        String nomArc = "rfc.txt";
        try {
            BufferedReader br = new BufferedReader(new FileReader(nomArc));
            String l;
            l= br.readLine();
            while (l != null) {
                rfc.inserta_final(l);
                l = br.readLine();
            }
            br.close();
        } catch (IOException ioe){
            JOptionPane.showMessageDialog(null, "Archivo no encontrado", "Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public String generar_nombres(){
        String nom="";
        Integer n=(int)(Math.random()*(nombres.tamañoLista()-1))+1;
        nom=nombres.obtenDatoEnPosicion(n);
        return nom;
    }
    public String generar_apellidos_maternos(){
        String ap_m="";
        Integer n=(int)(Math.random()*(apellidos_maternos.tamañoLista()-1))+1;
        ap_m=apellidos_maternos.obtenDatoEnPosicion(n);
        return ap_m;
    }
    public String generar_apellidos_paternos(){
        String ap_p="";
        Integer n=(int)(Math.random()*(apellidos_paternos.tamañoLista()-1))+1;
        ap_p=apellidos_paternos.obtenDatoEnPosicion(n);
        return ap_p;
    }
    public String generar_ciudades(){
        String ciud="";
        Integer n=(int)(Math.random()*(ciudades.tamañoLista()-1))+1;
        ciud=ciudades.obtenDatoEnPosicion(n);
        return ciud;
    }
    public String generar_direcciones(){
        String dir="";
        Integer n=(int)(Math.random()*(direcciones.tamañoLista()-1))+1;
        dir=direcciones.obtenDatoEnPosicion(n);
        return dir;
    }
    public String generar_emails(){
        String email="";
        Integer n=(int)(Math.random()*(emails.tamañoLista()-1))+1;
        email=emails.obtenDatoEnPosicion(n);
        return email;
    }
    public String generar_empresas(){
        String emp="";
        Integer n=(int)(Math.random()*(empresas.tamañoLista()-1))+1;
        emp=empresas.obtenDatoEnPosicion(n);
        return emp;
    }
    public String generar_nacionalidades(){
        String nac="";
        Integer n=(int)(Math.random()*(nacionalidades.tamañoLista()-1))+1;
        nac=nacionalidades.obtenDatoEnPosicion(n);
        return nac;
    }
    public String generar_numeros_telefono(){ 
        String lada = String.valueOf((int)(Math.random()*888)+111);
        String num = String.valueOf((int)(Math.random()*8888888)+1111111);
        return lada + num;
    }
    public String generar_rfc(){
        String r="";
        Integer n=(int)(Math.random()*(rfc.tamañoLista()-1))+1;
        r=rfc.obtenDatoEnPosicion(n);
        return r;
    }
    
    public int generar_codigo_postal(){
        int c_p = (int)(Math.random()*89999)+10000;
        return c_p;
    }
    public int generar_edad(){
        int edad = (int) (Math.random()*67)+18;
        return edad;
    }
    public int generar_sueldo(){
        int sueldo = (int)(Math.random()*36499)+9500;
        return sueldo;
    }
    public double generar_peso(){
        double peso = (double)(Math.random()*60)+40.5;
        return (int)peso;
    }
    public String generar_fecha_nacimiento(){
        Calendar unaFecha;
        int numero = 0;
        Random aleatorio;
        aleatorio = new Random();
        unaFecha = Calendar.getInstance();
        unaFecha.set (aleatorio.nextInt(67)+1931, aleatorio.nextInt(12)+1, aleatorio.nextInt(30)+1);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMMM/yyyy");
        return sdf.format(unaFecha.getTime());
    }
    public String generar_estado_civil(){
        String edo_civil="";
        int edo=(int) (Math.random()*99)+1;
        if(edo<15){
            edo_civil = "Soltero(a)";
        }else if(edo>15 && edo<40){
            edo_civil = "Casado(a)";
        }else if(edo>40 && edo<55){
            edo_civil = "Divorcido(a)";
        }else if(edo>55 && edo<70){
            edo_civil = "Pareja de hecho";
        }else if(edo>70 && edo<85){
            edo_civil = "Viudo(a)";
        }else if(edo>85){
            edo_civil = "Unión libre";
        }
        return edo_civil;
    }

    public ListaSimLigada<String> getNombres() {
        return nombres;
    }

    public void setNombres(ListaSimLigada<String> nombres) {
        this.nombres = nombres;
    }

    public ListaSimLigada<String> getApellidos_maternos() {
        return apellidos_maternos;
    }

    public void setApellidos_maternos(ListaSimLigada<String> apellidos_maternos) {
        this.apellidos_maternos = apellidos_maternos;
    }

    public ListaSimLigada<String> getApellidos_paternos() {
        return apellidos_paternos;
    }

    public void setApellidos_paternos(ListaSimLigada<String> apellidos_paternos) {
        this.apellidos_paternos = apellidos_paternos;
    }

    public ListaSimLigada<String> getCiudades() {
        return ciudades;
    }

    public void setCiudades(ListaSimLigada<String> ciudades) {
        this.ciudades = ciudades;
    }

    public ListaSimLigada<String> getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(ListaSimLigada<String> direcciones) {
        this.direcciones = direcciones;
    }

    public ListaSimLigada<String> getEmails() {
        return emails;
    }

    public void setEmails(ListaSimLigada<String> emails) {
        this.emails = emails;
    }

    public ListaSimLigada<String> getEmpresas() {
        return empresas;
    }

    public void setEmpresas(ListaSimLigada<String> empresas) {
        this.empresas = empresas;
    }

    public ListaSimLigada<String> getNacionalidades() {
        return nacionalidades;
    }

    public void setNacionalidades(ListaSimLigada<String> nacionalidades) {
        this.nacionalidades = nacionalidades;
    }

    public ListaSimLigada<String> getRfc() {
        return rfc;
    }

    public void setRfc(ListaSimLigada<String> rfc) {
        this.rfc = rfc;
    }
    
    public void generarArchivo(String nombre,String linea){
        CsvWriter writer = new CsvWriter ("C:/Users/yingy/Desktop/" + nombre + ".csv");
        try {

            writer.write(linea);
            writer.endRecord();

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            writer.close();

        }
    }
}
