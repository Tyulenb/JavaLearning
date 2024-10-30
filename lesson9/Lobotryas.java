package lesson9;

public class Lobotryas<T> implements Cloneable{
    private T val;

    public Lobotryas(T val){
        this.val = val;
    }

    public void setVal(T val) {
        this.val = val;
    }

    public T getVal() {
        return val;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void clear(){
        this.val = null;
    }

    public Lobotryas<String> concatenate(Lobotryas<String> str){
        if(val instanceof String){
            return new Lobotryas<String>((String)val+str.getVal());
        }
        return null;
    }

    public Lobotryas<Integer> add(Lobotryas<Integer> a){
        if(val instanceof Integer){
            return new Lobotryas<Integer>((Integer)val+a.getVal());
        }
        return null;
    }

    public Lobotryas<Integer> sub(Lobotryas<Integer> a){
        if(val instanceof Integer){
            return new Lobotryas<Integer>((Integer)val-a.getVal());
        }
        return null;
    }

    public Lobotryas<Integer> mul(Lobotryas<Integer> a){
        if(val instanceof Integer){
            return new Lobotryas<Integer>((Integer)val*a.getVal());
        }
        return null;
    }

    public Lobotryas<Integer> del(Lobotryas<Integer> a){
        if(val instanceof Integer){
            return new Lobotryas<Integer>((Integer)val/a.getVal());
        }
        return null;
    }

    public Lobotryas<Boolean> and(Lobotryas<Boolean> b){
        if(val instanceof Boolean){
            return new Lobotryas<Boolean>((Boolean) val && b.getVal());
        }
        return null;
    }

    public Lobotryas<Boolean> or(Lobotryas<Boolean> b){
        if(val instanceof Boolean){
            return new Lobotryas<Boolean>((Boolean) val || b.getVal());
        }
        return null;
    }


    public Lobotryas<Double> addD(Lobotryas<Double> a){
        if(val instanceof Double){
            return new Lobotryas<Double>((Double)val+a.getVal());
        }
        return null;
    }

    public Lobotryas<Double> subD(Lobotryas<Double> a){
        if(val instanceof Integer){
            return new Lobotryas<Double>((Double)val-a.getVal());
        }
        return null;
    }

    public Lobotryas<Double> mulD(Lobotryas<Double> a){
        if(val instanceof Double){
            return new Lobotryas<Double>((Double)val*a.getVal());
        }
        return null;
    }

    public Lobotryas<Double> delD(Lobotryas<Double> a){
        if(val instanceof Double){
            return new Lobotryas<Double>((Double) val/a.getVal());
        }
        return null;
    }

    @Override
    public String toString() {
        return "Lobotryas{" +
                "val=" + val +
                '}';
    }
}
