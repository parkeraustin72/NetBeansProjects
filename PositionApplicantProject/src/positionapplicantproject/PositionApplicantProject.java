package positionapplicantproject;

public class PositionApplicantProject {

    public static void main(String[] args) {
        // TODO code application logic here
        PositionApplicant theApplicant = new PositionApplicant("Ada Lovelace");
        System.out.println("The applicantName name is " + theApplicant.getApplicantName());

        theApplicant.setApplicantNumber(3);
        theApplicant.setIntroCompProg(93.0);
        theApplicant.setAdvCompProg(89.0);
        theApplicant.setOperatingSystems(73.0);
        theApplicant.setNetworking(63.0);
        theApplicant.setDatabaseSystems(88.0);
        theApplicant.setAlgorithms(60.0);

        theApplicant.setApplicantName("Grace Hopper");
        System.out.println("The changed applicant name is " + theApplicant.getApplicantName());
        PositionApplicant theOtherApplicant = new PositionApplicant("Grace Hopper", "Programmer II", 2, 93.17, 90.85, 78.55, 82.67, 89.63, 99.87);

        PositionApplicant thethirdApplicant = new PositionApplicant("John Henry", "Programmer I", 4, 99.87, 94.96, 72.50, 85.68, 78.89, 94.32);

        thethirdApplicant.setIntroCompProg(92.35);

        System.out.println("The applicant number is: " + theApplicant.getApplicantNumber());
        System.out.println("Intro Comp Prog: " + theApplicant.getIntroCompProg());
        System.out.println("Adv Comp Prog: " + theApplicant.getAdvCompProg());
        System.out.println("Operating Systems: " + theApplicant.getOperatingSystems());
        System.out.println("Networking: " + theApplicant.getNetworking());
        System.out.println("Database Systems: " + theApplicant.getDatabaseSystems());
        System.out.println("Algorithms: " + theApplicant.getAlgorithms());

        System.out.println("Applicant Name: " + theOtherApplicant.getApplicantName());
        System.out.println("Position Name: " + theOtherApplicant.getPositionName());
        System.out.println("Intro Comp Prog: " + theOtherApplicant.getIntroCompProg());
        System.out.println("Advanced Comp Prog: " + theOtherApplicant.getAdvCompProg());
        System.out.println("Operating Systems: " + theOtherApplicant.getOperatingSystems());
        System.out.println("Networking: " + theOtherApplicant.getNetworking());
        System.out.println("Database Systems: " + theOtherApplicant.getDatabaseSystems());
        System.out.println("Algorithms: " + theOtherApplicant.getAlgorithms());
        System.out.println("The average score in computing classes is " + theOtherApplicant.calculateAverageScore());
        System.out.println(theOtherApplicant.toString());
        System.out.println("The third applicant is: " + thethirdApplicant);
        System.out.println("The Changed value for intro comp prog is: " + thethirdApplicant.getIntroCompProg());
        System.out.println("The standard Deviation calculation is: " + thethirdApplicant.calculateStandardDeviation());

    }

}
