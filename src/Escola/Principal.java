/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Escola;

/**
 *
 * @author cecil
 */
public class Principal  {
     public static void main (String []args) {
         MediaNotas dados = new MediaNotas ();
          
         dados.setNome("Lucas Souza");
         dados.setMatricula("2021190002");
         dados.setNotaHumnas(8);
         dados.setNotaExtas(10);
         dados.setMedia(9);
         dados.setSituacao("Aprovado!");
         
         dados.imprimirdadosaluno();
     }
}
