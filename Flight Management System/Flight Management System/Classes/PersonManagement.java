package Classes;

import Interfaces.PersonManagementInterface;

public class PersonManagement implements PersonManagementInterface {
    Passanger[] passangers;
    Crew[] crews;
    public PersonManagement() {
        passangers = new Passanger[100];
        crews = new Crew[100];
    }

    public boolean insertPassanger(Passanger passanger) {
        boolean flag = false;
        for(int i=0; i<passangers.length; i++) {
            if(passangers[i] == null) {
                passangers[i] = passanger;
                flag = true;
                break;
            }
        }
        return flag;
    }
    public boolean removePassanger(String ID) {
        boolean flag = false;
        for(int i=0; i<passangers.length; i++) {
            if(passangers[i] != null && passangers[i].getNID().equals(ID)) {
                passangers[i] = null;
                flag = true;
                break;
            }
        }
        return flag;
    }
    public Passanger searchPassanger(String iD3) {
        Passanger flag = null;
        for(int i=0; i<passangers.length; i++) {
            if(passangers[i] != null && passangers[i].getNID().equals(iD3)) {
                flag = passangers[i];
                break;
            }
        }
        return flag;
    }
    public void showAllPassanger() {
        for(int i=0; i<passangers.length; i++) {
            if(passangers[i] != null) {
                passangers[i].showDetails();
            }
        }
    }
    public boolean insertCrew(Crew crew) {
        boolean flag = false;
        for(int i=0; i<crews.length; i++) {
            if(crews[i] == null) {
                crews[i] = crew;
                flag = true;
                break;
            }
        }
        return flag;
    }
    public boolean removeCrew(String ID) {
        boolean flag = false;
        for(int i=0; i<crews.length; i++) {
            if(crews[i] != null && crews[i].getNID().equals(ID)) {
                crews[i] = null;
                flag = true;
                break;
            }
        }
        return flag;
    }
    public Crew searchCrew(String ID) {
        Crew flag = null;
        for(int i=0; i<crews.length; i++) {
            if(crews[i] != null && crews[i].getNID().equals(ID)) {
                flag = crews[i];
                break;
            }
        }
        return flag;
    }
    public void showAllCrews() {
        for(int i=0; i<crews.length; i++) {
            if(crews[i] != null) {
                crews[i].showDetails();
            }
        }
    }
}
