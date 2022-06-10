/*
* @(#)Professor.java
*
* Copyright (c) J-Tech Solucoes em Informatica.
* All Rights Reserved.
*
* This software is the confidential and proprietary information of J-Tech.
* ("Confidential Information"). You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms of the
* license agreement you entered into with J-Tech.
*/
package vo;

import java.util.Scanner;

/**
 * Class Professor
 *
 * @author wagner.bruggemann
 */
public class Professor extends Pessoa {
        
      public String materia;
       
      Scanner teclado = new Scanner(System.in);
         
    
    public String getMateria() {
        return materia;
    }
    
    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return  "[ID: " + getId()+ "]" + " Professor "+ getNome() +"[Materia: " + materia + "; Idade: " + getIdade() + "; Cpf: " + getCpf() + "]";
    }
}
