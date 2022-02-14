public class Rectangle
    {
        private double length;
        private double width;
        public void setRectangle(double length, double width)
        {
            this.length = length;
            this.width  = width;
        }
        public double getArea()
        {
            return length * width;
        }
    }
}
