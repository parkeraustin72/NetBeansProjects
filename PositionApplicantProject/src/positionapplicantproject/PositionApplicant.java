package positionapplicantproject;

import java.text.DecimalFormat;

public class PositionApplicant {

    DecimalFormat fmt1 = new DecimalFormat("0.##");

    private String applicantName;
    private String positionName;
    private int applicantNumber;
    private double introCompProg;
    private double advCompProg;
    private double networking;
    private double operatingSystems;
    private double databaseSystems;
    private double algorithms;

    public double calculateAverageScore() {
        double averageScore;
        averageScore = (introCompProg + advCompProg + networking + operatingSystems
                + databaseSystems + algorithms) / 6.0;
        return averageScore;

    }

    public double calculateStandardDeviation() {
        double standardDeviation;
        
        double variOne, variTwo, variThree, variFour, variFive, variSix;
        variOne = (introCompProg - calculateAverageScore());
        variTwo = (advCompProg - calculateAverageScore());
        variThree = (networking - calculateAverageScore());
        variFour = (operatingSystems - calculateAverageScore());
        variFive = (databaseSystems - calculateAverageScore());
        variSix = (algorithms - calculateAverageScore());
        
        double introComp, advComp, network, operating, database, algo, finalCalc;
        
        introComp = Math.pow(variOne, 2);
        advComp = Math.pow(variTwo, 2);
        network = Math.pow(variThree, 2);
        operating = Math.pow(variFour, 2);
        database = Math.pow(variFive, 2);
        algo = Math.pow(variSix, 2);
        
        finalCalc = ((introComp + advComp + network + operating + database + algo) / (6 - 1));
        
        standardDeviation = Math.sqrt(finalCalc);
        return standardDeviation;
    }
    
    @Override
    public String toString() {
        String output;

        output = "Applicant Name: " + applicantName + "\n"
                + "Position Name: " + positionName + "\n"
                + "Intro to Comp Prog: " + introCompProg + "\n"
                + "Adv Comp Prog: " + advCompProg + "\n"
                + "Networking: " + networking + "\n"
                + "Operating Systems: " + operatingSystems + "\n"
                + "Database Systems: " + databaseSystems + "\n"
                + "Algorithms: " + algorithms + "\n"
                + "Average Score: " + fmt1.format(calculateAverageScore());

        return output;
    }

    public PositionApplicant(String applicantName) {
        this.applicantName = applicantName;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public PositionApplicant(int applicantNumber, double introCompProg, double advCompProg, double networking, double operatingSystems, double databaseSystems, double algorithms) {
        this.applicantNumber = applicantNumber;
        this.introCompProg = introCompProg;
        this.advCompProg = advCompProg;
        this.networking = networking;
        this.operatingSystems = operatingSystems;
        this.databaseSystems = databaseSystems;
        this.algorithms = algorithms;

    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public PositionApplicant(String applicantName, String positionName, int applicantNumber, double introCompProg, double advCompProg, double networking, double operatingSystems, double databaseSystems, double algorithms) {
        this.applicantName = applicantName;
        this.applicantNumber = applicantNumber;
        this.introCompProg = introCompProg;
        this.advCompProg = advCompProg;
        this.networking = networking;
        this.operatingSystems = operatingSystems;
        this.databaseSystems = databaseSystems;
        this.algorithms = algorithms;
        this.positionName = positionName;
    }

    public int getApplicantNumber() {
        return applicantNumber;
    }

    public void setApplicantNumber(int applicantNumber) {
        this.applicantNumber = applicantNumber;
    }

    public double getIntroCompProg() {
        return introCompProg;
    }

    public void setIntroCompProg(double introCompProg) {
        this.introCompProg = introCompProg;
    }

    public double getAdvCompProg() {
        return advCompProg;
    }

    public void setAdvCompProg(double advCompProg) {
        this.advCompProg = advCompProg;
    }

    public double getNetworking() {
        return networking;
    }

    public void setNetworking(double networking) {
        this.networking = networking;
    }

    public double getOperatingSystems() {
        return operatingSystems;
    }

    public void setOperatingSystems(double operatingSystems) {
        this.operatingSystems = operatingSystems;
    }

    public double getDatabaseSystems() {
        return databaseSystems;
    }

    public void setDatabaseSystems(double databaseSystems) {
        this.databaseSystems = databaseSystems;
    }

    public double getAlgorithms() {
        return algorithms;
    }

    public void setAlgorithms(double algorithms) {
        this.algorithms = algorithms;
    }

}
