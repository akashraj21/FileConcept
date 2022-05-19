import java.io.*;

import java.util.Scanner;

public class FileConcept {

    static  int no=1;

    String S_name[]=new String[10];

    int Reg_no[]=new int[10];

    String Dept[]=new String[10];


    public void StoreFile(int n) throws IOException {

        Scanner sc=new Scanner(System.in);

        for(int i=0;i<n;i++){

            System.out.println("Enter the Student Name: ");

            S_name[i]=sc.next();

            System.out.println("Enter the Student Reg_No: ");

            Reg_no[i]=sc.nextInt();

            System.out.println("Enter the Department Name: ");

            Dept[i]=sc.next();

        }

        System.out.println("Data Stored Successful");

        File f=new File("C:\\Users\\Administrator\\Desktop\\ClassWorks\\FileConcept_1\\Data.txt");

        if(f.exists()){

            System.out.println("File Exists");

            FileWriter fw=new FileWriter(f);

            PrintWriter pw=new PrintWriter(fw);

            pw.println("---------ZOHO SCHOOL---------");

            pw.println("_____________________________");

            pw.println("No REG_NO   NAME   DEPARTMENT");

            pw.println("-----------------------------");

            for(int i=0;i<n;i++){

                pw.println(no+"|"+"   "+Reg_no[i]+"      "+S_name[i]+"    "+Dept[i]);

                no++;

            }

            pw.println("Total Number of Students: "+(no-1));

            pw.close();

        }

        else{

            System.out.println("File Does not Exists");

        }


    }
    static void ReadFile() throws IOException {

        FileReader filereader = new FileReader("C:\\Users\\Administrator\\Desktop\\ClassWorks\\FileConcept_1\\Data.txt");
        int i;
        while ((i = filereader.read()) != -1)
            System.out.print((char)i);
    }

    public static  void main(String[] args) throws IOException {

        FileConcept fc=new FileConcept();

        Scanner sc=new Scanner(System.in);

        System.out.print("Number of Students Want To Add: ");

        int n=sc.nextInt();

        fc.StoreFile(n);
        fc.ReadFile();

    }

}
