/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.List;

/**
 *
 * @author Steffen
 */
public interface FileHandlerIF {
    List<Member> readMembers();
    List<Team> readTeams();
    boolean writeMembers2File();
    boolean writeTeams2File(List<Team> teams);
    void addMember2Team (Team team, Member member);
    void removeMemberFromTeam(Team team, Member member);
    void removeTeam(Team team);
    void addTeam(Team team);
    void addMember(Member member);
    void removeMember(Member member);
    
}
