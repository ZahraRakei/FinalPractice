public class Shortest {

    public String min(String a, String b, String c){
        String min = "";
        if (a.compareTo(b)<0 && b.compareTo(c)<0){
            min= a;
        }
        if (b.compareTo(a)<0 && b.compareTo(c)<0){
            min= b;
        }
        if (c.compareTo(a)<0 && c.compareTo(b)<0){
            min= c;
        }
        if (a.compareTo(b)<0 && c.compareTo(a)<0){
            min = c;
        }
        if (b.compareTo(a)<0 && c.compareTo(b)<0){
            min=c;
        }
        if (b.compareTo(c)<0 && b.compareTo(a)>0){
            min = a;
        }
        return min;
    }
}
