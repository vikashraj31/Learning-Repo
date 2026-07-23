package JavaExamQuestion;
//Plastic manufacturer example: 
//2D sheet and 3D box cost calculation (3D inherits 2D).

class TwoD{
    int lenghth;
    int with;
    int area;
    int cost;

    TwoD(int l, int w){
        this.lenghth=l;
        this.with=w;

        area=this.lenghth*this.with;
        cost=area*20;
        System.out.println("Area is "+area);
    }
}

class ThreeD extends TwoD{
    int volume;
    TherrD(int l , int w, int v){
        super(l,w);
        this.volume=v;

        area=this.
        
    }
    

}

public class PlasticDemo {
public static void main(String[] args) {
    TwoD object = new TwoD(12, 22);

}
    
}
