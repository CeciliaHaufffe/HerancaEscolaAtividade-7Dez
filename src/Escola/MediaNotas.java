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
public class MediaNotas extends Notas{
    protected int media;
    protected String situacao; 
   
    public MediaNotas (){
         System.out.println ("-Situação do Aluno:-");
         System.out.println ("Aluno: "+nome);
         System.out.println ("Matrículas: "+matricula);
         System.out.println ("Notas em Humanas: "+notaHumnas);
         System.out.println ("Notas em Extas: "+notaExtas);
         System.out.println ("Media das notas: "+media);
         System.out.println ("Situação do Aluno: "+situacao);
     }

    void imprimirdadosaluno(){
        
    }
            
           
    public int getMedia() {
        return media;
    }

    public void setMedia(int media) {
        this.media = media;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

   
    
}
