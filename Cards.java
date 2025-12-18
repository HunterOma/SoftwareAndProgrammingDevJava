class Cards {
    String suite;
    int value;


    public Cards(String suite int value);
    {
        this.suite = suite;
        this.value = value;
    }
    public void number(String number) {
        System.out.println(number);
    }

}   
 class Spades extends Cards {

    public Spades(int value) {
        super(suite: "Spades", value);
    }
  
}
    class Hearts extends Cards {
        public Hearts(int value) {
            super(suite: "Hearts", value);
    }
    }

    class Clubs extends Cards {
        public Clubs(int value) {
            super(suite: "Clubs", value);
    }
    }
  
    class Diamonds extends Cards {
        public Diamonds(int value) {
            super(suite: "Diamonds", value);
    }
 
    }