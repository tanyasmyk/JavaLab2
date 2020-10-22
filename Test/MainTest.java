import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    Main main;


    @BeforeEach
    void setUp()
    {
        main=new Main();
    }



    @Test
    void testCalculateYEqual() {
        double expected =3.72;
        double rez=main.calculateY(1.4);
        assertEquals(expected,rez,0.001);

    }
    @Test
    void testCalculateYLess() {
        double expected =7.672;
        double rez=main.calculateY(1.2);
        assertEquals(expected,rez,0.001);

    }
    @Test
    void testCalculateYMore() {
        double expected =1.303;
        double rez=main.calculateY(1.5);
        assertEquals(expected,rez,0.001);

    }

    @Test
    void testCountOfSteps() {
        double expected =1001;
        double rez=main.countOfSteps(0, 2, 0.002);
        assertEquals(expected,rez,0.001);
    }


    @Test
    void testFillX() {
        main.fillX(0,2,0.002);
        assertEquals(0.006,main.x[3],0.000001);
    }


    @Test
    void testFillY() {
        main.fillX(main.x1,main.x2,0.002);
        main.fillY(main.x);
        assertEquals(4,main.y[0],0.001);
    }
    @Test
    void testFindMin() {
        main.fillX(main.x1,main.x2,0.002);
        main.fillY(main.x);
        double rez=main.findMin(main.y);

        assertEquals(1000,rez,0.001);
        System.out.printf("index of the minimum array element = %d \n",main.findMin(main.y));

    }
    @Test
    void testFindMax() {
        main.fillX(main.x1,main.x2,0.002);
        main.fillY(main.x);
        double rez=main.findMax(main.y);
        assertEquals(699,rez,0.001);
        System.out.printf("index of the maximum array element  = %d \n",main.findMax(main.y));
    }

    @Test
    void testSumElementArray() {
        main.fillX(main.x1,main.x2,0.002);
        main.fillY(main.x);
        assertEquals(4285.095,main.summArray(main.y),0.001,"sum");
    }
    @Test
    void testMiddleSumElementArray() {
        main.fillX(main.x1,main.x2,0.002);
        main.fillY(main.x);
        assertEquals(4.28,main.midSummArray(main.y),0.001,"sum");
    }

}