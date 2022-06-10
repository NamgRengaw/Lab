/*
* @(#)App.java
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
import controller.AlunoController;
import controller.ProfessorController;
import dao.AlunoDAO;
import dao.ProfessorDAO;
import util.Util;
import vo.Aluno;
import vo.Professor;

/**
 * Class App
 *
 * @author wagner.bruggemann
 */
public class App {

    public static void main(String args[]) {

        Scanner teclado = new Scanner(System.in);
        
        AlunoDAO alunoDAO = new AlunoDAO();
        AlunoController alunoController = new AlunoController();

        ProfessorDAO professorDAO = new ProfessorDAO();
        ProfessorController professorController = new ProfessorController();
        
        Util util = new Util();
        Messages msg = new Messages();

        Messages.inicio();

        while (true) {
            msg.modosDisponiveis();
            msg.tiposDisponiveis();
            msg.confirmaçãoTiposEModos();
            
            switch (msg.escolhaModo) {
                case 1:
                    if (msg.getEscolhaTipo() == 1) {
                        Aluno alunoCriado = alunoController.criarAluno();
                        alunoDAO.cadastraAlunos(alunoCriado);
                        
                        util.confirmacao();
                    } else {
                        Professor professorCriado = professorController.criarProfessor();
                        professorDAO.cadastraProfessor(professorCriado);
                        
                        util.confirmacao();
                    }
                    break;
                    
                case 2:

                case 3:
                    if (msg.getEscolhaTipo() == 1) {
                        msg.introBDAluno();
                        for (Aluno alunoTemp : alunoDAO.obtemAlunos()) {
                            System.out.println(alunoTemp.toString());   
                        }
                        util.confirmacao();
                        util.limpaConsole();
                    }else {
                        msg.introBDProfessor();
                        for (Professor professorTemp : professorDAO.obtemProfessores()) {
                            System.out.println(professorTemp);   
                            System.out.println("----------------------------------------------------------------------------------------------");
                        }
                        util.confirmacao();
                        util.limpaConsole();
                    }
                case 4:

                case 5:
                    

                default:

                    break;
            }
            msg.escolhaModo = 0;

        }
    }
}
