class Head{
    private String colorOfEyes;
    private String hairColor;
    private String sizeOfNose;
    private String sizeOfEars;

    Head(String c, String h, String sn, String se){
        colorOfEyes = c;
        hairColor = h;
        sizeOfEars = se;
        sizeOfNose = sn;
    }

    String getColorOfEyes(){
        return colorOfEyes;
    }
    String getHairColor(){
        return hairColor;
    }
    String getSizeOfNose(){
        return sizeOfNose;
    }
    String getSizeOfEars(){
        return sizeOfEars;
    }

}

class Hand{
    private double length;
    private double weight;

    Hand(double l, double w){
        length = l;
        weight = w;
    }

    double getLength(){
        return length;
    }
    double getWeight(){
        return weight;
    }
}

class Leg{
    private double length;
    private double weight;

    Leg(double l, double w){
        length = l;
        weight = w;
    }

    double getLength(){
        return length;
    }
    double getWeight(){
        return weight;
    }

}

class Human {
    private Leg firstLeg;
    private Leg secondLeg;
    private Hand firstHand;
    private Hand secondHand;
    private Head head;

    Human(String c, String h, String sn, String se){
        head = new Head(c, h, sn, se);
        System.out.println("Colour of eyes: " + c + "\nColour of hair: " + h + "\nSize of nose: " + sn + "\nSize of ears: " + se);
    }

    void setLegs(double l, double w){
        firstLeg = new Leg(l, w);
        secondLeg = new Leg(l, w);
        System.out.println("Weight of Legs(KG): " + firstLeg.getWeight() + "\nLength of Legs(cm): " + firstLeg.getLength());
    }

    void setHands(double l, double w){
        firstHand = new Hand(l, w);
        secondHand = new Hand(l, w);
        System.out.println("Weight of Hands(KG): " + firstHand.getWeight() + "\nLength of Hands(cm): " + firstHand.getLength());
    }
}

public class HumanTest{
    public static void main(String[] args) {
        Human human = new Human("green", "brown", "mid", "small");
        human.setHands(68.4, 6.8);
        human.setLegs(83.6, 24.4);
    }
}