

public class Sample {

    String a = new String("This is my sentence");
    String b = new String("This is my sentence");


    public boolean checkEquality(){
        return a == b;
    }

    public boolean checkIdentity(){
        return a.equals(b);
    }

    public int countLetters(){
        int i;
        for(i= 0 ; i< a.length(); i++){
            System.out.println(i);
        }
        return i;
    }


}
