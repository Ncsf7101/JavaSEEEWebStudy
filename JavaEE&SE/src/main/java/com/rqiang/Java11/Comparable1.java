package com.rqiang.Java11;

class Per2 implements Comparable<Per2>{
    String uname;
    Per2(String name){
        uname = name;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    @Override
    public int compareTo(Per2 o) {
        if(this.uname.charAt(0) > o.getUname().charAt(0)){
            return 1;
        }else if(this.uname.charAt(0) < o.getUname().charAt(0)){
            return -1;
        }else{
            return 0;
        }
    }
}

public class Comparable1 {
    public static void main(String[] args) {
        Per2 per[] = {new Per2("aaa"), new Per2("zzz"), new Per2("ccc"), new Per2("ddd")
                , new Per2("ddd"), new Per2("eee")};
        java.util.Arrays.sort(per);
        for(int i = 0; i < per.length; i++){
            System.out.print(per[i].uname + "、");
        }
    }

}
