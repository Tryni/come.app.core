package come.app.core.ch01.app01.init;
public class Main {

    public static void main(String[] args) {
        System.out.println("\t---------String");
        String str = null;
        //str.length();
        String x = "";
        String y = "A";
        String z = x + y + " Data";
        System.out.println(z);
        String z2 = z.toUpperCase();
        System.out.println(z2);
        String z3 = z.toLowerCase();
        System.out.println(z3);
        int n = z3.length();
        System.out.println("Lenght " + n);
        int a = 10;
        int b = 2;
        int c = a + b;
        System.out.println("a + b = " + c);
        System.out.println(a + "+" + b + "=" + c);
        System.out.println(a + b);
        System.out.println("" + a + b);
        System.out.println("" + (a + b));
        System.out.println(a + b + "");
        String DataString = String.format("%s+%s=%s", a, b, a + b);
        System.out.println(DataString);
        c = a - b;
        c = a * b;
        c = a / b;
        c = c + 1;
        c += 1;
        c++;
        c *= 1;
        c--;
        c--;
        --c;
        c--;
        System.out.println(c);
        int value = 1;
        value++;
        System.out.println(value);
        value = 1;
        ++value;
        System.out.println(value);
        value = 1;
        value = value + 1;
        System.out.println(value);
        System.out.println("\t--------------------- here инкремент появляется не сразу а после выполнения программы и зпроса второй раз (велью )");
        value = 1;
        System.out.println(value++);
        System.out.println(value);
        System.out.println("\t ---------------------тут инкрементится быстрее на первом вызове");
        value = 2;
        System.out.println(++value);
        System.out.println(value);
        System.out.println("\t---------Byte -128 till +128");
        byte b1 = 100;
        //b++;
        //++b;
        byte b2 = 100;
        byte b3 = (byte)(b1 + b2);
        System.out.println("byte sum =" +b3);
        System.out.println("byte MAX =" +Byte.MAX_VALUE);
        System.out.println("byte MIN =" +Byte.MIN_VALUE);
        System.out.println("Byte Max +1 =" +(byte)(Byte.MAX_VALUE+128));
        System.out.println("Byte 200 =" +(byte)(200));
        System.out.println("\t-------Short");
        short sh1=10;
        sh1++;
        System.out.println(sh1);
        short sh2=20;
        short sh3=(short)(sh1+sh2);
        System.out.println(sh3);
        System.out.println("\t---------Long");
        long valueA=10;
        valueA++;
        long valueB=20;
        long valueC= valueA+valueB;
        System.out.println(valueC);
        System.out.println("---------------------");
        byte byteValue=127;
        short shortValue=10000;
        int intValue=90000000;
        long resLong= byteValue+shortValue+ intValue;
        System.out.println(resLong);
        byte byteRes=(byte)(shortValue+ intValue);
        System.out.println(byteRes);
        System.out.println("\t--------------Boolen");
        boolean booleanA=true;
        boolean booleanB=false;
        //or
        boolean booleanRes=booleanA||booleanB;
        System.out.println(booleanRes);
        //and
        booleanRes=booleanA&&booleanB;
        System.out.println(booleanRes);
        //one true one false
        booleanRes=booleanA^booleanB;
        System.out.println(booleanRes);
        System.out.println("\t----------Float");
        float floatA=1;
        System.out.println(floatA);
        floatA=floatA*3;
        //флоат воспринимается как дабл если с точкой
        floatA=(float)1.2;
        //второй вариант напсиание дабла
        floatA=1.3f;
        System.out.println(floatA);
        System.out.println("\t-------Double");
        double doubleA=1;
        System.out.println(doubleA);
        String parameterA="123";
        String parameterB="345";
        //преобразования в цифры byte
        byte byteParameterA=Byte.parseByte(parameterA);
        byte byteParameterB=Byte.parseByte(parameterB);
        //in short
        short shortParameterA = Short.parseShort(parameterA);
        short shortParameterB = Short.parseShort(parameterB);

        int intParameterA = Integer.parseInt(parameterA);
        int intParameterB = Integer.parseInt(parameterB);

        long longParameterA = Long.parseLong(parameterA);
        long longParameterB = Long.parseLong(parameterB);

        String res=Integer.toString(1);
        res=1+"";

        float floatParameterA = Float.parseFloat(parameterA);
        float floatParameterB = Float.parseFloat(parameterB);

        double doubleParameterA = Double.parseDouble(parameterA);
        double doubleParameterB = Double.parseDouble(parameterB);

        boolean booleanParameterA = Boolean.parseBoolean("true");
        boolean booleanParameterB = Boolean.parseBoolean("false");





    }
}