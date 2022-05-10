package de.exxcellent.challenge.models;

/**
 * Model contains the data and the methods that use this data
 */
public class WeatherModel {


    private double temperatureSpread = 0;

    public double calculateTempSpread(double maxTemp, double minTemp) {

        return temperatureSpread = maxTemp-minTemp;
    }

}


/*
*
*





    //Day,MxT,MnT,AvT,AvDP,1HrP TPcpn,PDir,AvSp,Dir,MxS,SkyC,MxR,Mn,R AvSLP

    //int day = int.fromString(args[0]);
    //double maxTemp = Double.parseDouble(args[1]);
    //double minTemp = Double.parseDouble(args[2]);




    //TODO: Do I need to read them in even if I don't use them?
    //double avT  = Double.parseDouble(args[3]);
    //double avDP  = Double.parseDouble(args[4]);
    //double 1HrPTPcpn  = Double.parseDouble(args[5]);
    //double pDir = Double.parseDouble(args[6]);
    //double avSp = Double.parseDouble(args[7]);
    //double dir = Double.parseDouble(args[8]);
    //double mxS  = Double.parseDouble(args[9]);
    //double skyC = Double.parseDouble(args[10]);
    //double mxR  = Double.parseDouble(args[11]);
    //double mn  = Double.parseDouble(args[12]);
    //double r  = Double.parseDouble(args[13]);
    //double avSLP  = Double.parseDouble(args[14]);

* */