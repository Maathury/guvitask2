import java.util.Scanner;

public class Product {
    int pid;
    int price;
    int quantity;

    public Product(int pid, int price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }
}

  class Xyz {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Product[] products = new Product[5];
            int highestPrice = 0;
            int n = 1;

            int productId = 0;
            for (int i = 0; i < 5; i++) {
                System.out.println("Enter the product id " + n + " :");
                int pid = sc.nextInt();
                System.out.println("Enter the product price :");
                int price = sc.nextInt();
                System.out.println("Enter the product quantity :");
                int quantity = sc.nextInt();

                //find id of highest price

                if (price > highestPrice) {
                    highestPrice = price;
                    productId = pid;
                }
                products[i] = new Product(pid, price, quantity);
                n++;
            }

            System.out.println("product Id with highest price :" + productId + " and its price is" + highestPrice);
            System.out.println("Total amount spend on single product :" + totalAmount(products));


        }


    public static int totalAmount(Product products[]) {
        int total=0;
        for(int i=0;i<5;i++) {
            total = products[i].price * products[i].quantity;
        }
        return total;
    }
}





