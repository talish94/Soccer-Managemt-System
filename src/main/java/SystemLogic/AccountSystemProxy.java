package SystemLogic;

import Teams.Team;

public class AccountSystemProxy implements IExternalSystem, IAccountSystem {
    AccountSystem accountSystem= new AccountSystem();
    DB db = DB.getInstance();
    Payment payment;

    @Override
    public boolean connectToSystem() {
        return accountSystem.connectToSystem();
    }


    @Override
    public boolean addPayment(String teamName, String date, double amount) {
        Team team = db.getTeam(teamName);
        if(team==null){
            return false;
        }
        if(team.getBudget()>=amount){
            payment = new Payment(teamName,date,amount);
            return true;
        }
        else{
            return false;
        }
    }
}
