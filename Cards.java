class Cards {
    public void name() {
        System.out.println("Name1");
    
    }
    public void birthYear() {
        System.out.println("2000");
    }

}   
 class Spades extends Cards {
    public void number() {
        System.out.println("number");
    }
}
    class Hearts extends Cards {
        public void number() {
        System.out.println("number");     
}
    }
    class Clubs extends Cards {
        public void number() {
        System.out.println("number");     
}
    }
    class Diamonds extends Cards {
        public void number() {
        System.out.println("number");     
}
    }
public class Cardlist {       
    public static void main(String[] args) {
        Spades c1 = new Spades();
        c1.number("1");
        Spades c2 = new Spades();
        c2.number("2");
        Spades c3 = new Spades();
        c3.number("3");
        Spades c4 = new Spades();
        c4.number("4");
        Spades c5 = new Spades();
        c5.number("5");
        Spades c6 = new Spades();
        c6.number("6");
        Spades c7 = new Spades();
        c7.number("7");
        Spades c8 = new Spades();
        c8.number("8");
        Spades c9 = new Spades();
        c9.number("9");
        Spades c10 = new Spades();
        c10.number("10");
    }
    

}
