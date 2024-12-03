public class Boy extends Person {
    static double ageFactor= 1.1;
    public String talk() {
        return(super.talk() + "... but I love java Class.");
    }
    public String walk() {
        return("I am now walking");
    }

}