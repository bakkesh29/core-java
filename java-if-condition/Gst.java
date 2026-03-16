public class Gst {

    static void getPrice(String item){

        if(item == "Food"){
            System.out.println("GST Food : 5%");
            return;
        }

        if(item == "Medicine"){
            System.out.println("GST Medicine : 5%");
            return;
        }

        if(item == "Education"){
            System.out.println("GST Education : 0%");
            return;
        }

        if(item == "Gold"){
            System.out.println("GST Gold : 3%");
            return;
        }

        if(item == "Clothes"){
            System.out.println("GST Clothes : 12%");
            return;
        }

        if(item == "Electronics"){
            System.out.println("GST Electronics : 18%");
            return;
        }

        if(item == "Restaurant"){
            System.out.println("GST Restaurant : 18%");
            return;
        }

        if(item == "Hotel"){
            System.out.println("GST Hotel : 18%");
            return;
        }

        if(item == "Transport"){
            System.out.println("GST Transport : 5%");
            return;
        }

        if(item == "Furniture"){
            System.out.println("GST Furniture : 12%");
            return;
        }

        if(item == "Vehicle"){
            System.out.println("GST Vehicle : 28%");
            return;
        }

        if(item == "Bike"){
            System.out.println("GST Bike : 28%");
            return;
        }

        if(item == "Car"){
            System.out.println("GST Car : 28%");
            return;
        }

        if(item == "Laptop"){
            System.out.println("GST Laptop : 18%");
            return;
        }

        if(item == "Mobile"){
            System.out.println("GST Mobile : 18%");
            return;
        }

        if(item == "AC"){
            System.out.println("GST AC : 28%");
            return;
        }

        if(item == "TV"){
            System.out.println("GST TV : 28%");
            return;
        }

        System.out.println("GST category not found");
    }
}