package ss15_xu_ly_ngoai_le_va_debug.bai_tap;

public class Triangle {
    private int canhA;
    private int canhB;
    private int canhC;

    public Triangle() {
    }

    public Triangle(int canhA, int canhB, int canhC) throws IllegalTriangleException{
        if (canhA<0||canhB<0||canhC<0||canhA+canhB<canhC||canhA+canhC<canhB||canhB+canhC<canhA){
            throw new IllegalTriangleException();
        }
        this.canhA = canhA;
        this.canhB = canhB;
        this.canhC = canhC;
    }

    public int getCanhA() {
        return canhA;
    }

    public void setCanhA(int canhA) {
        this.canhA = canhA;
    }

    public int getCanhB() {
        return canhB;
    }

    public void setCanhB(int canhB) {
        this.canhB = canhB;
    }

    public int getCanhC() {
        return canhC;
    }

    public void setCanhC(int canhC) {
        canhC = canhC;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "canhA=" + canhA +
                ", canhB=" + canhB +
                ", CanhC=" + canhC +
                '}';
    }
}
