package Effective_Java;

import java.util.Collections;
import java.util.*;


public class test {
    public static void main(String[] args) {
        boolean b = false;
        System.out.println(valueOf(b));
        Map<String, List<String>> list = new HashMap();
        List<String> supplierNames1 = new ArrayList<String>();
        supplierNames1.add("1111");
        list.put("1", supplierNames1);
        System.out.println(list.get("1"));
    }

    public static Boolean valueOf(boolean b) {
        return b ? Boolean.TRUE : Boolean.FALSE;
    }

}
