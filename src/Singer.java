public class Singer extends Person {
        public Singer(String name, String clothes) {
            super(name, clothes);
        }
        public void playGitar(){
            System.out.println("playing Gitar for his fans");
        }
        public void singing(){
            System.out.println("singing a song My Sincere Soul");
        }
        @Override
        public void learn() {
            System.out.println("learning new songs");
        }


        @Override
        public void walk() {
            System.out.println("walking near the home");
        }

        @Override
        public void eat() {
            System.out.println("eating plov");
        }

        @Override
        public String toString() {
            return "Singer{} " + super.toString();
        }
    }


