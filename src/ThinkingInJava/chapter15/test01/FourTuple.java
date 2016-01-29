package ThinkingInJava.chapter15.test01;

/**
 * Created with IntelliJ IDEA.
 * User: asus
 * Date: 16-1-28
 * Time: 下午11:36
 * To change this template use File | Settings | File Templates.
 */
public class FourTuple<A,B,C,D>extends ThreeTuple<A,B,C> {
    public final D fourth;
    public FourTuple(A a, B b, C c,D d) {
        super(a, b, c);
        fourth = d;
    }
    public String toString(){
        return "("+first+","+last+"," +","+third+","+fourth+")";

    }
}
