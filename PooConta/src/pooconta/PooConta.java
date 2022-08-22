/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooconta;

/**
 *
 * @author user
 */
public class PooConta {

    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.setNumConta (111);
        c1.setDono("Assis");
        c1.abrirConta("CC");
        c1.depositar(100);
        c1.sacar(150);
        c1.fecharConta();
        c1.estadoAtual();
        System.out.println(" ");
        {
            
        Conta c2 = new Conta();
        c2.setNumConta(222);
        c2.setDono("Osvaldo");
        c2.abrirConta("CP");
        c2.depositar(500);
        c2.sacar(100);
        c2.estadoAtual();
    }
    } 
}
