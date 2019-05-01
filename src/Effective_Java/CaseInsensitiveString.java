package Effective_Java;

public class CaseInsensitiveString {
    private final String s;

    public CaseInsensitiveString(String s){
        if (s == null)
            throw new NullPointerException();
        this.s = s;
    }

    public boolean equals(Object o){
        if (o instanceof String)
            return s.equalsIgnoreCase((String)o);
        return false;
    }
    static {
        int c = 1;
        System.out.println("initailize");
    }

    public static void main(String[] args){
        CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
        String s = "polish";
        String v = "Polish";
//        System.out.println(c);
        System.out.println(cis.equals(s));
        System.out.println(s.equalsIgnoreCase(String.valueOf(cis)));
        System.out.println(s.equalsIgnoreCase(v));
    }
}
