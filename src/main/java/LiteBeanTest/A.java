package LiteBeanTest;

public class A {

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+ "  "+this.hashCode();
    }
}
