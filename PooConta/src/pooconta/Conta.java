/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooconta;


public class Conta {
    public int numConta;
    private String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public void estadoAtual (){
        System.out.println("----------------------------");
        System.out.println("Conta: "+ this.getNumConta());
        System.out.println("Tipo: "+ this.getTipo());
        System.out.println("Dono: "+ this.getDono());
        System.out.println("Saldo: "+ this.getSaldo());
        System.out.println("Status: "+ this.getStatus());
        
    }
    //Método Contrutor
    public Conta(){
        this.saldo = 0; //this.Saldo(0);
        this.status = false; //this.setStatus(false);
    }
    
    //Métodos específicos
    public void abrirConta(String t){
        this.setTipo(t); //this.tipo = t; 
        this.setStatus(true); //this.status = true; acesso ao atributo
        if ("CC".equals(t)){
            this.setSaldo(50); //this.saldo = 50;
        } else if ("CP".equals(t)) {
             this.setSaldo(150);
                    }
        System.out.println("Conta aberta com sucesso!");
    }  
    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("A conta tem dinheiro e nao pode ser encerrada");
    } 
        else if (this.getSaldo() < 0) {
            System.out.println("A conta tem debito e nao pode ser encerrada");
    }   else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    public void depositar (float v){
        if (this.getStatus()){
            this.setSaldo (this.getSaldo() + v); //this.saldo = this.saldo + v;
            System.out.println("Desposito realizado na conta de " + this.getDono());
        } else {
            System.out.println("Impossivel depositar em uma conta fechada! ");
        }
            
    }
    public void sacar(float v){
       if (this.getStatus()){
           if (this.getSaldo() >= v){
           this.setSaldo(this.getSaldo() - v);
           System.out.println("Saque realizado na conta de " + this.getDono());
       } else {
           System.out.println("Saldo insuficiente para saque! ");
       } 
      } else {
           System.out.println("Impossivel sacar de uma conta fechada! ");
       }
    }
    
    public void pagarMensal(){
        int v = 0;
        if (this.getTipo()== "CC"){
            v = 12;
        }else if (this.getTipo() == "CP"){
            v = 20;
        }
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());
        } else {
            System.out.println("Impossivel pagar uma conta fechada");
        }
        
    }
    
    
    //Métodos especiais e/ou métodos modificadores Getters e Setters
    public int getNumConta() {
        return numConta;
    }
    
    public void setNumConta(int n) {
        this.numConta = n;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean st) {
        this.status = st;
    }
    
    }
    

