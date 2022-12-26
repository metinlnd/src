package day21_Aray;

public class Items {
    public static void main(String[] args) {


        String [] items= {"shoes", "jacke","gloves"};
        double[] prices= {99.99,150,30};
        int[] itesmID= {12345,254875,125478};


        /* ITEMNAME ITEMID PRICE;


         */


        for (int i = 0; i < items.length; i++) {


            String item= items[i];
            double price=prices[i];
            int id= itesmID[i];


            System.out.println(item + " " + price+" "+id);

        }










    }
}
