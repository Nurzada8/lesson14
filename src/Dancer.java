public class Dancer extends Person {

        public Dancer(String name, String clothes) {
            super(name, clothes);
        }
        public void dancing(){
            System.out.println("dancing in the studio");
        }
        @Override
        public void learn() {
            System.out.println("learning new dance");
        }
        @Override
        public void walk() {
            System.out.println("walking at the street");
        }
        @Override
        public void eat() {
            System.out.println("eating breakfast");
        }

        @Override
        public String toString() {
            return "Dancer{} " + super.toString();
        }
    }

