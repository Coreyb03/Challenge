import java.util.*;


public class Points {
    double x;
    double y;

    public Points(){
        x = 0;
        y = 0;
    }

    public Points(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(Points point){
        return x;
    }
    public double getY(Points point){
        return y;
    }

    public String toString(){
        return "(" + x + "," + y + ")";
    }


    public double distanceFromOrigin(Points point){
        return (Math.abs(0 - point.getX(point)) + Math.abs(0 - point.getY(point) ) );
    }

    public static ArrayList<Points> createPoints(){
        Double[] array = {0.0,0.0,-1.0,99.0,50.0,75.5,-4.0,66.0};
        ArrayList<Double> doubleList = new ArrayList<Double>();
        doubleList.addAll(Arrays.asList(array));
        ArrayList<Points> pointsList = new ArrayList<Points>();

        for(int i =0;i < doubleList.size() - 1; i++){
            Points points = new Points(doubleList.get(i),doubleList.get(i+1));
            pointsList.add(points);
        }
        return pointsList;
    }

    public static ArrayList<Points> midpoints(){
        ArrayList<Points> pointsList = createPoints();
        for (int i = 0; i < pointsList.size() -1; i++){
            double x1 = pointsList.get(i).getX(pointsList.get(i));
            double x2 = pointsList.get(i+1).getX(pointsList.get(i+1));
            double y1 = pointsList.get(i).getY(pointsList.get(i));
            double y2 = pointsList.get(i+1).getY(pointsList.get(i+1));

            double midX = (x1 + x2)/2;
            double midY = (y1 + y2)/2;
            Points midpoint = new Points(midX,midY);

            pointsList.add(i+1,midpoint);
            i++;
        }
        return pointsList;
    }

    public static ArrayList<Points> originSort(){
        ArrayList<Points> pointsList = createPoints();

        for (int i = 1; i < pointsList.size(); i++) { 
            Points temp = pointsList.get(i); 
            int j = i - 1; 
            while (j >= 0 && pointsList.get(j).distanceFromOrigin(pointsList.get(j)) > temp.distanceFromOrigin(temp)){ 
                pointsList.set(j + 1,pointsList.get(j)); 
                j = j - 1; 
            } 
            pointsList.set(j + 1,temp); 
        }

        return pointsList;
    }
}
