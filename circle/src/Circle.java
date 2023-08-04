public class Circle {
    private float radius;

    public Circle(){
        radius = 0;
    }
    public void setRadius(float radius) {
        this.radius = radius;
    }
    public void area(){
        float areaOfCircle = (float) (Math.PI * radius * radius);
        System.out.println("The area of circle is : "+areaOfCircle);
    }
    public void circum(){
        float circum = (float) (2 * Math.PI * radius);
        System.out.println("The circuference of circle is : "+circum);
    }

}
