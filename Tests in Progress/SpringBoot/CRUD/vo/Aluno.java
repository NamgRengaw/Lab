/*
* @(#)Create.java
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
 * Class Create
 *
 * @author wagner.bruggemann
 */
public class Aluno extends Pessoa {

    public String serie;
    
    Scanner scanner = new Scanner(System.in);

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    @Override
    public String toString() {
        return  "[ID: " + getId()+ "]" + " Aluno "+ getNome() +"[Serie: " + serie + "; Idade: " + getIdade() + "; Cpf: " + getCpf() + "]";
    }
    
    
    
}
