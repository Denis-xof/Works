public class Vectors {
   private double x;
   private double y;
   private double z;
   public Vectors(double x, double y, double z){
        this.x=x;
        this.y=y;
        this.z=z;
   }
   public  double length(){
       return Math.sqrt(x * x + y * y + z * z);
   }
    public double scalarPproduct(Vectors vectors){
      return x*vectors.x+ y*vectors.y+ z*vectors.z;
    }

    public Vectors vectorProduct(Vectors vectors){
       return new Vectors(y*vectors.z-z*vectors.y,z*vectors.x-x*vectors.z,x*vectors.y-y*vectors.x);
    }
    public double cos(Vectors vectors){
       return (scalarPproduct(vectors)/(vectors.length() * length()));
    }
    public Vectors sum(Vectors vectors){
       return new Vectors(x+vectors.x,y+vectors.y,z+ vectors.z);
    }
    public Vectors diff(Vectors vectors){
       return new Vectors(x- vectors.x,y- vectors.y,z- vectors.z);
    }
     public static Vectors[] generate(int n){
        Vectors[] vectors = new Vectors[n];
        for (int i=0;i<n;i++){
            vectors[i]=new Vectors(Math.random(),Math.random(),Math.random());
        }
        return vectors;
     }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
