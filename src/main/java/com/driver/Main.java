package com.driver;

public class Main {
  
  public static class Product{

        public int product(int x,int y){
            return x*y;
        }
        public int product(int x,int y,int z){
            return x*y*z;
        }
        public double product(double x,double y){
            return x*y;
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Product pd=new Product();


        pd.product(1,2);
        pd.product(1,2,3);
        pd.product(1.2,1.4);



    }

}
