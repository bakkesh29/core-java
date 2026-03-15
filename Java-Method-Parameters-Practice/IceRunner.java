public class IceRunner {

    public static void main(String[] args) {

        Ice.details(5,10,-5,true,'A');

        int weight = 4;
        int cubes = 8;
        int temp = -3;
        boolean frozen = true;
        char quality = 'B';

        Ice.details(weight,cubes,temp,frozen,quality);

        if(weight > 0 && cubes > 0){
            System.out.println("Valid Ice Details");
        }
        else{
            System.out.println("Invalid Ice Details");
        }

    }

}