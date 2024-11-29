public class Nloop {
    public static void main(String[] args) {
        /*  for(int x=5;x<=125;x=x*5)
        {
            for(int y=1;y<=3;y=y+2)
            {
                System.out.print("hy");
            }
            System.out.println();
    }*/
    //  write a prigram to print AAAA
    //                           AAAA
    /*for(int x=1;x<=2;x++)
    {
        for(int y=1;y<=4;y++)
        {
            System.out.print(  'A');
        }
        System.out.println();
    }*/
    // write a program to print 11111
    //                          11111
    //                          11111
/*for(int x=1;x<=3;x++)
{
    for(int y = 1; y<=5;y++)
    {
        System.out.print(1);
    }
    System.out.println();
}*/
//write a program to print **
//                         **
//                         **
/*for(int x =1;x<=3;x++)
{
    for(int y=1;y<=2;y++)
    {
        System.out.print('*');
    }
    System.out.println();
}*/
// write a program to print ###
//                          ###
//                          ###
  /*for(int x=1;x<=3;x++)
  {
    for(int y = 1; y<=3;y++)
    {
        System.out.print('#');
    }
    System.out.println();
  } */
 // write a program to print 000
 //                          000
 //                          000
 /*for(int x= 1;x<=3;x++)
 {
    for(int y =1; y<=3;y++)
    {
        System.out.print(0);
    }
    System.out.println();
 } */
  // write a progrma to print AAAA
  //                          BBBB
  //                          CCCC
  /*for(char i ='A';i<='C';i++)
  {
    for(char y = 'A';y<='C';y++)
    {
 
        System.out.print(i);
    }
    System.out.println();
  }*/
  // write a progrma to print 1111
  //                          2222
  //                          3333
  /*for(int x=1;x<=3;x++)
  {
    for(int y=1;y<=3;y++)
    {
        System.out.print(x);
    }
    System.out.println();
  }*/
  //write a program to print ZZZ
  //                         YYY
  /*for (char i = 'Z'; i <= 'Z'; i++) { // Outer loop (only one row for 'Z')
            for (char x = 0; x < 3; x++) { // Inner loop to print three 'Z'
                System.out.print(i);
            }
            System.out.println(); // Move to the next line
        }

        // Print YYY pattern
        for (char i = 'Y'; i <= 'Y'; i++) { // Outer loop (only one row for 'Y')
            for (char x = 0; x < 3; x++) { // Inner loop to print three 'Y'
                System.out.print(i);
            }
            System.out.println();*/
 // write a program to print 55
 //                          44
 //                          33
 //                          22
 /*for (char i = '5'; i >= '2'; i--) 
 {
    for (int y = 0; y < 2; y++)
    {
        System.out.print(i);
    }
    System.out.println();         

  }*/
  // write a program to print ABC
  //                          ABC
  //                          ABC
  //                          ABC
  /*for (char i = 'A'; i <= 'D'; i++) 
  {
    for (char j = 'A'; j <= 'C'; j++) 
    {
        System.out.print(j); 
    }
    System.out.println(); 
}*/
//write a program to print 1234
//                         1234
/*for (int i = 1; i <= 2; i++) 
{
    // Inner loop to print numbers from 1 to 4
    for (int j = 1; j <= 4; j++) {
        System.out.print(j); // Print the numbers 1, 2, 3, 4
    }
    System.out.println(); // Move to the next line after each row
}*/
//write a program to print zyx
//                         zyx
//                         zyx
/*for (int i = 1; i <= 3; i++) 
{
    // Inner loop to print "zxy" in each row
    System.out.print("z");
    System.out.print("x");
    System.out.print("y");
    System.out.println(); // Move to the next line after printing "zxy"
}*/
// write a program print 54321
//                       54321
//                       54321
//                       54321
// Outer loop for printing rows (4 rows in this case)
/*for (int i = 1; i <= 4; i++) {
    // Inner loop to print numbers from 5 to 1
    for (int j = 5; j >= 1; j--) {
        System.out.print(j); // Print the number
    }
    System.out.println(); // Move to the next line after printing 54321
}*/
// write the program to print 12345
//                            678910
//                            1112131415
/*int num = 1; // Starting number

// Outer loop for the rows
for (int i = 1; i <= 3; i++) {
    // Inner loop to print 5 numbers in each row
    for (int j = 1; j <= 5; j++) {
        System.out.print(num); // Print the current number
        num++; // Increment the number after printing
    }
    System.out.println(); // Move to the next line after printing
}*/
// write a program to print ABC
//                          DEF
//                          GHI
char ch = 'A'; // Start from character 'A'

        // Outer loop for the rows (3 rows in this case)
        for (int i = 1; i <= 3; i++) {
            // Inner loop to print 3 characters in each row
            for (int j = 1; j <= 3; j++) {
                System.out.print(ch); // Print the current character
                ch++; // Move to the next character
            }
            System.out.println(); // Move to the next line after each row
        }

}
}

    

