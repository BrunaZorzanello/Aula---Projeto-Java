/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulapoo5;
public class AulaPOO5 {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setnumConta(1111);
        p1.setDono("JUBI");
        p1.abrirConta("CC");
        
        ContaBanco  p2 = new ContaBanco();
        p2.setnumConta(2222);
        p2.setDono("Creuza");
        p2.abrirConta("CP");
        
        p1.depositar(100);
        p2.depositar(500);
        p2.sacar(100);
        p1.fecharConta();
        p1.sacar(150);
        
        
        p1.estadoAtual();
        System.out.println("------------------");
        p2.estadoAtual();
    }
    
}
