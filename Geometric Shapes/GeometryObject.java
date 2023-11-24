public abstract class GeometryObject implements Comparable<GeometryObject>{
    double square;
    double scale = 1;
    public abstract double getSquare();
    public abstract void setScale(double Scale);

    @Override
    public int compareTo(GeometryObject o) {
        if(this.getSquare() > o.getSquare()){
            return 1;
        }
        else if(this.getSquare() < o.getSquare()){
            return -1;
        }
        else{
            return 0;
        }
    }

}
