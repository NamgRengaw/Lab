/*
* @(#)ProfessorController.java
*
* Copyright (c) J-Tech Solucoes em Informatica.
* All Rights Reserved.
*
* This software is the confidential and proprietary information of J-Tech.
* ("Confidential Information"). You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms of the
* license agreement you entered into with J-Tech.
*/
package controller;

import java.util.Scanner;
import vo.Professor;

/**
 * Class ProfessorController
 *
 * @author wagner.bruggemann
 */
public class ProfessorController {
    
    public Professor criarProfessor() {
        Scanner teclado = new Scanner(System.in);
        Professor professor = new Professor();
        
        System.out.print("Nome:  ");
        String nome = teclado.nextLine();
        System.out.print("Idade:  ");
        Integer idade = teclado.nextInt();
        System.out.print("CPF:  ");
        long cpf = teclado.nextLong();
        System.out.print("Materia o qual leciona:  ");
        String materia = teclado.next();
        System.out.print("==== Cadastro criado ===\n");
         
        professor.setNome(nome);
        professor.setIdade(idade);
        professor.setCpf(cpf);
        professor.setMateria(materia);;
        
        return professor;
    }
    
}
