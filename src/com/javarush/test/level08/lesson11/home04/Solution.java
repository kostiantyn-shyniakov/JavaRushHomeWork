package com.javarush.test.level08.lesson11.home04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


class Main {
    public static void main(String[] args) throws IOException {
        // put your code here
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String input;
        String key=null;
        String listKey=null;
        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();
        do{
            input=br.readLine();
            String[] keyParts=input.split("\t");
            String[] listParts=keyParts[1].split(":");
            if (key!=null)
            {
                if (keyParts[0].equals(key))
                {
                    if (listParts[0].equals(listKey))
                    {
                        list1.add(listParts[1]);
                    }
                    else
                    {
                        list2.add(listParts[1]);
                    }
                }
                else
                {
                    if (!list2.isEmpty()) {
                    for (int i=0;i<list1.size();i++) {
                        for (int j=0;j<list1.size();j++) {
                            System.out.println(key+"\t"+list1.get(i)+"\t"+list2.get(j));
                        }
                    }
                    }
                    list1.clear();
                    list2.clear();
                    key=keyParts[0];
                    listKey=listParts[0];
                    list1.add(listParts[1]);
                }
            }
            else
            {
                key=keyParts[0];
                listKey=listParts[0];
                list1.add(listParts[1]);
            }

        }while (br.ready());

        if (!list2.isEmpty()) {
            for (int i=0;i<list1.size();i++) {
                for (int j=0;j<list1.size();j++) {
                    System.out.println(key+"\t"+list1.get(i)+"\t"+list2.get(j));
                }
            }
        }

    }
}
