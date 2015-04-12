/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Entity.Member;
import java.util.List;
import Entity.Team;




/**
 *
 * @author Steffen
 */
public interface ControlIF {
    List<Member> getMembers();
    List<Team> getTeam();
    void createMember(Member member); //Tilføjer et nyt member til collection
    void createTeam(List<Member> members); // Opretter nyt team og tilføjer det til listen af teams
    void deleteMemberFromTeam(Member member,Team team); //Fjerner member fra et team
    void deleteMemberFromOrganisation(Member member);
    void deleteTeam(Team team);
    //void changeMemberName(Member member, String newName);
}
