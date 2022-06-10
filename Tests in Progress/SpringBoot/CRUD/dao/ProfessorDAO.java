/*
* @(#)ProfessorDAO.java
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
import vo.Professor;

/**
 * Class ProfessorDAO
 *
 * @author wagner.bruggemann
 */
public class ProfessorDAO {
    private List<Professor> professores;

    public ProfessorDAO() {
        this.professores = new ArrayList<>();
    }
    
        public void cadastraProfessor(Professor professor) {
            professor.setId(professor.getCpf());
            professores.add(professor);
        }
    
        public List<Professor> obtemProfessores(){
            return professores;
        }
}
