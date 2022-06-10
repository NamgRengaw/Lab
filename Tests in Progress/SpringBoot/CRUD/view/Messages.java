/*
* @(#)Messages.java
*
* Copyright (c) J-Tech Solucoes em Informatica.
* All Rights Reserved.
*
* This software is the confidential and proprietary information of J-Tech.
* ("Confidential Information"). You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms of the
* license agreement you entered into with J-Tech.
*/
package view;

import java.util.Scanner;
import util.Util;

/**
 * Class Messages
 *
 * @author wagner.bruggemann
 */
public class Messages {
    
    int escolhaModo = 0;
    int escolhaTipo = 0;
    
    Util util = new Util();
    
    public static void inicio() {
        System.out.println("-------------------------------------");
        System.out.println("|       Cadastro escola xxxxxxxx     |");
        System.out.println("-------------------------------------");
    }
    public void modosDisponiveis() {
        while(escolhaModo <= 0 || escolhaModo > 4) {
            System.out.println("- Escolha o modo de operação: ");
            System.out.println("1 - Cadastro");
            System.out.println("2 - Alteração");
            System.out.println("3 - Visualização");
            System.out.println("4 - Exclusão");
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("Digite a opção: " ); 
                escolhaModo = scanner.nextInt();
                util.limpaConsole();
            }catch (Exception e) {
                System.err.println("Digite um número válido!");
            }
        }

    }
    public void tiposDisponiveis() {
        System.out.println("- Tipo do cadastro: ");
        System.out.println("1 - Aluno");
        System.out.println("2 - Professor");
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Digite a opção: " ); 
            escolhaTipo = scanner.nextInt();
            util.limpaConsole();
        }catch (Exception e) {
            System.out.println("Digite um número válido!");
        }
    } 
     public void confirmaçãoTiposEModos() {
         
         switch(escolhaModo) {
             case 1: System.out.println("Você escolheu o modo cadastro.");
                     break;
             case 2: System.out.println("Você escolheu o modo alteração");
                     break;
             case 3: System.out.println("Você escolheu o modo visualização");
                     break;
             case 4: System.out.println("Vocẽ escolheu o modo exclusão");
                     break;
         }
          switch(escolhaTipo) {
             case 1: System.out.println("Você escolheu o tipo aluno.");
                     util.confirmacao();
                     util.limpaConsole();
                     break;
             case 2: System.out.println("Você escolheu o tipo professor");
                     util.confirmacao();
                     util.limpaConsole();
                     break;
          }
     }
     
     public void introBDAluno() {
         System.out.println(
                 "===============================================\n"
               + "             Visuzalização Aluno\n"
               + "------------------------------------------------\n"
                 );
     }
     
     public void introBDProfessor() {
         System.out.println(
                 "===============================================\n"
               + "             Visuzalização Professor\n"
               + "-----------------------------------------------\n"
                 );
     }
    
    public int getEscolhaModo() {
        return escolhaModo;
    }
    
    public int getEscolhaTipo() {
        return escolhaTipo;
    }
} 
