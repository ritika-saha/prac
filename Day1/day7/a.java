class b{
    int val;
    b(int s){
        val=s;
    }
}

public class a extends b{
    a(int s) {
        super(s);
        
    }

    public static void main(String[] args){
        b ob=new b(1);
        System.out.println(ob.val);
    }
}
