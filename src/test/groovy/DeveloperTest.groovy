import spock.lang.Specification
import test.Developer

class DeveloperTest extends Specification {

    void m1Test() {
        String S = "i am java developer"
        given:
        Developer m = new Developer();

        when:
        m.m1()

        then:

        S == "i am java developer"
    }
}