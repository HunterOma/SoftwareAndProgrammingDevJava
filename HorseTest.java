class Horse {
    public void name() {
        System.out.println("Name1");
    
    }
    public void birthYear() {
        System.out.println("2000");
    }

}   
 class showHorse extends Horse {
    public void name() {
        System.out.println("Name2");
    
    }
    public void birthYear() {
        System.out.println("2005");
    }
    
    public void moneyWon() {
        System.out.println("10,000$");
    }   
    public void titlesWon() {
        System.out.println("5");
    }     
}
    class raceHorse extends Horse {
        public void name() {
        System.out.println("Name3");
    
    }
    public void birthYear() {
        System.out.println("2010");
    }
    public void fastestTime() {
        System.out.println("5 Minutes");
    }
    public void moneyWon() {
        System.out.println("2,000$");
    }      
}

public class HorseTest {       
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.name();
        h1.birthYear();
        raceHorse h2 = new raceHorse();
        h2.name();
        h2.birthYear();
        h2.fastestTime();
        h2.moneyWon();
        showHorse h3 = new showHorse();
        h3.name();
        h3.birthYear();
        h3.moneyWon();
        h3.titlesWon();
    }
    

}

