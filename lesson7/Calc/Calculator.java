package lesson7.Calc;

import lesson7.pow.Power;
import lesson7.bin.Binary;
import lesson7.sum.Sumator;
import lesson7.sub.Subtractor;
import lesson7.hex.Hexagon;
import lesson7.tetr.Tetration;

public class Calculator {
    public long Sum(long a, long b){
        return Sumator.sum(a,b);
    }
    public double Sum(double a, double b){
        return Sumator.sum(a,b);
    }
    public double Sum(double a, long b){
        return Sumator.sum(a,b);
    }
    public double Sum(long a, double b){
        return Sumator.sum(a,b);
    }

    public long Sub(long a, long b){
        return Subtractor.sub(a,b);
    }
    public double Sub(double a, double b){
        return Subtractor.sub(a,b);
    }
    public double Sub(double a, long b){
        return Subtractor.sub(a,b);
    }
    public double Sub(long a, double b){
        return Subtractor.sub(a,b);
    }

    public long Pow(long a, long b){
        return Power.pow(a, b);
    }
    public double Pow(double a, long b){
        return Power.pow(a,b);
    }

    public long Tetr(byte a, byte b){
        return Tetration.tetr(a,b);
    }

    public String Bin(long a){
        return Binary.bin(a);
    }

    public String Hex(long a){
        return Hexagon.hex(a);
    }
}
