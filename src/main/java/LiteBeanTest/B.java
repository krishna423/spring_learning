package LiteBeanTest;

public class B {

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+ "  "+this.hashCode();
    }
}
