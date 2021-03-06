/*
* @(#)CadastroAlunoDAO.java
*
* Copyright (c) J-Tech Solucoes em Informatica.
* All Rights Reserved.
*
* This software is the confidential and proprietary information of J-Tech.
* ("Confidential Information"). You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms of the
* license agreement you entered into with J-Tech.
*/
package dao;

import java.util.ArrayList;
import java.util.List;
import vo.Aluno;

/**
 * Class CadastroAlunoDAO
 *
 * @author wagner.bruggemann
 */

public class AlunoDAO {

    private List<Aluno> alunos;
    
    public AlunoDAO() {
        alunos = new ArrayList<>();
    }

    public void cadastraAlunos(Aluno aluno){
        aluno.setId(alunos.size() + 1);
        alunos.add(aluno);
    }
    
    public List<Aluno> obtemAlunos(){
        return alunos;
    }
    
    
}
