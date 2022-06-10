/*
* @(#)AlunoController.java
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
import dao.AlunoDAO;
import vo.Aluno;

/**
 * Class AlunoController
 *
 * @author wagner.bruggemann
 */
public class AlunoController {
    
    public Aluno criarAluno() {
        Scanner teclado = new Scanner(System.in);
        Aluno aluno = new Aluno();
        
        System.out.println("Nome:");
        String nome = teclado.nextLine();
        
        System.out.println("Idade: ");
        Integer idade = teclado.nextInt();
        
        System.out.println("CPF: ");
        Long cpf = teclado.nextLong();
        
        System.out.println("Serie: ");
        String serie = teclado.nextLine();
        System.out.println("Cadastro");
        
        
        aluno.setNome(nome);
        aluno.setIdade(idade);
        aluno.setCpf(cpf);
        aluno.setSerie(serie);
        
        return aluno;
    }
}
