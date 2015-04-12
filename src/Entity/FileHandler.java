package Entity;

import Boundry.GUI;

import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steffen
 */
public class FileHandler implements FileHandlerIF{
    List<Member> members;
    List<Team> teams;
    
    
    public FileHandler(){
        members = new ArrayList();
        teams = new ArrayList();
        
        
    }
    
    @Override
    public List<Member> readMembers() {
        try {
            Scanner scan = new Scanner(new File("members.txt"));
            while (scan.hasNext()){
                String line = scan.nextLine();
                
                String[] stumper = line.split(", ");
                String name = stumper[0];
                int adm = Integer.parseInt(stumper[1]);
                int ana = Integer.parseInt(stumper[2]);
                int cre = Integer.parseInt(stumper[3]);
                int fin = Integer.parseInt(stumper[4]);
                Member m = new Member(name, adm, ana, cre, fin);
                members.add(m);
                
                
            
            }
           
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } 
       
        return members;
        
    }

    @Override
    public List<Team> readTeams() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean writeMembers2File() {
        try {
            FileWriter fw = new FileWriter(new File("Destination.txt"));
            for (Member m : members){
                String member = m.getName()+ ", " + m.getAdm() + ", " + m.getAna() + ", " + m.getCre() + ", " + m.getFin() + "\n";
                fw.write(member);
            }
            fw.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
        return true;
    }

    @Override
    public boolean writeTeams2File(List<Team> teams) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addMember2Team(Team team, Member member) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeMemberFromTeam(Team team, Member member) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeTeam(Team team) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addTeam(Team team) {
        
        
    }

    @Override
    public void addMember(Member member) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeMember(Member member) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
