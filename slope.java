class slope
{
    int x1,y1,x2,y2;
    slope(int x1,int y1,int x2,int y2)
    {
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
    }
    void calaculate_slope()
    {
        int slopes;
        slopes=(y2-y1)/(x2-x1);
        System.out.println(slopes);

    }
    public static void main(String[] args) {
        int x1=10;
        int y1=20;
        int x2=10;
        int y2=12;
        slope ob=new slope(x1,y1,x2,y2);
        ob.calaculate_slope();

    }

}
