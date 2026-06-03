class Company { void generate() { System.out.println("Company: Generating Value"); } }
class CEO extends Company { void supervise() { System.out.println("CEO: Supervising"); } }
class Executive extends CEO { void execute() { System.out.println("Executive: Executing"); } }
class Director extends Executive { void decision() { System.out.println("Director: Making Decisions"); } }
class SeniorManager extends Director { void coOrdinate() { System.out.println("Sr Manager: Coordinating"); } }
class Manager extends SeniorManager { void manage() { System.out.println("Manager: Managing"); } }
class Team extends Manager { void develop() { System.out.println("Team: Developing"); } }
class TeamLead extends Team { void guide() { System.out.println("TeamLead: Guiding"); } }
class SeniorEngineer extends TeamLead { void design() { System.out.println("Sr Engineer: Designing"); } }
class Engineer extends SeniorEngineer { void code() { System.out.println("Engineer: Coding"); } }
class DevOps extends Engineer { 
    void cicd() { System.out.println("DevOps: CI/CD Pipeline"); } 

    // Static method for Task 3 requirement
    static void displayTask3() {
        DevOps dev = new DevOps();
        dev.generate(); // From Company
        dev.code();     // From Engineer
        dev.cicd();     // From DevOps
    }
}