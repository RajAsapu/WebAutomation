package raj;

/*
 *  byte - 8 bit
byte - 8 bits ( - +)

(1,0)

7 6 5 4 3 2 1 0
1 1 1 1 1 1 1 1
0
1
= 1 + 2 + 4 + 8 + 16 + 32 + 64

= 127

Range is -127 to +127

byte a = 255

int = -neg 0 + pos
    no fractional parts
    short - 2 bytes = 2 * 8 = 16 bits -2^15 to +2^15
    int  - 4 bytes = 4 * 8 = 32 bits  -2^31 to +2^31
    long - 8 bytes = 8 * 8 = 64 bits  -2^63 to +2^63
float = -neg 0 + pos
   fractional part
   float - 4 bytes = 4 * 8 = 32 bits
   double - 8 bytes = 8 * 8 = 64 bits
boolean - 1 bit
        0 or 1
        false true

char  - '*'  & a b 1 3
        'jedkj'

String  - "asndkansk*&(*)*)*)NBJKNKJNKJN"

 */
public class DataTypes {
    static byte a = (byte) -109;
    static short b = 130;
    static int c = 8593;
    static long d = 894582;

    static float e = 29.9f;
    static double f = 34830.403420;
    static boolean h = true;
    static char i = 'j';
    static String j = "asndkansk*&(*)*)*)NBJKNKJNKJN";

    public static void main(String[] args){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(h);
        System.out.println(i);
        System.out.println(j);
    }
}
