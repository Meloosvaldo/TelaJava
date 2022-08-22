/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poocaneta;
//classe
public class Caneta {
    //Atributos
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    
    //Aperte ctrl + i cria contrutor, getters e setters automaticamente ou ctrl+espaço
      //Métodos
    public void status (){
        System.out.println("A caneta: cor " + this.cor + ", modelo " + this.modelo + ", ponta " + this.getPonta()
        + ", com carga de " + this.carga +"%" + " e tampada ou destampada " + this.tampada);
    }
   
    public void rabiscar (){
       if (this.tampada == true){
           System.out.println("Erro.. Nao posso rabiscar");
       } else {
           System.out.println("Estou rabiscando");
       }
    }
    public void tampar (){
        this.tampada = true;
    }
    public void destampar (){
        this.tampada = false;
    }
    //Método Construtor
    public Caneta(String m, String c, float p){
        this.modelo = m;
        this.cor = "Azul";
        this.ponta = 0.7f; // ou this.setPonta (p);
        this.tampar();
    }
    
    //Métodos especiais e/ou métodos modificadores/Getters e Setters
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo (String m){
      this.modelo = m;
    }
    public float getPonta (){
        return this.ponta;
    }
    public void setPonta (float p){
        this.ponta = p;
    }
}
