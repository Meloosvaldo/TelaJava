/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poocaneta;


public class PooCaneta {

    
    public static void main(String[] args) {
      Caneta  c1 = new Caneta("Bic Cristal", "", 0);
        //c1.setModelo("Bic"); //acesso atráves do método
        //c1.modelo = "Bic"; acesso atráves do atributo
        //c1.cor = "Azul";
        c1.setPonta(0.6f);
        //c1.ponta = 0.5f; não acesso diretamente, pois é protegido/private
        c1.carga = 90;
        //c1.tampar ();
        c1.status();
        //c1.rabiscar();
        
        System.out.println("");
      Caneta c2 = new Caneta("Bic", "", 0);
        //c2.modelo = "Bic";  
        
        c2.cor = "Vermelha";
        c2.carga = 60;
        c2.status();
        c2.destampar();
        c2.rabiscar();
        
        System.out.println("");
      Caneta c3 = new Caneta("NIC", "", 0);
      c3.status();
      c3.rabiscar();
      
    }
    
}
