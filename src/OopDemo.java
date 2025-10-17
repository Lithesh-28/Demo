public abstract class OopDemo{
    abstract int area();
}

class Rectangle extends OopDemo{

    int l;
    int w;

    public Rectangle(int l, int w){
        this.l=l;
        this.w=w;
    }
    @Override
    int area() {
        return l*w ;
    }
}

class Square extends OopDemo{
    int s;

    public Square(int s){
        this.s=s;
    }

    @Override
    int area() {
        return s*s ;
    }
}
