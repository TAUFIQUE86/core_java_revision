
class Costomer{
    private int cid;
    private  String cname;
    private long cnum;
//// S p
//    public void setData(int cid, String cname, long cnum){
//        this.cid =cid;
//        this.cname =cname;
//        this.cnum = cnum;
//
//    }
//     public int getCid(){
//        return  cid;
//     }
//    public String getCname(){
//        return  cname;
//    }
//    public long getCnum(){
//        return  cnum;
//    }

 public  Costomer(){
cid=2;
cname="lata";
cnum=7897l;

 }

  public Costomer(long cid){
    this();
    this.cnum=cnum;

  }

    public Costomer(int cid, String cname, long cnum) {
     this(cnum);

    }

    public int getCid() {
        return cid;
    }

    public String getCname() {
        return cname;
    }

    public long getCnum() {
        return cnum;
    }


    /*class Customer {
    private int cid;
    private String cname;
    private long cnum;

    // Default constructor
    public Customer() {
        this.cid = 2;
        this.cname = "lata";
        this.cnum = 7897L;
    }

    // Constructor with only cid
    public Customer(long cnum) {
        this();            // call default constructor first
        this.cnum = cnum;  // now override cnum
    }

    // Full constructor
    public Customer(int cid, String cname, long cnum) {
        this.cid = cid;
        this.cname = cname;
        this.cnum = cnum;
    }

    public int getCid() { return cid; }
    public String getCname() { return cname; }
    public long getCnum() { return cnum; }
}
*/
}


public class Custome1{
    static void main(String[] args) {
        Costomer c = new Costomer(1,"raj",233l);

        System.out.println(c.getCid());
        System.out.println(c.getCname());
        System.out.println(c.getCnum());

    }
}
