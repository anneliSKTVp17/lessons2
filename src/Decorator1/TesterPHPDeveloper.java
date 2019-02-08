/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator1;

import Decorator0.Developer;

/**
 *
 * @author user
 */
public class TesterPHPDeveloper extends DeveloperDecorator{
 
    public TesterPHPDeveloper(Developer developer){
       super(developer);
    }
    
    public String makeCodeTesting(){
        return " ... testing code...";
    }
    
    @Override
    public String makeJob(){
        return super.makeJob() + makeCodeTesting();
    }
}
