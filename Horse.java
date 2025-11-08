public class horse implements Comparable{  
    
    String name;
    int birthYear;
    
    public Horse(String horseName, int year){ //horse constructor needs its name and birth year.
        name=horseName; //assigns the name of the horse to the horseName which was sent in the construtor.
        birthYear=year; //assigns the year to the birthYear that was sent in the constructor;
    }
    public int compareto(horse h)
    {
        return this.birthYear - h.birthYear;
    }
}

class horse {
    public static void main(String[] args)
    {
        ArrayList<Horse> list
            = new ArrayList<horse>();  
        list.add(new horse("name1", 2008));
        list.add(new horse("name2", 2010));
        list.add(new horse("name3", 2000));
        list.add(new horse("name4", 1999));
        list.add(new horse("name5", 2003));
        list.add(new horse("name6", 1998));
        list.add(new horse("name7", 2014));
        list.add(new horse("name8", 2019));
        list.add(new horse("name9", 1994));
        list.add(new horse("name10", 2006));

        Collections.sort(list); 

        for (horse h : list)
            System.out.println(h.name + " " + h.birthYear);
    }
}