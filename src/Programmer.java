public class Programmer extends Person {
        private String CompanyName;

    public Programmer(String name, String clothes, String companyName) {
        super(name, clothes);
        this.CompanyName = companyName;
    }

    @Override
    public void learn() {
        System.out.println("Programmer learning java");
    }

    @Override
    public void walk() {
        System.out.println("walking with her friends");
    }

    @Override
    public void eat() {
        System.out.println("eating healthy salads");
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "CompanyName='" + CompanyName + '\'' +
                "} " + super.toString();
    }
}


