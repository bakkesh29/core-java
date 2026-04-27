class A{

}
class B extends A{

}
class C extends B{

}

public class Demo {
    public static void main(String[] args) {

        VeryAdvCalac obj = new VeryAdvCalac();
        int r1 =obj.add(12, 44);
        int r2 = obj.sub(19, 01);
        int r3 = obj.div(166, 36);
        int r4 = obj.multi(19, 99);
        double r5 = obj.power(4,2);

        System.out.println(r1+ " "+ r2+ " "+ r3 + " "+r4 + " "+r5);


    }
}
