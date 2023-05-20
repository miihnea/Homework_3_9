import java.util.ArrayList;
import java.util.List;

public class MultipleAreas {

    private List<Shape> shapeList;

    public MultipleAreas(){
        shapeList = new ArrayList<Shape>();
    }

    public void addShape(Shape e){
        this.shapeList.add(e);
    }
    public void removeShape(Shape e){
        this.shapeList.remove(e);
    }

    public void computeAreas(){
        for(Shape i : shapeList){
            System.out.println(i.getArea());
        }
    }

}
