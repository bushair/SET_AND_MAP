package com.lambton;
import java.util.*;

public class collectionFrameworkExample {
    public static void main(String[] args) {
        ArrayList<String> mStringArrayList = new ArrayList<>();
        mStringArrayList.add("A");
        mStringArrayList.add("B");
        mStringArrayList.add("C");
        mStringArrayList.add("C");
        mStringArrayList.add("A");
        mStringArrayList.add("A");
       // System.out.println(mStringArrayList);
       // for (int i = 0; i < mStringArrayList.size(); i++)
        //{
         //   System.out.print(mStringArrayList.get(i).toString());
       // }

        for(String s:mStringArrayList)
        {
            System.out.println(s);
        }
        //SET
        Set<String>mySet=new HashSet<>();
        mySet.add("INDIA");
        mySet.add("CHINA");
        mySet.add("USA");
        mySet.add("CANADA");
        System.out.println(mySet);

        //MAP

        Map<String,String> StringMap=new HashMap<>();
        StringMap.put("IND","INDIA");
        StringMap.put("CAD","CANADA");
        StringMap.put("USA","UNITED STATE");
        StringMap.put("PAK","PAKISTAN");
        System.out.println(StringMap);






    }
}
