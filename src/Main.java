import com.sun.corba.se.spi.orbutil.threadpool.Work;
import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

import java.awt.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Transporter xtreme = new Transporter(2,50,"Transporter Xtreme", Color.black,
                5000,3,400);
        Volvo240 volvo = new Volvo240(2,10, "Volvo", Color.red, 399);
        Saab95 mySaab = new Saab95(4,300,"Saab",Color.black, 850, true);

        xtreme.load(volvo);
        System.out.println(xtreme.getCarLoadedList());

        Workshop<Car> myCarList = new Workshop<>(10);
        Workshop<Saab95>  mySaabList = new Workshop<>(5);
        Workshop<Volvo240> myVolvoList = new Workshop<>(15);

           /** mySaabList.addCar(volvo); **/
           /** myVolvoList.addCar(mySaab); **/
    }
}