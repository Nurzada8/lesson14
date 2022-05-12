public class Person {
        private String name;
        private  String clothes;


        public void learn(){
            System.out.println("learning English");
        }
        public void walk(){
            System.out.println("walking in a garden");
        }
        public void eat(){
            System.out.println("eating lunch");
        }
        public Person(String name, String clothes) {
            this.name = name;
            this.clothes = clothes;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", clothes='" + clothes + '\'' +
                    '}';
        }
    }

