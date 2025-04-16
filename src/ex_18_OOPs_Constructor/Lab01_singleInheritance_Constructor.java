package ex_18_OOPs_Constructor;


    class MobilePhone1 {
        String name = "Iphone";
        int model = 16;
        double price = 1200.00;

        void display() {
            System.out.println("moble details =" + name + model + price);
        }
    }

        class MobilePhone2 extends MobilePhone1 {
            void perfectPhone() {
                System.out.println("\"This is good phone\"");
            }
        }

        public class Lab01_singleInheritance_Constructor {
            public static void main(String[] args) {
                MobilePhone1 n = new MobilePhone1();
                MobilePhone2 n1 = new MobilePhone2();
                n.display();
                n1.perfectPhone();
            }
        }


