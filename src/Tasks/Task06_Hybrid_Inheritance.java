package Tasks;


    interface ManagerDuties {
        void manageProject();
    }

    interface TeamLeadDuties {
        void conductMeeting();
    }

    // Hybrid: class + multiple interfaces
    class SeniorEmployee implements ManagerDuties, TeamLeadDuties {
        public void manageProject() {
            System.out.println("Managing project timelines and deliveries.");
        }

        public void conductMeeting() {
            System.out.println("Conducting team meetings.");
        }
    }

    class ProjectLead extends SeniorEmployee {
        void guideTeam() {
            System.out.println("Guiding the development and QA teams.");
        }
    }

    public class Task06_Hybrid_Inheritance {
        public static void main(String[] args) {
            ProjectLead pl = new ProjectLead();
            pl.manageProject();     // from ManagerDuties
            pl.conductMeeting();    // from TeamLeadDuties
            pl.guideTeam();         // from ProjectLead
        }
    }

