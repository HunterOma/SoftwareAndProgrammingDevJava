//Simple horse class created by Kim Gross
//for CTE Software Development class 2022

public class Horse {
    String name = "horse1";
    int birthYear = 2010;//year the horse was born
    String[] names = "horse1.5";
    int numberofNames1=1; //how many old names are there.
    public Horse(String horseName, int year){ //horse constructor needs its name and birth year.
        name=horseName; //assigns the name of the horse to the horseName which was sent in the construtor.
        birthYear=year; //assigns the year to the birthYear that was sent in the constructor;
    }
 String name2 = "horse2";
    int birthYear2 = 2005;
    int numberofNames2=0; 
    public Horse2(String horseName2, int year2){
        name2=horseName2;
        birthYear2=year2;
    }
    String name3 = "horse3";
    int birthYear3 = 2015;
    String[] names3 = "horse3.5";
    int numberofNames3=1;
    public Horse3(String horseName3, int year3){
        name3=horseName3;
        birthYear3=year3;
    }





    };
    
    public void age (){
       age=subtractExact(birthYear, 2025)
       
        // what should be in a age function?
    }; 
    public void changeName (String newName){//change the name but save the old name
        names[numberofNames]=name;
        numberofNames++;
        name=newName;
    };
    public String toString (){
        return name;
    };    
}
