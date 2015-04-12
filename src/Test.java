
import Entity.FileHandler;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steffen
 */
public class Test {
    public static void main(String[] args){
        FileHandler fh = new FileHandler();
        fh.readMembers();
        fh.writeMembers2File();
        
    }
            
}
