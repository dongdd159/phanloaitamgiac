public class TriangleClassifier {
    private double a;
    private double b;
    private double c;
    public TriangleClassifier() {
    }
    public TriangleClassifier(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c = c;
    }
    public boolean checkSum(){
        return (a<b+c)&&(b<a+c)&&(c<a+b);
    }
    public boolean checkSub(){
        return (a>b-c)&&(b>a-c)&&(c>a-b)&&(a>c-b)&&(b>c-a)&&(c>b-a);
    }
    public boolean isTriangle(){
        if (checkSub()&&checkSum()){
            return true;
        }else {
            return false;
        }
    }
    public String classify(){
        if (a==b&&a==c){
            return "Tam giác đều";
        }else if (a==b||a==c||b==c){
            return "Tam giác cân";
        }else {
            return "Tam giác thường";
        }
    }
    public String display(){
        if (isTriangle()){
            return "tạo thành "+classify();
        }else {
            return "không tạo thành 1 tam giác";
        }
    }
    @Override
    public String toString() {
        return "3 cạnh " + a +", "+ b +", "+ c+" ";
    }
}
