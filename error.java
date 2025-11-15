class error{

  public static void main(String[] args) {

try

{

System.out.println(12/0);

    }
        catch(ArithmeticException e) {
            System.out.println ("Can't divide a number by 0");
        }
    }


    try 
    {
        int num = Integer.parseInt ("Test");

        System.out.println(num);
    }
    catch(NumberFormatException e) {
        System.out.println("Number Format Error");
    }

}
