package Interfaces;

import Classes.*;

public interface PersonManagementInterface {
    boolean insertPassanger(Passanger passanger);
    boolean removePassanger(String ID);
    Passanger searchPassanger(String iD3);
    void showAllPassanger();
    boolean insertCrew(Crew crew);
    boolean removeCrew(String ID);
    Crew searchCrew(String ID);
    void showAllCrews();
}
