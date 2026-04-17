/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package moduleFive;

/**
 *
 * @author rlal
 */
public interface Organization {
    String orgName="NWMSU";
    String getFullName();
    default String getOrgName(){
        return orgName;
    }
}
