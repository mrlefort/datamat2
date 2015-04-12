/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.lang.reflect.Member;
import java.util.List;

/**
 *
 * @author Steffen
 */
public class Team {
    String name;
    List<Member> members;
    public int getNumber(){
        return members.size();
    }
}
