package com.company;

import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    private static int c;

    public static void main(String[] args) throws IOException {




        File file=new File("Alf.txt");
        file.createNewFile();


        FileWriter wr=new FileWriter("Alf.txt");
         wr.write("1:Aa\n2:Bb\n3:Cc\n4:Dd\n5:Ee\n6:Ff\n7:Jj\n8:Hh\n9:Ii\n10:Jj\n11:Kk\n" +
                 "12:Ll\n13:Mm\n14:Nn\n15:Oo\n16:Pp\n17:Qq\n" +
                 "18:Rr\n19:Ss\n20:Tt\n21:Uu\n22:Ww\n23:Xx\n24:Yy\n25:Cc\n26:Zz");
         wr.close();



          FileReader rd=new FileReader("Alf.txt");
          Scanner sc=new Scanner(rd);
          while (sc.hasNext()){
              System.out.println(sc.nextLine());
          }
          rd.close();
    }
        }










